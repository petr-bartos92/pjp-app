package cz.tul.repositories;

import cz.tul.data.Author;
import cz.tul.data.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AuthorRepository extends CrudRepository<Author, UUID> {
    List<Author> findByName(String name);

    List<Author> findAll();

    Author findOne(UUID id);
}