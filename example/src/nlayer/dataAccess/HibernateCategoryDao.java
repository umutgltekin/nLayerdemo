package nlayer.dataAccess;

import nlayer.entities.Category;

public class HibernateCategoryDao implements categoryDao {

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile eklendi");
	}

}
