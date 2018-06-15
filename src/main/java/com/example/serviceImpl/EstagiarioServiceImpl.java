package com.example.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EstagiarioRepository;
import com.example.entity.Estagiario;
import com.example.service.EstagiarioService;

@Service
public class EstagiarioServiceImpl implements EstagiarioService {

	@Autowired
	EstagiarioRepository estagiarioRepository;

	@Override
	public Estagiario salvar(Estagiario estagiario) {
		return estagiarioRepository.save(estagiario);
}

	@Override
	public List<Estagiario> listar() {
		return (List<Estagiario>) estagiarioRepository.findAll();
	}

	@Override
	public Estagiario excluir(Long id) {
		Optional<Estagiario> estagiario = estagiarioRepository.findById(id);
		estagiarioRepository.deleteById(id);
		return estagiario.get();
	}

	@Override
	public Estagiario get(Long id) {
		Optional<Estagiario> estagiario = estagiarioRepository.findById(id);
		return estagiario.get();
	}	
}