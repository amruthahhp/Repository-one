import java.util.Scanner;

public class PalindromeExample 	
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
int number,remainder=0 , reversenumber=0  ;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number to verify Palindrome ");
 number = in.nextInt();
 int original = number;

while(number>0){
	remainder=number%10;
	number = number/10;
	reversenumber = reversenumber*10+remainder;	
}

if (reversenumber==original){
	System.out.println("The number is a Palindrome");
}else {
	System.out.println("The number is not a Palindrome");
}
	}
}
