/*
 * Problem Statement 2:
1.	Develop a java class with a instance variable Country  HashSet (H1)  
add a method storeCountryNames(String CountryName) , 
the method should add the passed country to a HashSet (H1) 
and return the added HashSet(H1).
2.	Develop a method retrieveCountry(String CountryName) which iterates through
 the HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.
 */

package Lab_13_Dec;
import java.util.HashSet;
public class Problem2 {
	HashSet<String>H1=new HashSet(); //creating hashset
	HashSet<String> storeCountryNames(String CountryName) {// method 1
		H1.add("India");//adding vale
		H1.add("Bangladesh");
		H1.add("China");
		H1.add("USA");
		return H1;
	}
	
	  void  retrieveCountry(String CountryName) {//method 2
		if(H1.contains(CountryName)) {
			System.out.println(CountryName+": is present in hashset"); 
		}
		else {	
		System.out.println("null");
		}
	 }
	
	public static void main(String[] args) {
		Problem2 h=new Problem2(); //object of main class
		System.out.println("HashSet countries "+h.storeCountryNames(""));
		h.retrieveCountry("USA");
	
	}

}