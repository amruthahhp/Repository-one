import java.util.Scanner;

public class ArmStrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number,a=0,sum=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to check if it is armstrong");
number =s.nextInt();
int orig=number;

while(number>0){
a=number%10;
number=number/10;
sum=sum+(a*a*a);
}
if(sum==orig){
	System.out.println("The number is an Armstrong");
}else {
	System.out.println("The number is not an Armstrong");
}
	}

}
