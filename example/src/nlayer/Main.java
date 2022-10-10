package nlayer;

import java.util.ArrayList;

import nlayer.business.CAtegoryMAnager;
import nlayer.business.CourseManager;
import nlayer.core.logg.DatabaseLogger;
import nlayer.core.logg.FileLogger;
import nlayer.core.logg.Logger;
import nlayer.dataAccess.HibernateCategoryDao;
import nlayer.dataAccess.JdbccourseDao;
import nlayer.entities.Category;
import nlayer.entities.Course;


public class Main {

	public static void main(String[] args) throws Exception {
		 Logger[] loggers= {new FileLogger(),new DatabaseLogger()};
		 
		
	    Category[] categorys =new Category[] {new Category("frontend"),new Category("backend")};
	    Category category=new Category("uı");
	    CAtegoryMAnager categorymanager=new CAtegoryMAnager(categorys, loggers,new HibernateCategoryDao());
	    categorymanager.checkcategoryname(category);
	    Course [] courses=new Course[] {new Course("Frontend","kurs java",10),new Course("backend","java spring",1500)};
	    Course course=new Course("ui","detail",-1);
	    CourseManager courseManager=new CourseManager(courses, new JdbccourseDao(), loggers);
	    courseManager.checkcoursename(course);
	    
	    

	}

}
