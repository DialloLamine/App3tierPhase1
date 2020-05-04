package com.diallo.poo.App3tierP1.Metier;

import java.util.List;

import com.diallo.poo.App3tierP1.Entities.Book;
import com.diallo.poo.App3tierP1.Entities.Person;

public interface IMetier {
	//Data access needs
	public List<Person> getMembres();
	public void register(Person p);
	public void update(Person p);
	public void delete(Person p);
	public void unregister(Person p);
	public List<Person> findByName(String name);
	
	//Business Logic
	public int computeRemainingDays(Book b);
	
	//...

}
