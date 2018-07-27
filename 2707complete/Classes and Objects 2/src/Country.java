
public class Country {
	private String countryName;
	private double area;
	private double population;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	
	public int largestArea(Country C[]) {
		int index = 0;
		double largest = 0;
		for(int i = 0;i<C.length;i++) {
			if(largest < C[i].getArea()) {
				largest = C[i].getArea();
				index = i;
			}
		}
		return index;
	}
	
	public int largestPopulation(Country C[]) {
		int index = 0;
		double largest = 0;
		for(int i = 0;i<C.length;i++) {
			if(largest < C[i].getPopulation()) {
				largest = C[i].getPopulation();
				index = i;
			}
		}
		return index;
	}
	
	public int largestDensity(Country C[]) {
		int index = 0;
		double largest = 0;
		for(int i = 0;i<C.length;i++) {
			if(largest < (C[i].getPopulation()/C[i].getArea())) {
				largest = (C[i].getPopulation()/C[i].getArea());
				index = i;
			}
		}
		return index;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", area=" + area + ", population=" + population + "]";
	}
	
	
}
