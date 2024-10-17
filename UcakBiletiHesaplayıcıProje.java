package baslangic;
import java.util.Scanner;

public class UcakBiletiHesaplayıcıProje {

	public static void main(String[] args) {
		// km birim fiyatı 0.105
		// 12 yaşından küçükse %50 indirim
		// 12 24 arası ise %20 indiridm 
		// 65 ten büyükse % 30 indirim 
		// gidiş dönüş alırsa %20 indirim
		Scanner input= new Scanner(System.in);
		double km,kmFiyat,yas,yasFiyat12,yasFiyat12to24,yasFiyat65plus;
		String yon;
		System.out.println("   Uçak Bileti Hesaplayıcıya Hoşgeldiniz ArıAirlines İyi Uçuşlar Diler ");
		System.out.println("Kaç km gideceksiniz :");
		km=input.nextDouble();
		kmFiyat= km*0.10;
		System.out.println("Gidiş geliş mi (değilse tek yön)(Evet yada hayır) ?:");
		input.nextLine(); // tuzak yakalayıcı üstten gelen tuzağı yakaladı
		yon = input.nextLine().toUpperCase();
		if (yon.equals("EVET")) {kmFiyat=kmFiyat*1.6;}
		else if(yon.equals("HAYIR")) {
			System.out.println("Gidiş geliş indiriminden faydalanmadınız.");}
		else {
			System.out.println("Geçersiz istek .Evet veya hayır yazmak bu kadar zor olmamalı !");
			return;}
		// buraya değişken 
		System.out.println("Yaş giriniz  :");
		yas = input.nextInt();
		if(yas<=12) {
			yasFiyat12=kmFiyat*0.5;
			System.out.println("Bilet tutarınız :"+"$"+yasFiyat12);}
		else if (12<yas && yas<=24) {
			yasFiyat12to24 = kmFiyat*0.8;
			System.out.println("Bilet tutarınız :"+"$"+yasFiyat12to24);}
		else if (24<yas && yas<65) {
			kmFiyat=kmFiyat; // yazılmasına gerek yok ama estetik dursun diye yazdık 
			System.out.println("Bilet tutarınız :"+"$"+kmFiyat);}
		else if (yas > 65 && yas<150) {
			yasFiyat65plus=kmFiyat*0.7;
			System.out.println("Bilet tutarınız :"+"$"+yasFiyat65plus);}
		else {
			System.out.println("150 yaşından büyük değilsinizdir veya yaşınız eksi de olamaz.Tekrar deneyin.");
		}
	}
}
