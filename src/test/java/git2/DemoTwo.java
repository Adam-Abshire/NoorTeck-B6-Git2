package git2;
// comment from remote..
public class DemoTwo {
	
	public static void main(String[] args) {
		System.out.println("Git demo 2....");
		add(1, 2);
		subtract(3, 2);
		multiply(5, 2);
	}
	
	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	public static void subtract(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}
	
	public static void divide(int a, int b){
		System.out.println(a + " / " + b + " = " + (a / b));
	}
}
