package Lab_30Sep;

public class PrimeNumber {


	 public static void main(String[] args) {

	  int check;
	  int n = 1;
	  int count;

	  while (n <= 150) {  //1st While loop to print 1 to 150 numbers
	   count = 0;
	   check = 2;
	   while (check <= n / 2) { //2nd while loop to check the no is a prime no or not
	    if (n % check == 0) {
	     count++;
	     break;
	    }
	    check++;
	   }
	   if (count == 0 && n != 1) {
	    System.out.print(n + " ");
	   }
	   n++;
	  }

	 }
	}