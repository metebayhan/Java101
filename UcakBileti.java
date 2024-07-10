import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double yas, km, ucret, mesafeBasi = 0.10;
        int gidis;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextDouble();
        
        System.out.print("Gidilecek mesafeyi KM cinsinden giriniz: ");
        km = input.nextDouble();
        
        System.out.print("Gidişiniz tek yönlü mü, çift yönlü mü olacak? (tek = 1 / çift = 2) ");
        gidis = input.nextInt();
        
        if (yas > 0 && km > 0 && (gidis == 1 || gidis == 2)) {
            ucret = km * mesafeBasi;
            
            if (yas < 12) {
                ucret *= 0.5;  
            } else if (yas >= 12 && yas <= 24) {
                ucret *= 0.9;  
            } else if (yas >= 65) {
                ucret *= 0.7;  
            }
            
            if (gidis == 2) {
                ucret *= 2;  
                ucret *= 0.8;  
            }
            
            System.out.println("Ödeyeceğiniz tutar: " + ucret);
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        
        input.close();
    }
}
