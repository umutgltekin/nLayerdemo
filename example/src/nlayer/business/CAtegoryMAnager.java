package nlayer.business;

import nlayer.core.logg.Logger;
import nlayer.dataAccess.categoryDao;
import nlayer.entities.Category;

public class CAtegoryMAnager {
	private Category[] categorys;
	private Logger[] loggers;
	private categoryDao categorydao;
	
	public CAtegoryMAnager(Category[] categorys, Logger[] loggers, categoryDao categorydao) {
		super();
		this.categorys = categorys;
		this.loggers = loggers;
		this.categorydao = categorydao;
	}
	public void checkcategoryname(Category categoryy) throws Exception {
		for (Category category : categorys) {
			if(category.getName().equals(categoryy.getName())) {
				throw new Exception("kategori ismi tekrar edemez");
			}	
		}
		categorydao.add(categoryy);
		for (Logger logger : loggers) {
			logger.log(categoryy.getName());
		}
		
		
	}
	
}
