package br.com.rubyrant.controller;

import br.com.rubyrant.domain.community.CommunityDetailsData;
import br.com.rubyrant.domain.post.*;
import br.com.rubyrant.domain.user.UpdateUserData;
import br.com.rubyrant.domain.user.User;
import br.com.rubyrant.domain.user.UserDetailsData;
import br.com.rubyrant.domain.user.UsersListData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    private PostRepository repository;

    @PostMapping
    public ResponseEntity register(@RequestBody @Valid PostRegisterData data, UriComponentsBuilder uri){
        var post = new Post(data);
        repository.save(post);
        var uriBuilder = uri.path("/post/{id}").buildAndExpand(post.getId()).toUri();

        return ResponseEntity.created(uriBuilder).body(new PostDetailsData(post));
    }

    @GetMapping
    public ResponseEntity<Page<PageListData>> listar(@PageableDefault(size = 10, sort = {"id"}) Pageable pageable){
        var page = repository.findAllByActiveTrue(pageable).map(PageListData::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdatePostData data){
        Post post = repository.getReferenceById(data.id());
        post.updateInfo(data);
        return ResponseEntity.ok(new PostDetailsData(post));
    }

    @DeleteMapping("{id}")
    @Transactional
    public  ResponseEntity delete(@PathVariable Long id){
        var post = repository.getReferenceById(id);
        post.delete();
        return ResponseEntity.ok(new PostDetailsData(post));
    }


}
