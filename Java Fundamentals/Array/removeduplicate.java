
public class removeduplicate {
	public static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 2, 2, 2};
        int n = a.length;
        //sort
        for(int i=0; i<=a.length-2;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					int tem= a[i];
					a[i]=a[j];
					a[j]=tem;
			}
			
		}
		}
        
        n = removeDuplicates(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
