package com.welldex.apirestwelldex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @ManyToOne
    @JoinColumn(name = "fk_id_role", referencedColumnName = "id_rol", nullable = false)
    private Rol role;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @Column(name = "password", length = 250, nullable = false)
    private String password;

    @Column(name = "delete", nullable = false)
    private Boolean delete;
}

