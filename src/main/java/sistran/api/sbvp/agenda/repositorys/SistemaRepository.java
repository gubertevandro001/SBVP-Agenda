package sistran.api.sbvp.agenda.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistran.api.sbvp.agenda.entities.Sistema;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long>{

}
