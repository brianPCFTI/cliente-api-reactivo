package com.demo.clienteapireactive.repository;

import com.demo.clienteapireactive.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, Integer> {

}
