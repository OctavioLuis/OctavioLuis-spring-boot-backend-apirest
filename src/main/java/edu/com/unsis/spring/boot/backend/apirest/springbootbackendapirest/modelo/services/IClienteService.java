package edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.services;

import java.util.List;

import edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.entity.Cliente;


public interface IClienteService {
	
	public List<Cliente> findAll();

}
