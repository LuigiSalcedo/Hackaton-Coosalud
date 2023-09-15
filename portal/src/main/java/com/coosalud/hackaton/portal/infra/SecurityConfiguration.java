package com.coosalud.hackaton.portal.infra;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Luigi Salcedo
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity hs) {
        try {
            return hs.csrf().disable()
                    .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and().build();
        } catch (Exception ex) {
            Logger.getLogger(SecurityConfiguration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration ac) {
        try {
            return ac.getAuthenticationManager();
        } catch (Exception ex) {
            Logger.getLogger(SecurityConfiguration.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
