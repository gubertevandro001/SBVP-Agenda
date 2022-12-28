package sistran.api.sbvp.agenda.entities;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import sistran.api.sbvp.agenda.enums.EStatusTarefa;

@Entity
@Table(name = "TB_TAREFA")
@SequenceGenerator(name = "seq_tarefa", sequenceName = "seq_tarefa", allocationSize = 1, initialValue = 1)
public class Tarefa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarefa")
	private Long idTarefa;
	private String descricao;
	private String marcador;
	@ManyToOne
	@JoinColumn(name = "id_grupo_tarefa")
	private GrupoTarefa idGrupoTarefa;
	@ManyToOne
	@JoinColumn(name = "id_agenda")
	private Agenda idAgenda;
	@OneToOne
	@JoinColumn(name = "id_parceira")
	private Parceira idParceira;
	@ManyToOne
	@JoinColumn(name = "id_aplicacao")
	private Aplicacao idAplicacao;
	@ManyToOne
	@JoinColumn(name= "id_usuario")
	private Usuario idUsuarioResponsavel;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataInicio;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dataTermino;
	private Long tempoTotalMinutos;
	private String observacao;
	private Integer statusTarefa;
	
	public Tarefa() {
		this.setStatusTarefa(EStatusTarefa.PENDENTE);
	}

	public Tarefa(Long idTarefa, String descricao, String marcador, GrupoTarefa idGrupoTarefa, Agenda idAgenda, Parceira idParceira,
			Aplicacao idAplicacao, Usuario idUsuarioResponsavel, LocalDateTime dataInicio, LocalDateTime dataTermino,
			Long tempoTotalMinutos, String observacao, EStatusTarefa statusTarefa) {
		super();
		this.idTarefa = idTarefa;
		this.descricao = descricao;
		this.marcador = marcador;
		this.idGrupoTarefa = idGrupoTarefa;
		this.idAgenda = idAgenda;
		this.idParceira = idParceira;
		this.idAplicacao = idAplicacao;
		this.idUsuarioResponsavel = idUsuarioResponsavel;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.tempoTotalMinutos = tempoTotalMinutos;
		this.observacao = observacao;
		this.statusTarefa = (statusTarefa == null) ? 0 : statusTarefa.getCodigoStatus();
	}
	public Long getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Long idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}

	public GrupoTarefa getIdGrupoTarefa() {
		return idGrupoTarefa;
	}

	public void setIdGrupoTarefa(GrupoTarefa idGrupoTarefa) {
		this.idGrupoTarefa = idGrupoTarefa;
	}

	public Parceira getIdParceira() {
		return idParceira;
	}

	public void setIdParceira(Parceira idParceira) {
		this.idParceira = idParceira;
	}

	public Aplicacao getIdAplicacao() {
		return idAplicacao;
	}

	public void setIdAplicacao(Aplicacao idAplicacao) {
		this.idAplicacao = idAplicacao;
	}

	public Usuario getIdUsuarioResponsavel() {
		return idUsuarioResponsavel;
	}

	public void setIdUsuarioResponsavel(Usuario idUsuarioResponsavel) {
		this.idUsuarioResponsavel = idUsuarioResponsavel;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDateTime dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Long getTempoTotalMinutos() {
		return tempoTotalMinutos;
	}

	public void setTempoTotalMinutos(Long tempoTotalMinutos) {
		this.tempoTotalMinutos = tempoTotalMinutos;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public EStatusTarefa getStatusTarefa() {
		return EStatusTarefa.toEnum(this.statusTarefa);
	}

	public void setStatusTarefa(EStatusTarefa statusTarefa) {
		this.statusTarefa = statusTarefa.getCodigoStatus();
	}
	
	public Long calculaTempoTotalTarefa(LocalDateTime dtInicio, LocalDateTime dtTermino) {
		
		Long minutos = dtInicio.until(dtTermino, ChronoUnit.MINUTES);
		
		return minutos;
	}

	public Agenda getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Agenda idAgenda) {
		this.idAgenda = idAgenda;
	}
}
