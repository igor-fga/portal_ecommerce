package br.com.fiap.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.portal.entity.Cliente;
import br.com.fiap.portal.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository _clienteRepository;

	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public List<Cliente> Get() {
		return _clienteRepository.findAll();
	}

	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
	public Cliente Post(@RequestBody Cliente cliente) {
		return _clienteRepository.save(cliente);
	}
}
