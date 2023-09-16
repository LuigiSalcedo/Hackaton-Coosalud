package com.coosalud.hackaton.portal.infra.services;

import com.coosalud.hackaton.portal.domain.repositories.CoouserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Local_User
 */
@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private CoouserRepository repository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findUserByEmail(username);
    }    
}
