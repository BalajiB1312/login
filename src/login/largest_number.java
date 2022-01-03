package login;

public class largest_number {

	public static void main(String[] args) {
		int a=578, b=800, c=925;
		if(a>b&&b>c) {
			System.out.println("Largest Value is:+a");
		}
		else if (b>a&&a>c) {
			System.out.println("Largest Number is :"+b);
		}
		else if(c>b&&b>a) {
			System.out.println("Largest Number is:"+c);
		}else System.out.println("Out of Loop");
		
	}

}
