package login;

public class tkeyword {
void m() {
	System.out.println("1");
}
void m2()  {
	this.m();
	System.out.println("2");
}
	public static void main(String[] args) {
	tkeyword c=new tkeyword();
	
	c.m2();
	}

}
