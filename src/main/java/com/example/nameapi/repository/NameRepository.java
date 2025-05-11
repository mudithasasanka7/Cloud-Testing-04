// src/main/java/com/example/nameapi/repository/NameRepository.java
package com.example.nameapi.repository;

import com.example.nameapi.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
