package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Estagiario;
import com.example.service.EstagiarioService;

import reactor.core.publisher.Mono;

//@CrossOrigin(origins="http://localhost:4200", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")
public class EstagiarioController {
		@Autowired
		EstagiarioService service;
		
		@RequestMapping(value="/estagiario/salvar", method = RequestMethod.POST)
		public Mono<Estagiario> salvar(@RequestBody Estagiario estagiario) {
			Estagiario estagiario1 = service.salvar(estagiario);
			return Mono.just(estagiario1);
		}
		@RequestMapping(value="/estagiario", method = RequestMethod.GET)
		public @ResponseBody Mono<List<Estagiario>> listar() {
			List<Estagiario> estagiarios = service.listar();
			return Mono.just(estagiarios);
		}
		@RequestMapping(value="/estagiario/{id}", method = RequestMethod.DELETE)
		public @ResponseBody Mono<Estagiario> excluir(@PathVariable("id") Long id) {
			Estagiario estagiario = service.excluir(id);
			return Mono.just(estagiario);
		}
		
		@RequestMapping(value="/estagiario/{id}", method = RequestMethod.GET)
		public @ResponseBody Mono<Estagiario> get(@PathVariable("id") Long id) {
			Estagiario estagiario = service.get(id);
			System.out.println("id: " + id);
			return Mono.just(estagiario);
		}
}