import java.util.Scanner;
public class Manav {   
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67 , domates = 1.11, muz = 0.95, patlican = 5.00; 
        double armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;
        double toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız? : ");
        armutMiktar = input.nextDouble() * armut;
        System.out.print("Kaç kilo elma aldınız? : ");
        elmaMiktar = input.nextDouble() * elma;
        System.out.print("Kaç kilo domates aldınız? : ");
        domatesMiktar = input.nextDouble() * domates;
        System.out.print("Kaç kilo muz aldınız? : ");
        muzMiktar = input.nextDouble() * muz;
        System.out.print("Kaç kilo patlıcan aldınız? : ");
        patlicanMiktar = input.nextDouble() * patlican;

        toplam = armutMiktar + elmaMiktar + domatesMiktar + muzMiktar + patlicanMiktar;
        System.out.println("Toplam ücretiniz: " + toplam + "TL.");


    }
    
}
