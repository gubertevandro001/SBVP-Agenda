package sistran.api.sbvp.agenda.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistran.api.sbvp.agenda.entities.Parceira;

@Repository
public interface ParceiraRepository extends JpaRepository<Parceira, Long>{

}
