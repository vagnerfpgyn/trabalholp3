package com.example.service;

import java.util.List;

import com.example.entity.Estagiario;

public interface EstagiarioService {
	public Estagiario salvar(Estagiario estagiario);
	public List<Estagiario> listar();
	public Estagiario excluir (Long id);
	public Estagiario get(Long id);


}