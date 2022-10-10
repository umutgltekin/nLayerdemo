package nlayer.dataAccess;

import nlayer.entities.Category;

public class jdbcCategoryDao implements categoryDao{

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("jdbc ile eklendi");
	}

}
