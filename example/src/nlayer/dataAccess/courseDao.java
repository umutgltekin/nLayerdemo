package nlayer.dataAccess;

import nlayer.entities.Course;

public interface courseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	

}
