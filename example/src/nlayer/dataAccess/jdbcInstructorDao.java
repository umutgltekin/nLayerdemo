package nlayer.dataAccess;

import nlayer.entities.Instructor;

public class jdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("jdbc ile eklendi");
		
	}

}
