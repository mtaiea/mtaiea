package baslangic;
import java.util.Scanner;
public class Girilen3SayıyıSıralamaProjesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("Lütfen birbirinden farklı sayılar giriniz.");
		System.out.println("ilk sayıyı(a) giriniz:");
		a = input.nextInt();
		System.out.println("ikinci sayıyı(b) giriniz:");
		b = input.nextInt();
		System.out.println("Üçüncü sayıyı(c) giriniz:");
		c = input.nextInt();
		if (a>b && a>c) {
			if(b>c) {
				System.out.println("a>b>c");
			}
			else {System.out.println("a>c>b");}
		}
		
		else if (b>a && b>c) {
			if(a>c) {
				System.out.println("b>a>c");}
			else {System.out.println("b>c>a");}}
		
		else if (c>b && c>a) {
			if(b>a) {
				System.out.println("c>b>a");
			}
			else {System.out.println("c>a>b");}
		}			
	}
}