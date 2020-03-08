package controllers;

import domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import repository.PersonRepository;

@RestController
@RequestScope
public class PersonController {

  @Autowired
  private PersonRepository personRepository;

  @GetMapping(path = "/v1/persons")
  public Person getPersons() {
    Person person = new Person();
    return this.personRepository.findAll(person);
  }

  @GetMapping(path = "/v1/person/{id}")
  public Person getPersonId(@PathVariable("id") String id) {
    return personRepository.findOneByIdAndDeletedIsFalse(id);
  }

  @PostMapping(path = "/v1/persons/registrations")
  public Person personRegistration() {
    return new Person();
  }

  @PutMapping(path = "v1/persons/registrations-update/{id}")
  public Person updatePerson(@PathVariable("id") String id) {
    Person person = personRepository.findOneByIdAndDeletedIsFalse(id);
    person.set
    return person;
  }

  @DeleteMapping(path = "/v1/persons/{id}")
  public Person deletePerson(@PathVariable("id") String id) {
    Person person = personRepository.findOneByIdAndDeletedIsFalse(id);
    return person;
  }
}