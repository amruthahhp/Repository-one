import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number =0,sum;
System.out.println("Enter a number to get factorial of the number");
Scanner s = new Scanner(System.in);
number =s.nextInt();
sum=1;
while(number>1){
sum = sum*number;
number = number-1;
}
System.out.println("factorial of the given number is "+sum);
	}

}
