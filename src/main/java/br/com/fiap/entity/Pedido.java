package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
    public Integer id;
    

}
