public class searchelement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int ele=2;
		int flag=0;
		int index=-1;
		int a=-1;
		for(int i:arr) {
			a++;
			if (i==ele){
				flag=1;
				index=a;
				break;
			}
		}
		if (flag==1) {
			System.out.println(index);
		}
		else {
			System.out.println(index);
		}

	}

}
