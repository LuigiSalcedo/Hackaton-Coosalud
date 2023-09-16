package com.coosalud.hackaton.portal.domain.models.users;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


/**
 *
 * @author Luigi Salcedo
 */
public record CoouserCreatorDto (
        @Valid
        @Email
        @NotNull
        String email,
        
        @Valid
        @NotNull
        String name,
        
        @Valid
        @NotNull
        @Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
        String password
) {

}
