import java.util.Scanner;

public class kdvtutarihesaplama {

	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ücret tutarýný giriniz: ");
		tutar = scan.nextDouble();
		
		kdvOran = tutar > 1000 ? 0.08 : 0.18;
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar: " + tutar);
		System.out.println("KDV Oraný: " + kdvOran);
		System.out.println("KDV Tutarý: " + kdvTutar);
		System.out.println("KDV'li Tutarý: " + kdvliTutar);
		
		

	}

}
