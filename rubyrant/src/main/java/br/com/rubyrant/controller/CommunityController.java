package br.com.rubyrant.controller;

import br.com.rubyrant.domain.community.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("community")
public class CommunityController {

    @Autowired
    private CommunityRepository repository;

    @PostMapping
    public ResponseEntity register(@RequestBody @Valid CommunityRegisterData data, UriComponentsBuilder uri){
        var community = new Community(data);
        repository.save(community);
        var uriBuilder = uri.path("/community/{id}").buildAndExpand(community.getId()).toUri();

        return ResponseEntity.created(uriBuilder).body(new CommunityDetailsData(community));
    }

    @GetMapping
    public ResponseEntity list(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable){
        var page = repository.findAllByActiveTrue(pageable).map(CommunityListData::new);

        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid UpdateCommunityData data){
        Community community = repository.getReferenceById(data.id());
        community.updateInfo(data);

        return ResponseEntity.ok(new CommunityDetailsData(community)); //corrigir essa bosta
    }

    @DeleteMapping("{id}")
    @Transactional
    public  ResponseEntity delete(@PathVariable Long id){
        var community = repository.getReferenceById(id);
        community.delete();

        return ResponseEntity.ok(new CommunityDetailsData(community));
    }
}
