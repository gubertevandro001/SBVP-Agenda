package sistran.api.sbvp.agenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistran.api.sbvp.agenda.dtos.SistemaDTO;
import sistran.api.sbvp.agenda.entities.Sistema;
import sistran.api.sbvp.agenda.repositorys.SistemaRepository;

@Service
public class SistemaService {
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	public Sistema buscarSistemaPorId(Long id) {
		
		Optional<Sistema> sistema = sistemaRepository.findById(id);
		
		return sistema.get();
	}
	
	public List<Sistema> mostrarSistemas() {
		
		return sistemaRepository.findAll();
	}
	
	public Sistema cadastrarSistema(SistemaDTO sistemaDTO) {
		return insertFromDTO(sistemaDTO);
	}
	
	public Sistema alterarSistema(Long id, SistemaDTO sistemaDTO) {
		return updateFromDTO(id, sistemaDTO);
	}
	
	private Sistema insertFromDTO(SistemaDTO sistemaDTO) {
		
		Sistema sistema = new Sistema();
		
		sistema.setDescricao(sistemaDTO.getDescricao());
		sistema.setObservacao(sistemaDTO.getObservacao());
		
		sistemaRepository.save(sistema);
		
		return sistema;
		
	}
	
	public void deletarSistema(Long id) {
		
		sistemaRepository.deleteById(id);
	}
	
	private Sistema updateFromDTO(Long id, SistemaDTO sistemaDTO) {
		
		Sistema sistema = buscarSistemaPorId(id);
		
		if (sistema != null) {
			
			sistema.setDescricao(sistemaDTO.getDescricao());
			sistema.setObservacao(sistemaDTO.getObservacao());
			
			sistemaRepository.save(sistema);
		}
		
		return sistema;
		
	}
}
