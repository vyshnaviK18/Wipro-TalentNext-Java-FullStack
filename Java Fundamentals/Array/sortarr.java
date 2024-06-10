
public class sortarr {

	public static void main(String[] args) {
		int arr[]= {2,5,1,4};
		for(int i=0; i<=arr.length-2;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
			
		}
		}
		for(int a:arr) {
			System.out.print(a+",");
		}

	}

}
