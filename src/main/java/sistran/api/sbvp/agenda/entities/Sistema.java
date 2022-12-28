package sistran.api.sbvp.agenda.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SISTEMA")
@SequenceGenerator(name = "seq_sistema", sequenceName = "seq_sistema", allocationSize = 1, initialValue = 1)
public class Sistema implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_sistema")
	private Long idSistema;
	private String descricao;
	private String observacao;
	
	public Sistema() {
	}

	public Sistema(Long idSistema, String descricao, String observacao) {
		super();
		this.idSistema = idSistema;
		this.descricao = descricao;
		this.observacao = observacao;
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
