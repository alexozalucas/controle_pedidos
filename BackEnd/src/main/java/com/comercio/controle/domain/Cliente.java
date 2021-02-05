package com.comercio.controle.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotEmpty;

import com.comercio.controle.domain.enuns.Estado;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Cliente{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(nullable = false , name="nome")
	@NotEmpty
	private String nome; 
	
	@Column(nullable = false , name="bairro")
	@NotEmpty
	private String bairro;
	
	@Column(nullable = false , name="cidade")
	@NotEmpty
	private String cidade;
	
	@Column( name="rua")
	private String rua;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="telefone_fixo")
	private String telefoneFixo;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="email")
	private String email;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="estado")
	private Estado estado;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@Column(nullable = false ,name="data_cadastro")
	private LocalDateTime dataCadastro;
		
	
	@PrePersist
	public void prePersist() {
		setDataCadastro(LocalDateTime.now());
	}



}
