package com.coosalud.hackaton.portal.infra.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
/**
 *
 * @author Luigi Salcedo
 */
@Service
public class TokenService {
    
    @Bean
    public String generateToken() {
        try {
            Algorithm algorithm = Algorithm.HMAC256("Just-Like-Example");
            return JWT.create()
                      .withIssuer("CooSalud Hackaton").sign(algorithm);
        } catch(JWTCreationException e) {
            throw new RuntimeException();
        }
    }
}
