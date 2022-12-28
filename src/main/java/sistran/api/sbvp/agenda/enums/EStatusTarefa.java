package sistran.api.sbvp.agenda.enums;

public enum EStatusTarefa {
	
	PENDENTE(0, "PENDENTE"),
	INICIADA(1, "INICIADA"),
	FINALIZADA(2, "FINALIZADA");
	
	private Integer codigoStatus;
	private String descricao;
	
	private EStatusTarefa(Integer codigoStatus, String descricao) {
		this.codigoStatus = codigoStatus;
		this.descricao = descricao;
	}
	
	public Integer getCodigoStatus() {
		return codigoStatus;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EStatusTarefa toEnum(Integer codigoStatus) {
		if (codigoStatus == null) {
			return null;
		}
		for (EStatusTarefa x : EStatusTarefa.values()) {
			if (codigoStatus.equals(x.getCodigoStatus())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status Inválido!" + codigoStatus);
	}
}
