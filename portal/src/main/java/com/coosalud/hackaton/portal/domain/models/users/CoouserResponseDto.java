package com.coosalud.hackaton.portal.domain.models.users;

/**
 *
 * @author Luigi Salcedo
 */
public record CoouserResponseDto(Integer id, String name, String email) {
    
    public CoouserResponseDto(Coouser coouser) {
        this(coouser.getId(), coouser.getName(), coouser.getEmail());
    }
}
