package com.diallo.poo.App3tierP1.Metier;

import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

import com.diallo.poo.App3tierP1.Dao.IDao;
import com.diallo.poo.App3tierP1.Entities.Book;
import com.diallo.poo.App3tierP1.Entities.Person;

public class Metier implements IMetier {

	private IDao dao;

	private List<Person> people = new ArrayList<Person>();
	
	public Metier() {
	}
	
	public Metier(IDao dao) {
		this.dao = dao;
	}
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public int computeRemainingDays(Book b) {	
		int nbRemainingDays = 0;
		
		//Book book = dao.findBook(b);
		
		//Quel est la date d'emprunt?
		//quel est la durée d'emprunt?
		//Calcul du nombre de jours restants
		
		return nbRemainingDays;
	}

	public List<Person> getMembres() {
		return dao.findAll();
	}

	public void register(Person p) {
		dao.save(p);
	}

	public void remove(Person p) {
		dao.delete(p);
	}

	public void update(Person p) {
		dao.update(p);
	}

	public void unregister(UUID id) {
		dao.delete(id);
	}
	
	public List<Person> findByName(String name) {
		return dao.findBy("name", name);
	}

	public void delete(Person p) {
		dao.delete(p);
		
	}

	public void unregister(Person p) {
		dao.delete(p);
		
	}

}
