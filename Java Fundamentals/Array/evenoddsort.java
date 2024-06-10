
public class evenoddsort {

	public static void main(String args[]) {
		int arr[]= {1,2,10,9};
		int a=0;
		int b=0;
		int c=0;
		int[] arr2 = new int[arr.length];
		//copying
		for (int i = 0; i < arr.length; i++) {
		  arr2[i] = arr[i];
		}
		//add the array even ele from the start only 
		for(int i:arr) {
			if(i%2==0) {
				arr[a]=i;
				a++;
			}
		}
		//add the array odd ele from the start only 
		for(int i:arr2) {
			if(i%2!=0) {
				arr2[b]=i;
				b++;
			}
		}
		//add both arr
		while(a<arr.length) {
			arr[a]=arr2[c];
			a++;
			c++;
		}
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
