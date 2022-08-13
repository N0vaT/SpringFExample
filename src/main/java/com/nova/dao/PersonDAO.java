package com.nova.dao;

import com.nova.domain.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom", 23, "nova@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Rick",43, "fas@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Marta",18, "tas@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 56, "n2gcza@mail.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void edit(int id, Person person) {
        Person p = show(id);
        p.setName(person.getName());
        p.setAge(person.getAge());
        p.setEmail(person.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId()==id);
    }
}
