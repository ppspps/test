package domain;


public class Device {
	private String name;
	private String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", brand=" + brand + "]";
	}
	
	

}
