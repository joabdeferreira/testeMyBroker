package com.myBroker.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myBroker.dio.entity.Client;
import com.myBroker.dio.service.ClientService;




@RestController
@RequestMapping("Client")
public class ClientRestController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<Iterable<Client>> getClients() {
		return ResponseEntity.ok(clientService.getClients());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Client> getClientByCpf(@PathVariable Long id) {
		return ResponseEntity.ok(clientService.getClientById(id));
	}
	
	@PostMapping
	public ResponseEntity<Client> inserir(@RequestBody String cpf, String nome) {
		return ResponseEntity.ok(clientService.inserir(cpf, nome));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Client> atualizar(@PathVariable Long id, @RequestBody String cpf, String nome) {
		clientService.atualizar(id, cpf, nome);
		return ResponseEntity.ok(clientService.getClientById(id));
	}
}
