package cz.tul.repositories;

import cz.tul.data.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AuthorRepository extends CrudRepository<Author, UUID>, AuthorCustomRepository {
    List<Author> findByName(String name);
}
