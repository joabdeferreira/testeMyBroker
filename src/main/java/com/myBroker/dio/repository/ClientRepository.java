package com.myBroker.dio.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myBroker.dio.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

}
