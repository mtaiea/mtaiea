package baslangic;
import java.util.Scanner;
public class SınıfGecmeProjesi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("    Sınıf Atlama Hesaplayıcıya Hoşgeldiniz  ");
		int turkce,fen,matematik,sosyal,beden;
		double ortalama;
		System.out.println("Türkçe notunu giriniz :");
		turkce= input.nextInt();
		System.out.println("Matemtaik notunu giriniz :");
		fen= input.nextInt();
		System.out.println("Fen notunu giriniz :");
		matematik= input.nextInt();
		System.out.println("Sosyal notunu giriniz :");
		sosyal= input.nextInt();
		System.out.println("Beden notunu giriniz :");
		beden= input.nextInt();
		ortalama = (turkce*0.3+fen*0.2+matematik*0.3+sosyal*0.1+beden*0.1);
		System.out.println("Ortalanız  :"+ortalama);
		if (ortalama>50) {
			System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
		}
		else {
			System.out.println("Çifte dikiş yapmaya hoş geldin (Kaldın kısaca).");
		}
	}

}
