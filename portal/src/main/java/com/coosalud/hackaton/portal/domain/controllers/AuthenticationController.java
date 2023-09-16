package com.coosalud.hackaton.portal.domain.controllers;

import com.coosalud.hackaton.portal.domain.models.users.CoouserAuthDto;
import com.coosalud.hackaton.portal.infra.services.TokenService;
import jakarta.validation.Valid;
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
    
    @Autowired
    private TokenService tokenservice;
    
    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid CoouserAuthDto authData) {
        Authentication token = new UsernamePasswordAuthenticationToken(authData.email(), authData.password());
        
        authenticationManager.authenticate(token);
        
        String JWTtoken = tokenservice.generateToken();
        
        return ResponseEntity.ok(JWTtoken);
    }
}
