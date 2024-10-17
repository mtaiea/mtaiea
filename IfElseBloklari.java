package baslangic;
import java.util.Scanner;
public class IfElseBloklari {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("A yani ilk sayıyı gir :");
		double a = input.nextDouble();
		System.out.println("B yani ikinci sayıyı gir :");
		double b = input.nextDouble();
		System.out.println("C yani üçüncü sayıyı gir :");
		int c = input.nextInt();
		if((a==b)&&(b ==c)) {System.out.println("Tüm sayılar eşit .");}
		else if (a==b) {System.out.println("\"A B ye eşit .\";");}
		else if (c==b) {System.out.println("\"C B ye eşit .\";");}
		else if (c==a) {System.out.println("\"C A ye eşit .\";");}
		else {System.out.println("Hiçbir sayı birbirine eşit değil .");}
	}

}
