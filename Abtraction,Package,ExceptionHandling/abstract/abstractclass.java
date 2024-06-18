import java.util.Random;

abstract class compartment{
	abstract void notice();
}
class Firstclass extends compartment{
	void notice() {
		System.out.println("First class compartmant");
	}
}
class Ladies extends compartment{
	void notice() {
		System.out.println("Ladies compartmant");
	}
}
class General extends compartment{
	void notice() {
		System.out.println("General compartmant");
	}
}
class Luggage extends compartment{
	void notice() {
		System.out.println("Luggage compartmant");
	}
}
public class abstractclass {

	public static void main(String[] args) {
		int[] arr = new int[10];
        Random random = new Random();
        
      //general way of obj creation  
//        Firstclass fc =new Firstclass();
//        Ladies l=new Ladies();
//        General g=new General();
//        Luggage lu=new Luggage();
        
        
      
      
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4) + 1; 
        }
        //polymorphism
        for(int i:arr) {
        	compartment comp;
        	switch(i) {
        	case 1:
        		comp= new Firstclass();
        		comp.notice();
        		//fc.notice();
        		break;
        	case 2:
        		comp= new Ladies();
        		comp.notice();
        		//l.notice();
        		break;
        	case 3:
        		//g.notice();
        		comp= new General();
        		comp.notice();
        		break;
        	case 4:
        		//lu.notice();
        		comp= new Luggage();
        		comp.notice();
        		break;	
        	}
        	
        }

	}

}
