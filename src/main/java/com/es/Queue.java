package com.es;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Queue {

  private final List<Person> persons;

  public Queue(List<Person> persons) {
    this.persons = persons;
  }

  public Person getOlder() {
    return persons.stream().max(Comparator.comparing(p -> p.getAge())).get();
  }

  public Person getYounger() {
    return persons.stream().min(Comparator.comparing(p -> p.getAge())).get();
  }

  public List<Person> getAdults() {
    List<Person> adults = new ArrayList<>();

    for (Person p : persons) {
      if (p.getAge() > 18 && p.getAge() < 65) {
        adults.add(p);
      }
    }
    return adults;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Queue queue = (Queue) o;

    return persons.equals(queue.persons);
  }

  @Override public int hashCode() {
    return persons.hashCode();
  }

  @Override public String toString() {
    return "Queue{" +
        "persons=" + persons +
        '}';
  }

  public List<Person> getPersons() {
    return persons;
  }
}
