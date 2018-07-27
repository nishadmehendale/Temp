import java.util.*;
public class CountryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Accepting input
		System.out.println("Enter number of countries");
		int num = sc.nextInt();
		Country[] country = new Country[num];
		for(int i=0;i<num;i++) {
			country[i] = new Country();
			System.out.println("Enter Country Name");
			String countryName = sc.next();
			System.out.println("Enter Area of Country");
			double area = sc.nextDouble();
			System.out.println("Enter Population of Country");
			double population = sc.nextDouble();
			country[i].setCountryName(countryName);
			country[i].setArea(area);
			country[i].setPopulation(population);
		}
		//Finding and printing country with largest area
		int index = country[0].largestArea(country);
		System.out.println("Country with largest area is " + country[index]);
		//Finding and printing country with largest population
		index = country[0].largestPopulation(country);
		System.out.println("Country with largest population is " + country[index]);
		//Finding and printing country with largest density
		index = country[0].largestDensity(country);
		System.out.println("Country with largest density is " + country[index]);
	}
}
