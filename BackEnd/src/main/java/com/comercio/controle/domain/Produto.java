package com.comercio.controle.domain;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Produto {
	
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(nullable = false , name="nome")
	@NotEmpty
	private String nome;
	
	@Column(name="ingrediente")
	private String ingrediente;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(nullable = false , name="id_tipo_produto")
	@NotEmpty
    private TipoProduto tipoProduto;
    
	@Column(nullable = false , name="dataCadastro")
	@NotEmpty
    private LocalDateTime dataCadastro;
    
	@Column(nullable = false , name="id_usuario")
	@NotEmpty
    private Usuario usuario;
    
  */

}
