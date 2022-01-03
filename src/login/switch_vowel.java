package login;
import java.util.Scanner;
public class switch_vowel {

	public static void main(String[] args) {
		boolean isVowel=false;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch=scanner.next().charAt(0);
		scanner.close();
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':isVowel =true;
		}
		if(isVowel == true) {
			System.out.println(ch+"is a vowel");
		}
		else {
			if(ch>='a'&&ch<='z')
				System.out.println(ch+" is a consonant");
			else
				System.out.println("Input is not an alphabet");
		}
	}

}

