package sistran.api.sbvp.agenda.entities;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_GRUPO_TAREFA")
@SequenceGenerator(name = "seq_grupo_tarefa", sequenceName = "seq_grupo_tarefa", allocationSize = 1, initialValue = 1)
public class GrupoTarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "seq_grupo_tarefa")
	private Long idGrupoTarefa;
	private String descricao;
	

	public GrupoTarefa() {
		super();
	}

	public GrupoTarefa(Long idGrupoTarefa, String descricao) {
		super();
		this.idGrupoTarefa = idGrupoTarefa;
		this.descricao = descricao;
	}

	public Long getIdGrupoTarefa() {
		return idGrupoTarefa;
	}

	public void setIdGrupoTarefa(Long idGrupoTarefa) {
		this.idGrupoTarefa = idGrupoTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
