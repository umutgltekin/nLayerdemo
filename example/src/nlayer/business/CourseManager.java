package nlayer.business;

import nlayer.core.logg.Logger;
import nlayer.dataAccess.courseDao;
import nlayer.entities.Course;

public class CourseManager {
	private Course[] course;
	private courseDao coursedao;
	private Logger[] loggers;
	
	
	public CourseManager(Course[] course, courseDao coursedao, Logger[] loggers) {
		super();
		this.course = course;
		this.coursedao = coursedao;
		this.loggers = loggers;
	}
	public void checkcoursename(Course courses) throws Exception {
		for (Course course2 : course) {
			if(course2.getName().equals(courses.getName())) {
				throw new Exception("kurs ismi tekrar edemez");
				
			}
			if(courses.getUnitPrice()<=0) {
				throw new Exception("kurs fiyatı 0 dan küçük olamaz");
			}
			coursedao.add(courses);
			for (Logger logger : loggers) {
				logger.log(courses.getName());
				
			}
		}
	}

}
