import java.util.Scanner;

public class PrimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);


System.out.println("Enter a number of your choice");
int number =s.nextInt();
if(number==0 || number==1){
	System.out.println("Not a prime");
}
else if((number%2)==0){
	
	System.out.println("Not a prime");
	
}

else {
	System.out.println("The number is a prime");
}
	}

}
