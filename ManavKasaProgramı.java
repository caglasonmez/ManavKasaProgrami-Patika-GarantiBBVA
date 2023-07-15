package CaglaSonmez;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg ;
        double armutFiyat = 2.14 , elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00 ;
        double toplamFiyat ;

        System.out.print("Armut kaç kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKg = input.nextDouble();

        toplamFiyat = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);
        System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");
    }
}
