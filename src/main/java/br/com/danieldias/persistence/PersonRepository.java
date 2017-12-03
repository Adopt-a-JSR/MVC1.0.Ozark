package br.com.danieldias.persistence;

import br.com.danieldias.model.Person;
import org.jnosql.artemis.Repository;

public interface PersonRepository extends Repository<Person, String>{
}
