package method;

public class whyMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTwoTimes("A", "_");
		printTwoTimes("B", "*");
	}
	
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
