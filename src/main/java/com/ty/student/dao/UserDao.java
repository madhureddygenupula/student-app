package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.User;


public class UserDao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction;
	
	
	public List<User> getAllUsers()
	{
		Query query=entityManager.createQuery("Select u from User u");
		return query.getResultList();
	}
	
	public User validateUser(String email,String password) {
		
		for(User user:getAllUsers()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
}
