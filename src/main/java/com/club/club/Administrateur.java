package com.club.club;

import jakarta.persistence.*;


@Entity
@Table(name = "administrateurs")

public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private Long id;
    @Column
    private String username;
    @Column
    private String password;

    public Administrateur() {}

    public Administrateur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

