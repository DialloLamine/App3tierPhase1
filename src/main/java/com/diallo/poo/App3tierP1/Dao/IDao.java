package com.diallo.poo.App3tierP1.Dao;

import java.util.List;
import java.util.UUID;

import com.diallo.poo.App3tierP1.Entities.Person;



/**
 * CRUD operations
 * 
 * @author user
 *
 */
public interface IDao {
	//Read operations
	public List<Person> findAll();
	public Person findById(UUID id);
	public List<Person> findBy(String property, String value);
	
	//Delete operation
	public void delete(UUID id);
	public void delete(Person p);
	
	//Update operation
	public void update(Person p);
	public void update(UUID id);
	
	//Create operation
	public void save(Person p);
	public void save(UUID id);
}