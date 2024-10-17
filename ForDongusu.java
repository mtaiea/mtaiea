package baslangic;

public class ForDongusu {

	public static void main(String[] args) { // kullanımı böyle double yerine int vb girebilin 
		for(double c = 1.5;c<=10;c++) {// for(baslagic;kosul;arttırma){kodlar} şeklinde şema
			System.out.println(c);
		}
		for (int k = 1;k<=10;k=k+1) {
			for (int m = 1;m<=10;m=m+1) {
				System.out.println("k =" +k + "  ,m =" +m); // foruda iç içe kullanmak ilerde işimize yarayacak
			}
		}
	}

}
