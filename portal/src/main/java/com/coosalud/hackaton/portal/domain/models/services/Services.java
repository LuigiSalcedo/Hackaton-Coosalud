package com.coosalud.hackaton.portal.domain.models.services;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author Local_User
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="service")
public class Services {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="code")
    private Integer code;
    @Column(name="description")
    private String description;
}
