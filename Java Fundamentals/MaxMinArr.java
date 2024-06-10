public class MaxMinArr {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int max=0;
		int min=arr[0];
		for(int x:arr) {
			if(x>max) {
				max=x;
			}
			else if(x<min) {
				min=x;
			}
		}
		System.out.println("max= "+max+" min= "+min);
	}
}

