package com.ronal.educlass.repository;

import com.ronal.educlass.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClaseRepository extends JpaRepository<Clase, Long> {
}
