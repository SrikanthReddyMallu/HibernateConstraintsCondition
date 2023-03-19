package Hyber.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConstraintsMain 
{
public static void main(String[] args)
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Constraints constraints =new Constraints();
	constraints.setName("");
	constraints.setGender("male");
	constraints.setSal(30000345);
	constraints.setDesignation("soflog");
	constraints.setPhno(7032);
	
	entityTransaction.begin();
	entityManager.persist(constraints);
	entityTransaction.commit();
}
}
