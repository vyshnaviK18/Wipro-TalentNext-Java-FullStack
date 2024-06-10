
public class middleway {

	public static void main(String[] args) {
		int a[]= {2,3,4};
		int b[]= {2,5,4};
		int n=1;
		int c[]= new int[2];
		c[n-1]=a[n];
		c[n]=b[n];
		for(int i:c) {
			System.out.println(i);
		}

	}

}
