package sistran.api.sbvp.agenda.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "TB_APLICACAO")
@SequenceGenerator(name = "seq_aplicacao", sequenceName = "seq_aplicacao", allocationSize = 1, initialValue = 1)
public class Aplicacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "seq_aplicacao")
	private Long idAplicacao;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "sistema_id")
	private Sistema idSistema;
	private String linguagemDeProgramacao;
	
	public Aplicacao() {
		super();
	}

	public Aplicacao(Long idAplicacao, String descricao, Sistema idSistema, String linguagemDeProgramacao) {
		super();
		this.idAplicacao = idAplicacao;
		this.descricao = descricao;
		this.idSistema = idSistema;
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}

	public Long getIdAplicacao() {
		return idAplicacao;
	}

	public void setIdAplicacao(Long idAplicacao) {
		this.idAplicacao = idAplicacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Sistema getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(Sistema idSistema) {
		this.idSistema = idSistema;
	}

	public String getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}
}
