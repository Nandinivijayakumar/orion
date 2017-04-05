package com.orion.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.orion.model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();

	public PersonService() {
		Person person = new Person();
		person.setId(123);
		person.setName("nandini");
		persons.put("1", person);

		Person person1 = new Person();
		person1.setId(156);
		person1.setName("swathi");
		persons.put("2", person1);
	}

	public Person getPerson(String id) {
		if (persons.containsKey(id))
			return persons.get(id);
		else
			return null;

	}

	public Hashtable<String, Person> getAll() {
		return persons;

	}

}
