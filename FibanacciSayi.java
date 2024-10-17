package baslangic;

public class FibanacciSayi {

	public static void main(String[] args) {
		double n=0;
		double m =1;
		double a=1440;
		double toplam=1;
		while(a>2) {
		toplam=m+n;
		n=m;
		m=toplam;
		System.out.println(n);
		a--;
		}
	}

}
