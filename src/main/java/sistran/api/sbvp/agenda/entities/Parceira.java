package sistran.api.sbvp.agenda.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PARCEIRA")
@SequenceGenerator(name = "seq_parceira", sequenceName = "seq_parceira", allocationSize = 1, initialValue = 1)
public class Parceira implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "seq_parceira")
	private Long idParceira;
	private String descricao;
	private String descricaoAbreviada;
	private String nomeResponsavel;
	
	public Parceira() {
		super();
	}

	public Parceira(Long idParceira, String descricao, String descricaoAbreviada, String nomeResponsavel) {
		super();
		this.idParceira = idParceira;
		this.descricao = descricao;
		this.descricaoAbreviada = descricaoAbreviada;
		this.nomeResponsavel = nomeResponsavel;
	}

	public Long getIdParceira() {
		return idParceira;
	}

	public void setIdParceira(Long idParceira) {
		this.idParceira = idParceira;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoAbreviada() {
		return descricaoAbreviada;
	}

	public void setDescricaoAbreviada(String descricaoAbreviada) {
		this.descricaoAbreviada = descricaoAbreviada;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
}
