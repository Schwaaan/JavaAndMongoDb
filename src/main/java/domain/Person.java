package domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Person {

  private String name;
  private String cpf;
  private String sex;
  private String email;
  private String dateOfBirth;
  private String nationality;
  private String naturalness;
  private boolean deleted;

  public Person() {
  }
}