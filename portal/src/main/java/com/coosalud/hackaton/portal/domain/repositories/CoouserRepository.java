package com.coosalud.hackaton.portal.domain.repositories;

import com.coosalud.hackaton.portal.domain.models.users.Coouser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luigi Salcedo
 */
public interface CoouserRepository extends JpaRepository<Coouser, Integer>{
    
}
