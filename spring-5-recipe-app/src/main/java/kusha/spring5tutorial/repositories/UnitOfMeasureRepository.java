package kusha.spring5tutorial.repositories;

import kusha.spring5tutorial.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
