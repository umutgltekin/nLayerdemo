package nlayer.dataAccess;

import nlayer.entities.Course;

public class JdbccourseDao implements courseDao {

	@Override
	public void add(Course course) {
		System.out.println("jdbc ile eklendi");
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

}
