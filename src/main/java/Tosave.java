import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tosave {

	public static void main(String[] args) {


		Course cours1=new Course();
		cours1.setCname("html");
		cours1.setCost(45000.0);;
		cours1.setDuration(4);;



		Course cours2=new Course();
		cours2.setCname("css");
		cours2.setCost(25000.0);;
		cours2.setDuration(6);;


		Course cours3=new Course();
		cours3.setCname("java");
		cours3.setCost(35000.0);;
		cours3.setDuration(8);;

		List<Course> courses1=new ArrayList<Course>();
		courses1.add(cours3);
		courses1.add(cours2);

		List<Course> courses2=new ArrayList<Course>();
		courses2.add(cours1);
		courses2.add(cours2);
		courses2.add(cours3);


		Student student1 =new Student();
		student1.setAge(23);
		student1.setName("ranga");
		student1.setCourses(courses1);

		Student student2 =new Student();
		student2.setAge(25);
		student2.setName("manga");
		student2.setCourses(courses2);


		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("killing");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();


		entityTransaction.begin();
		entityManager.persist(student2);
		entityManager.persist(student1);
		entityManager.persist(cours1);
		entityManager.persist(cours2);
		entityManager.persist(cours3);
		entityTransaction.commit();



	}

}
