package classobj;


class Box {
	  private int width;
	  private int height;
	  private int depth;

	  // Parameterized constructor 
	  public Box(int width, int height, int depth) {
	    this.width = width;
	    this.height = height;
	    this.depth = depth;
	  }

	  public double getVolume() {
	    return width * height * depth;
	  }
	}
	public class m1a1 {

		public static void main(String[] args) {
			Box box1 = new Box(10, 20, 5);

		    double volume = box1.getVolume();
		    System.out.println("Volume of the box: " + volume);

		}

	}

