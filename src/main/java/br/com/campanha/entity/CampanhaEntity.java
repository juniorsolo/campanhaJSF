package br.com.campanha.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Manoel Silva
 *
 */

//
//@Entity
//@Table(name="campanha", schema = "campanha")
public class CampanhaEntity implements Serializable{


	private static final long serialVersionUID = 4635838254483908061L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private Integer idTimeCoracao;
	
//	@Convert(converter=LocalDateAttributeConverter.class)
//	private LocalDate dataInicio;
	private Date dataInicio;

	
//	@Convert(converter=LocalDateAttributeConverter.class)
//	@Column(unique=true)
//	private LocalDate dataVigencia;
	private Date dataVigencia;

	
//	@Version
	private Integer version;
	
	public CampanhaEntity(String nome, Integer idTimeCoracao, Date dataVigencia) {
		super();
		this.nome = nome;
		this.idTimeCoracao = idTimeCoracao;
		this.dataVigencia = dataVigencia;
	}
	
	public CampanhaEntity() {
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
	
	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Integer getIdTimeCoracao() {
		return idTimeCoracao;
	}
	public void setIdTimeCoracao(Integer idTimeCoracao) {
		this.idTimeCoracao = idTimeCoracao;
	}
	public Date getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(Date dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
