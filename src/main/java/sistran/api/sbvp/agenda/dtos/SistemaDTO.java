package sistran.api.sbvp.agenda.dtos;

import java.io.Serializable;

import sistran.api.sbvp.agenda.entities.Sistema;

public class SistemaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idSistema;
	private String descricao;
	private String observacao;
	
	
	public SistemaDTO() {
		super();
	}

	public SistemaDTO(Long idSistema, String descricao, String observacao) {
		super();
		this.idSistema = idSistema;
		this.descricao = descricao;
		this.observacao = observacao;
	}
	
	public SistemaDTO(Sistema sistema) {
		this.idSistema = sistema.getIdSistema();
		this.descricao = sistema.getDescricao();
		this.observacao = sistema.getObservacao();
	}

	public Long getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(Long idSistema) {
		this.idSistema = idSistema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
