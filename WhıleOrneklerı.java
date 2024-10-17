package baslangic;
import java.util.Scanner;
public class WhıleOrneklerı {

	public static void main(String[] args) {
		//1  1den 100 e kadar çift sauyıları yazdıran kod
		//2  negatif bir değer girene kadar gidileri kabul eden ve değerlerden tek sayıları toplayan 
		//3  girilen sayıya kadar olan 2nin kuvvetlerini yazdıran 
		Scanner scan = new Scanner(System.in);
		//1.örnek
		for(int a = 1;a<=100;a++) {
			if (a%2==0) {
				System.out.println(a);
			}
		}
		//-------------------------------------------------
		//2.örnek
		int sayi;
		int toplam1 = 0;
		while(true) {
		System.out.println("Lütfen bir sayı giriniz (Eksi sayı girinceye kadar çalışacak):");
		sayi = scan.nextInt();
		if (sayi>0) {
			if (sayi%2==1) {
				toplam1 = toplam1+sayi;
			}
			else {continue;}	}
		if(sayi<=0) {
			System.out.println("Girilen tek sayıların toplamı : "+toplam1);
			break;
		}
		
		}
		
		//-----------------------------------------------------
		//3.örnek
		Scanner scan1 = new Scanner(System.in);	
		System.out.println("Bir sayı giriniz : ");
		int sayi7,sayi21;
		sayi21=2;
		double toplam=0;
		sayi7=scan1.nextInt();
		while(sayi7>sayi21) {
			System.out.println(sayi21);
			sayi21=sayi21*2;
			toplam=(toplam+sayi21/2);
			
		}
		System.out.println(" Girilen sayının 2nin katlarına kadarki  toplamı  :"+toplam);
			
		
		
		
	
	}
}
