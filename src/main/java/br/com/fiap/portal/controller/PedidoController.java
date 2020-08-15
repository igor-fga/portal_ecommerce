package br.com.fiap.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.portal.entity.Pedido;
import br.com.fiap.portal.repository.PedidoRepository;

@RestController
public class PedidoController {

	@Autowired
	private PedidoRepository _pedidoRepository;

	@RequestMapping(value = "/pedido", method = RequestMethod.GET)
	public List<Pedido> Get() {
		return _pedidoRepository.findAll();
	}

	@GetMapping("/pedido/{id}")
	public Optional<Pedido> getPedidoById(@PathVariable("id") Integer id) {
		return _pedidoRepository.findById(id);
	}

	@RequestMapping(value = "/pedido", method = RequestMethod.POST)
	public Pedido Post(@RequestBody Pedido pedido) {
		return _pedidoRepository.save(pedido);
	}
}
