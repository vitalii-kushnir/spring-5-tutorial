package kusha.spring5tutorial.spring5webapp.repositories;

import kusha.spring5tutorial.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
