package br.com.danieldias.persistence;

import br.com.danieldias.model.Person;
import org.jnosql.artemis.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, String> {

    List<Person> findAll();
}
