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

import br.com.fiap.portal.entity.Produto;
import br.com.fiap.portal.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository _produtoRepository;

	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public List<Produto> Get() {
		return _produtoRepository.findAll();
	}
	
	@GetMapping("produto/{id}")
	public Optional<Produto> getProdutoById(@PathVariable("id") Integer id) {
		return _produtoRepository.findById(id);
	}
	
	
	@RequestMapping(value = "/produto", method =  RequestMethod.POST)
    public Produto Post(@RequestBody Produto produto)
    {
        return _produtoRepository.save(produto);
    }
	
}
