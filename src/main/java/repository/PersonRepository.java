package repository;

import domain.Person;

public interface PersonRepository {

  Person findAll(Person person);

  Person findOneByIdAndDeletedIsFalse(String id);
}
