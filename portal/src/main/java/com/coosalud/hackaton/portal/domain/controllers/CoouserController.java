package com.coosalud.hackaton.portal.domain.controllers;

import com.coosalud.hackaton.portal.domain.models.users.Coouser;
import com.coosalud.hackaton.portal.domain.models.users.CoouserCreatorDto;
import com.coosalud.hackaton.portal.domain.models.users.CoouserResponseDto;
import com.coosalud.hackaton.portal.domain.repositories.CoouserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Luigi Salcedo
 */
@RestController
@RequestMapping("/users")
public class CoouserController {
    
    @Autowired
    private CoouserRepository repository;
    
    @PostMapping("/create")
    @Transactional
    public ResponseEntity saveCoouser(@RequestBody @Valid CoouserCreatorDto data, 
            UriComponentsBuilder uriBuilder) {
        Coouser coouser = repository.save(new Coouser(data));
        
        CoouserResponseDto jsonResponse = new CoouserResponseDto(coouser);
        
        URI url = uriBuilder.path("/user/info/{id}")
                            .buildAndExpand(coouser.getId())
                            .toUri();
        
        return ResponseEntity.created(url).body(jsonResponse);
    }
}
