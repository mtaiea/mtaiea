package baslangic;
import java.util.Scanner;
public class DaireninAlanınıVeCevresiniHesaplayanProje {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Daire Alanı ve Çevresi Hesaplayıcısına Hoşgeldiniz :");
		double yarıcap,pi,alan,cevre ;
		pi = 3.14;
		System.out.println("Yarıçapı giriniz :");
		yarıcap = input.nextDouble();
		alan = pi*yarıcap*yarıcap;
		cevre = 2*pi*yarıcap;
		System.out.println("Verilen dairenin alanı  :"+alan);
		System.out.println("Verilen dairenin çevresi  :"+cevre);

	}

}
