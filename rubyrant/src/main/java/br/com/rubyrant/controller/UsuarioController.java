package br.com.rubyrant.controller;

import br.com.rubyrant.domain.user.*;
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
@RequestMapping("users")
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity register(@RequestBody @Valid UserRegisterData data, UriComponentsBuilder uri){
        var user = new User(data);
        repository.save(user);

        var uriBuilder = uri.path("/user/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uriBuilder).body(new UserDetailsData(user));
    }

    @GetMapping
    public ResponseEntity<Page<UsersListData>> listar(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        var page = repository.findAllByActiveTrue(pageable).map(UsersListData::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateUserData data){
        User user = repository.getReferenceById(data.id());
        user.updateInfo(data);
        return ResponseEntity.ok(new UserDetailsData(user));
    }

    @DeleteMapping("{id}")
    @Transactional
    public  ResponseEntity delete(@PathVariable Long id){
        var user = repository.getReferenceById(id);
        user.delete();
        return ResponseEntity.ok(new UserDetailsData(user));
    }

}
