import java.util.Scanner;

public class kdvtutarihesaplama {

	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�cret tutar�n� giriniz: ");
		tutar = scan.nextDouble();
		
		kdvOran = tutar > 1000 ? 0.08 : 0.18;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar: " + tutar);
		System.out.println("KDV Oran�: " + kdvOran);
		System.out.println("KDV Tutar�: " + kdvTutar);
		System.out.println("KDV'li Tutar�: " + kdvliTutar);
		
		

	}

}
