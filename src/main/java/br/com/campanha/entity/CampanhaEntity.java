package br.com.campanha.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * 
 * @author Manoel Silva
 *
 */


@Entity
@Table(name="campanha", schema = "campanha")
public class CampanhaEntity implements Serializable{


	private static final long serialVersionUID = 4635838254483908061L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private Integer idTimeCoracao;
	
	@Temporal(TemporalType.DATE)
	private LocalDate dataInicioVigencia;
	
	@Temporal(TemporalType.DATE)
	private LocalDate dataFimVigencia;
	
	@Version
	private Integer version;
	
	
	public CampanhaEntity(Integer id, String nome, Integer idTimeCoracao, LocalDate dataInicioVigencia,
			LocalDate dataFimVigencia) {
		this.id = id;
		this.nome = nome;
		this.idTimeCoracao = idTimeCoracao;
		this.dataInicioVigencia = dataInicioVigencia;
		this.dataFimVigencia = dataFimVigencia;
	}

	public CampanhaEntity() {
		//Construtor padrão
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdTimeCoracao() {
		return idTimeCoracao;
	}

	public void setIdTimeCoracao(Integer idTimeCoracao) {
		this.idTimeCoracao = idTimeCoracao;
	}

	public LocalDate getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(LocalDate dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public LocalDate getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDate dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
		
 

	
}
