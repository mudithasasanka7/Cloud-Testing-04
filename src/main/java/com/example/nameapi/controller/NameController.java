// src/main/java/com/example/nameapi/controller/NameController.java
package com.example.nameapi.controller;

import com.example.nameapi.model.Name;
import com.example.nameapi.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/names")
public class NameController {

    @Autowired
    private NameRepository nameRepository;

    @PostMapping
    public Name addName(@RequestBody Name name) {
        return nameRepository.save(name);
    }

    @GetMapping
    public List<Name> getAllNames() {
        return nameRepository.findAll();
    }
}
