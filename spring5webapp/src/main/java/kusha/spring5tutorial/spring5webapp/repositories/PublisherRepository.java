package kusha.spring5tutorial.spring5webapp.repositories;

import kusha.spring5tutorial.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
