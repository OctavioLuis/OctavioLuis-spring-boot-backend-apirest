package edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.entity.Cliente;



public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
