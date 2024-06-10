
public class Sumofarr {

	public static void main(String[] args) {
		int arr[]= {12,23,24};
		int sum=0;
		for(int i: arr) {
			sum+=i;
		}
		int avg=sum/arr.length;
		System.out.println("Sum="+sum+" Average="+avg);

	}

}