
public class FibExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int count =2;int n1=0,n2=1,n3=0;


System.out.print("Fibonocci numbers are "+n1+" "+n2+" ");

while(count<10){
	n3=n1+n2;
	n1=n2;
	n2=n3;
count++;
	System.out.print(" "+n3+" ");
	
}


	}
}


