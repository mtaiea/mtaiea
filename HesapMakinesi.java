package baslangic;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		System.out.println("   Hesap Makinesine Hoşgeldiniz  ");
		double sayi1,sayi2;
		String bolme,carpma,toplama,cıkarma,usAlma,islem;
		Scanner input = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz :");
		sayi1= input.nextDouble();
		System.out.println("İkinci sayıyı giriniz :");
		sayi2= input.nextDouble();
		input.nextLine();
		System.out.println("İşlem seçiniz giriniz (bolme,cıkarma,carpma,toplama) :");
		islem=input.nextLine();
		bolme="bolme";
		cıkarma = "cıkarma";
		carpma = "carpma";
		toplama = "toplama";
		usAlma="usAlma"; // heniz bunu yamayız gibi 
		if(islem.equals(bolme)) {  // Stringleri karşılastırmak içic equals kullanırız.
			System.out.println("Bolme sonuc :"+(sayi1/sayi2));}
		else if(islem.equals(cıkarma)) {
			System.out.println("Çıkarma sonuc :"+(sayi1-sayi2));
		}
		else if(islem.equals(carpma)) {
			System.out.println("Çarpma sonuc :"+(sayi1*sayi2));
		}
		else if(islem.equals(toplama)) {
			System.out.println("Toplama sonuc :"+(sayi1+sayi2));
		}
		else {
			System.out.println("Yanlış işlem girildi şu işlem kelimelerini ingilizce karakterde yaz veya düzgün yani doğru yaz.");
		}
		
		

	}

}
