package edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.dao.IClienteDao;
import edu.com.unsis.spring.boot.backend.apirest.springbootbackendapirest.modelo.entity.Cliente;


@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	

}
