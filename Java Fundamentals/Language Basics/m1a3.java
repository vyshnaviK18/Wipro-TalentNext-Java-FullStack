//sum of command args
class m1a3{
    public static void main(String args[]){
        //Write a Program to accept two integers as command line arguments and print the sum of the two numbers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum= num1+num2;
        System.out.print(sum);
        //javac -source 1.8 -target 1.8 sample.java
	    }
}