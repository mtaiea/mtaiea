package baslangic;

public class AritmetikkIslemler {

	public static void main(String[] args) {
		int a = 84;
		int b = 12;
		int toplam = a+b;
		int cikarma= a-b;
		int carpma = a*b;
		double bolme = a/b;
		System.out.println("A ve B nin toplamı :"+toplam);
		System.out.println("A ve B nin cikarması :"+cikarma);
		System.out.println("A ve B nin carpması :"+carpma);
		System.out.println("A ve B nin bolmesi :"+bolme);
		toplam++;
		System.out.println(toplam);
		cikarma--;
		System.out.println(cikarma);
		int sonuc = a - b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(sonuc);
		
		int sayi = 3 ;
		int sayi2 = 10 ;
		boolean kosul = sayi == sayi2;
		System.out.println(kosul);
		boolean kosul2 = sayi != sayi2;
		System.out.println(kosul2);
		boolean sonuc2 = kosul && kosul2;
		// ve anlamı var ikisi doğru olmadıktan sonra true dondurmez
		System.out.println(sonuc2);
		sonuc2 = kosul || kosul2;
		// veya anlamı var 1i olsun yeter true olur
		System.out.println(sonuc2);
		
		String b1 = (a==b) ? "Doğru":"Yanlış";
		// koşul bu dogruysa ilk yazdığımızı yanlışsa dğier yazdığımızı dondurur
		System.out.println(b1);
	}

}
