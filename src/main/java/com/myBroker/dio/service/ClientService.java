package com.myBroker.dio.service;

import com.myBroker.dio.entity.Client;

public interface ClientService {
	
	Iterable<Client> getClients();

	Client getClientById(Long id);

	Client inserir(String cpf, String nome);

	void atualizar(long id, String cpf, String nome);

}
