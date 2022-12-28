package sistran.api.sbvp.agenda.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistran.api.sbvp.agenda.entities.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
