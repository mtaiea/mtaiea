package baslangic;
import java.util.Scanner;
public class SwitchCaseSinifi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz ");
		int sayi = input.nextInt();
		switch (sayi) {
		case 1 :
			System.out.println("Sayı 1 dir");
			break ;
		case 2 :
			System.out.println("Sayı 2");
			break;
		default:
			System.out.println("Sayı 1 veya iki değil ");
	
		}
		
	}

}
