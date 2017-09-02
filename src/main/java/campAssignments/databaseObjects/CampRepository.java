package campAssignments.databaseObjects;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampRepository extends CrudRepository<CampDao, Long>{

}
