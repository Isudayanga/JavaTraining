package com.suresh.tr;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Application {
	public static void main(String[] args) {
		//saveData();
		 //save();
		load();
	}

	static void save() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();




//		Employee employee = new Employee();
//		employee.setAge(20);
//		employee.getAllocationData().setCtiy("nvdfsnvsnd");
//		employee.getAllocationData().setMobile("34030203");
//		employee.setCity("Kesbewa");
//		employee.setName("suresh");
//
//		session.save(employee);
		
		
		Student student=new Student();
		student.setName("suresh");
		student.setAge(30);
		student.getSchoolData().setSchool("N college");
		student.getSchoolData().setContactnumber("07xxxxxxxx");
		
		student.addSchoolHistory(new SchoolHistory("Oo0",1));
		//student.addSchoolHistory(new SchoolHistory("OKVtr",5));
		
		
//		student.getSchoolHistories().add(new SchoolHistory("OKVtr",1));
//		student.getSchoolHistories().add(new SchoolHistory("OMVrt",5));
		
		session.save(student);
		
		session.getTransaction().commit();

		System.out.println("Save successfully");
		session.close();
		// HibernateUtilities.getSessionFactory().close();

	}

	static void load() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("select s from Student s");
		List<Student> students = query.list();
		for(Student student:students){
			System.out.println(student.getName()+" Stuid at "+student.getSchoolData().getSchool());
		}
		/*Employee employee = (Employee) session.load(Employee.class,1);
		System.out.println(employee.getName() + " living at " + employee.getCity());
		employee.setAge(employee.getAge()+1);*/
		//======session.beginTransaction().commit();
		HibernateUtilities.getSessionFactory().close();
	}
	
	private static void saveData() {

		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();

		Student krisha = new Student(1, "Krishantha dinesh", 23, new SchoolData("RICHMAND", "01854944"),
				new SchoolHistory("POO", 5), new Notification("Welcome on board"));

		Student suresh = new Student(2, "Suresh", 13, new SchoolData("NIC", "777777"), new SchoolHistory("POO", 5),
				new Notification("dsada"));
		
		Student vicky = new Student(2, "Vickey", 33, new SchoolData("CMC", "8888888"), new SchoolHistory("POO", 5),
				new Notification("dsada"));

		session.save(krisha);
		session.save(suresh);
		session.save(vicky);

		session.getTransaction().commit();

		System.out.println("Save successfully");
		session.close();
	}

}
