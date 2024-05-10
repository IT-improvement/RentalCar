package service.car.model;

public class Car {
	private String carnumber;
	private String name;
	private String type;
	private String oil;
	private String info;
	private int viewcount;
	private String[] images;
	private int price;
	
	public Car() {
		
	}
	
	public Car(String carnumber, String name, String type, String oil, String info, int viewcount, String[] images) {
		super();
		this.carnumber = carnumber;
		this.name = name;
		this.type = type;
		this.oil = oil;
		this.info = info;
		this.viewcount = viewcount;
		this.images = images;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
