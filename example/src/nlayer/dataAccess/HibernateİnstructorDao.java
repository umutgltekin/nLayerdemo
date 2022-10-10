package nlayer.dataAccess;

import nlayer.entities.Instructor;

public class HibernateİnstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile eklendi");
	}

}
