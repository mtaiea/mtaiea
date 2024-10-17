package baslangic;
import java.util.Scanner;
public class ContinueAndBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi;
		System.out.println("Gizli sayı girdiğin sayı değil bulamassan sonsuz kadar döncek bu ");
		while(true) {
			System.out.println("Bir sayı giriniz :");
			sayi = scan.nextInt();
			System.out.println("Sayı "+sayi+" değil");
			if(sayi == 3) {
				System.out.println("Gizli sayı 3 tü .");
				break;
			}
		}
		
		for(int sayi2=3;sayi2<10;sayi2=sayi2+2) {
			
			if(sayi2 == 5 || sayi2 ==9) {
				//System.out.println(sayi2+"sayısı atlandı."); buraya özel kodlar girebilirsin
				continue;
			}
			System.out.println(sayi2);

		}
		
	}

}
