// src/main/java/com/example/nameapi/model/Name.java
package com.example.nameapi.model;

import jakarta.persistence.*;

@Entity
public class Name {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    public Name() {}

    public Name(String value) {
        this.value = value;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
