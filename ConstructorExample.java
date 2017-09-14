
public class ConstructorExample {
	
	int id;
	String name;
	
	/*public void ConstructorEaxmple(){
		System.out.println("Constructor created");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorExample c1 = new ConstructorExample(12,"Amrutha");
		c1.Display();
		
		
}
	

//-----------------------------------------------------------------------------------------------------

public void ConstructorEaxmple(int i , String n){
	id=i;
	name=n;	
}

void Display(){
	System.out.println(id);
	System.out.println(name);
}
}

