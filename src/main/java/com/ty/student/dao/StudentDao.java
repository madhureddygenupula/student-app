package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.student.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction;

	public void saveStudent(Student student) {
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();
	}

	public List<Student> getAllStudents() {
		Query query = entityManager.createQuery("Select s from Student s");
		return query.getResultList();
	}

	public boolean deleteStudent(int id) {
		entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return true;

		} else {
			return false;
		}
	}
	public Student getStudentById(int id)
	{
		return entityManager.find(Student.class, id);
	}
	
	public void updateStudent(Student student)
	{
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.merge(student);

		entityTransaction.commit();
}
}
