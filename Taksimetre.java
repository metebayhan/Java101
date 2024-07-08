import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, toplam = 20, perKm = 2.20, ucret;
        Scanner input = new Scanner (System.in);
        System.out.println("Gidilen mesafeyi giriniz: ");
        km = input.nextDouble();
        toplam = (km * perKm);
        ucret = (toplam <= 20) ? 20 : toplam;
        System.out.println("Ücretiniz: " + ucret + "TL");

        

    }
}
