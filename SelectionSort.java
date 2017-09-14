
public class SelectionSort {

	
		// TODO Auto-generated method stub
public static void SelectionSortTechnique(int[] arr){
	
	for(int i=0;i<arr.length-1;i++){
		int index = i;
		
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[index]){
				index=j;
			}
		}
		int smallnum =arr[index];
		arr[index]=arr[i];
		arr[i]=smallnum;
		
	}
	
	
}
public static void main(String[] args) {
	int[] arr ={5,12,16,-5,12,4};
	System.out.println("Array before selection Sort");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	
	SelectionSortTechnique(arr);
	
	System.out.println("Array after selection Sort");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}

	}

}
