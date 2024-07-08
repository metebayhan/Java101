import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double alan, cevre, merkezAci, pi = 3.14;
        int yaricap;
        Scanner input = new Scanner (System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextInt();
        alan = (pi * yaricap * yaricap);
        cevre = (2 * pi * yaricap);
        System.out.println("Dairenizin Alanı: " + alan);
        System.out.println("Dairenizin Çevresi: " + cevre);
        System.out.println("Merkez Açı (yoksa 360 giriniz): ");
        merkezAci = input.nextDouble();
        double dilimAlan = (alan * merkezAci) / 360;
        System.out.println("Daire diliminizin alanı: " + dilimAlan);
          




    }
    


}
