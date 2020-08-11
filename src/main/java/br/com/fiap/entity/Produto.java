package br.com.fiap.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "nome", length = 45)
	private String nome;
	@Column(name = "quantidade")
	private int quantidade;
	@Column(name = "valor")
	private double valor;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "PRODUTO_PEDIDO", catalog = "dbecommerce", joinColumns = {
			@JoinColumn(name = "PRODUTO_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "PEDIDO_ID", nullable = false, updatable = false) })

	private Set<Pedido> pedidos = new HashSet<>();

	public int getProdutoId() {
		return id;
	}

	public void setProdutoId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setTarefas(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
