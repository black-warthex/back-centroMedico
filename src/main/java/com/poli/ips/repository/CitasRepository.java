package com.poli.ips.repository;


import com.poli.ips.model.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitasRepository extends JpaRepository<Cita, Integer> {
}
