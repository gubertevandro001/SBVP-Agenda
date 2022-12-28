package sistran.api.sbvp.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sistran.api.sbvp.agenda.dtos.SistemaDTO;
import sistran.api.sbvp.agenda.services.SistemaService;

@RestController
@RequestMapping(value = "/api/v1/sistema")
public class SistemaController {
	
	@Autowired
	private SistemaService sistemaService;
	
	@GetMapping("{idSistema}")
	public ResponseEntity<SistemaDTO> buscarSistemaPorId(@RequestParam(name = "idSistema") Long idSistema) {
		
		SistemaDTO sistemaDTO = new SistemaDTO(sistemaService.buscarSistemaPorId(idSistema));
		
		return ResponseEntity.ok().body(sistemaDTO);
	}
	
	@PostMapping("/add-sistema")
	public ResponseEntity<SistemaDTO> cadastrarSistema(@RequestBody SistemaDTO sistemaDTO) {
		
		SistemaDTO sistDTO = new SistemaDTO(sistemaService.cadastrarSistema(sistemaDTO));
		
		return ResponseEntity.ok().body(sistDTO);
	}
}
