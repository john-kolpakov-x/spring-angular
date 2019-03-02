package kz.pompei.springAngular.controller.model;

public class ClientRecord {
  public String id;
  public String surname;
  public String name;
  public int age;

  public ClientRecord() {}

  public ClientRecord(String id, String surname, String name, int age) {
    this.id = id;
    this.surname = surname;
    this.name = name;
    this.age = age;
  }
}
