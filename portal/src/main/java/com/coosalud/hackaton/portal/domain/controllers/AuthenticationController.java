package com.coosalud.hackaton.portal.domain.controllers;

import com.coosalud.hackaton.portal.domain.models.users.CoouserAuthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Local_User
 */
@Controller
@RequestMapping("/login")
public class AuthenticationController {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody CoouserAuthDto authData) {
        Authentication token = new UsernamePasswordAuthenticationToken(authData.id(), authData.password());
        
        authenticationManager.authenticate(token);
        
        return ResponseEntity.ok().build();
    }
}
