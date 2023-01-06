package com.myBroker.dio.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myBroker.dio.entity.Client;
import com.myBroker.dio.repository.ClientRepository;
import com.myBroker.dio.service.ClientService;


@Service
public class ClientServiceImplementation implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Iterable<Client> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client getClientById(Long id) {
		Optional<Client> client = clientRepository.findById(id);
		return client.get();
	}

	@Override
	public Client inserir(String cpf, String nome) {
			Client client = new Client();
			client.setCpf(cpf);
			client.setNome(nome);
			clientRepository.save(client);
			return client;
	}

	@Override
	public void atualizar(long id, String cpf, String nome) {
		if (clientRepository.existsById(id)) {
			Optional<Client> client = clientRepository.findById(id);
			client.get().setNome(nome);
			client.get().setCpf(cpf);
			clientRepository.save(client.get());
		}
		else {
			System.out.println("WE CAN'T FOUND THAT CLIENT ID!!");
		}
		
	}
	

}
