package com.coosalud.hackaton.portal.domain.repositories;

import com.coosalud.hackaton.portal.domain.models.users.Coouser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Luigi Salcedo
 */
public interface CoouserRepository extends JpaRepository<Coouser, Integer>{
    public UserDetails findUserByEmail();
}
