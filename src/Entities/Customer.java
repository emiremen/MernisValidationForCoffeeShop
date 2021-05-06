package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
    public int id;
    public String name;
    public String surname;
    public int yearOfBirth;
    public String nationalityId;

    public Customer(int id, String name, String surname, int yearOfBirth, String nationalityId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.nationalityId = nationalityId;
    }

}
