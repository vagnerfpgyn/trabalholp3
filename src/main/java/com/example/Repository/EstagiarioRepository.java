package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Estagiario;

@Repository
public interface EstagiarioRepository extends CrudRepository<Estagiario, Long> {

}
