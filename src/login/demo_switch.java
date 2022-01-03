package login;

import java.util.Scanner;

public class demo_switch {
        public static void main(String[] args) {
        	
        	int a=10;
        	int b=20;
        	int ch;
        	System.out.println("Enter user value");
        	Scanner s=new Scanner(System.in);
        	ch=s.nextInt();
        	switch(ch) {
        	case 1:System.out.println(a+b);
        	break;
        	
        	case 2:System.out.println(a*b);
        	break;
        	default:System.out.println("in default");
        	
        	}
        }
}
