import java.util.Scanner;
public class Hipotenus{
    public static void main(String[] args) {
        double dikA, dikB;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci dik kenar uzunluğunu giriniz: ");
        dikA = input.nextDouble();
        System.out.println("İkinci dik kenar uzunluğunu giriniz: ");
        dikB = input.nextDouble();
        double hipotenus = Math.sqrt((dikA * dikA) + (dikB * dikB));
        System.out.println("Üçgenin hipotenüsü: " + hipotenus + "cm");
        double ucgenAlan = (dikA * dikB) / 2;
        System.out.println("Üçgenin alanı: " + ucgenAlan + "cm2");
    

    }
        

}