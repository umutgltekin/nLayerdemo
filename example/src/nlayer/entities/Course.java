package nlayer.entities;

public class Course {
	private String name;
	private String detail;
	private int unitPrice;
	
	public Course(String name, String detail, int unitPrice) {
		super();
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
