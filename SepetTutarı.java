import java.util.Scanner;

public class SepetTutarı {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double salatalik = 3.14;
		double elma=4.11;
		double kabak=2.22;
		double domates=0.95;
		double patlican=7.00;
		
		System.out.print("Salatalık Kaç Kilo :");
		double salatalikKilo =sc.nextDouble();
		
		System.out.print("Elma Kaç Kilo :");
		double elmaKilo =sc.nextDouble();
		
		System.out.print("Kabak Kaç Kilo :");
		double kabakKilo =sc.nextDouble();
		
		System.out.print("Domates Kaç Kilo :");
		double domatesKilo =sc.nextDouble();
		
		System.out.print("Patlıcan Kaç Kilo :");
		double patlicanKilo =sc.nextDouble();
		
		double toplam = (salatalik * salatalikKilo) + (elmaKilo * elma) + (kabakKilo * kabak) + (domatesKilo * domates) + (patlicanKilo * patlican);
		System.out.println("Toplam Tutar : " + toplam + "TL");

	}

}
