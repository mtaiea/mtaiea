package baslangic;
import java.util.Scanner;

public class KdvHesaplayıcıProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("   KDV Hesaplayıcısına Hoşgeldiniz  ");
		double urunFiyatı,vergiliFiyat,kdv ;
		kdv=0.18;
		System.out.println("Ürünün fiyatını giriniz :");
		urunFiyatı = input.nextDouble();
		vergiliFiyat = (urunFiyatı+urunFiyatı*kdv);
		System.out.println("Ürünün KDV siz fiyatı :"+urunFiyatı);
		System.out.println("Ürünün KDV li fiyatı :"+vergiliFiyat);
		
	}

}
