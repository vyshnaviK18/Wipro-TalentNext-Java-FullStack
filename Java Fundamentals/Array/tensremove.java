
public class tensremove {
	public static void main(String args[]) {
		int arr[]= {1,2,10,10,9};
		int a=0;
		//add the array from the start only with non 10 nums
		for(int i:arr) {
			if(i!=10) {
				arr[a]=i;
				a++;
			}
		}
		//remaining elements are considered 0s
		while(a<arr.length) {
			arr[a]=0;
			a++;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
