package com.myBroker.dio.service;

import org.springframework.stereotype.Service;

import com.myBroker.dio.entity.Client;

@Service
public interface ClientService {
	
	Iterable<Client> getClients();

	Client getClientById(Long id);

	Client inserir(String cpf, String nome);

	void atualizar(long id, String cpf, String nome);

}
