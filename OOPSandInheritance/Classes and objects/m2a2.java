package classobj;

class calculator{
	double powerInt(int num1,int num2) {
		return Math.pow(num1, num2);
	}
	double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
}

public class m2a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal=new calculator();
		System.out.println(cal.powerInt(2, 3));
		System.out.println(cal.powerDouble(2, 3));

	}

}
