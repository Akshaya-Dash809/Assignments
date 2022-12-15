package Lab_13_Dec;
import java.util.ArrayList;
import java.util.Iterator;

public class Problem1 {
	 ArrayList<Integer> A1=new ArrayList<Integer>();
	 ArrayList<Integer> storeEvenNumbers(int N) {//1st method
		 for(int i=2;i<=N;i++) {  
		if(i%2==0) {
			A1.add(i);
		}
		 }
		 return A1;	 
	 }
	 ArrayList<Integer> A2=new ArrayList<Integer>();

	 ArrayList<Integer> printEvenNumbers() {//2nd method
		Iterator<Integer> itr=A1.iterator();
		while(itr.hasNext()) {
			A2.add(itr.next()*2);
		}	 
		 return A2;
	 }
	 void retrieveEvenNumber(int n){//3rd method
		 if(A1.contains(n)) {
			 System.out.println(n +": is present");
		 }
		 else {
			 System.out.println("zero");
		 }
	 }
	public static void main(String[] args) {
		Problem1 h=new Problem1();

		System.out.println("Stored Even Numbers "+h.storeEvenNumbers(20));
		System.out.println("After multiping 2 "+h.printEvenNumbers());
		h.retrieveEvenNumber(4);	
	}
}