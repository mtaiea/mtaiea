package baslangic;

public class MantiksalOperatorler {

	public static void main(String[] args) {
		int a=6;
		int b=16;
		int c=46;
		int d=64;

		boolean sonuc = a<b;
		boolean sonuc2 = c>d;
		boolean anasınuc = sonuc&&sonuc2;
		boolean anasınuc2 = !(sonuc&&sonuc2);
		boolean anasınuc3 = sonuc||sonuc2;
		System.out.println(anasınuc);
		System.out.println(anasınuc2);
		System.out.println(anasınuc3);

	}

}
