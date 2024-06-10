
public class checkingarr {
	public static void main(String[] args) {
	    int[] arr = {1, 4, 1, 4}; // Change this array for testing

	    boolean allOneFour = true;

	    for (int num : arr) {
	      if (num != 1 && num != 4) {
	        allOneFour = false;
	        break; // Exit loop if a non-1 or non-4 element is found
	      }
	    }

	    System.out.println("All elements are 1 or 4: " + allOneFour);
	  }

}
