import java.util.Scanner;

public class GelismisHesapMakinesi {

    public static int Toplama(Scanner input){
        System.out.print("a sayısını giriniz (a + b): ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz (a + b): ");
        int b = input.nextInt();
        int sonuc = a + b;
        System.out.println(a + " + " + b + " = " + sonuc);
        return sonuc;
    }
    
    public static int Cikarma(Scanner input){
        System.out.print("a sayısını giriniz (a - b): ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz (a - b): ");
        int b = input.nextInt();
        int sonuc = a - b;
        System.out.println(a + " - " + b + " = " + sonuc);
        return sonuc;
    }

    public static int Carpma(Scanner input){
        System.out.print("a sayısını giriniz (a x b): ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz (a x b): ");
        int b = input.nextInt();
        int sonuc = a * b;
        System.out.println(a + " x " + b + " = " + sonuc);
        return sonuc;
    }
    
    public static int Bolme(Scanner input){
        System.out.print("a sayısını giriniz (a / b): ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz (a / b): ");
        int b = input.nextInt();
        int sonuc = a / b;
        System.out.println(a + " / " + b + " = " + sonuc);
        return sonuc;
    }    

    public static int usAlma(Scanner input){
        System.out.print("Üssünü alacağınız sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int b = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++ ){
            sonuc *= a;
        }
        System.out.println(a + "^" + b + " = " + sonuc);
        return sonuc;
    }

    public static int Faktoriyel(Scanner input){
        System.out.print("Faktöriyelini hesaplayacağınız sayıyı giriniz: ");
        int a = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++){
            sonuc *= i;    
        }
        System.out.println(a + "! = " + sonuc);
        return sonuc;
    }

    public static int modAlma(Scanner input){
        System.out.print("a sayısını giriniz (a % b): ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz (a % b): ");
        int b = input.nextInt();
        int sonuc = a % b;
        System.out.println(a + " % " + b + " = " + sonuc);
        return sonuc;
    }

    public static void dkAlanCevre(Scanner input){
        System.out.print("a uzunluğunu giriniz: ");
        int a = input.nextInt();
        System.out.print("b uzunluğunu giriniz: ");
        int b = input.nextInt();
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int secim = 0;
        while (secim != 9) {
            System.out.println("Toplama [1] | Çıkarma [2] | Çarpma [3] | Bölme [4] ");
            System.out.println("Üslü Sayı Hesaplama [5] | Faktöriyel Hesaplama [6] | Mod Alma [7] | Dikdörtgen Alan/Çevre Hesaplama [8]");
            System.out.println("Çıkış Yap [9]");
            System.out.print("Yapılacak işlemi giriniz: ");
            secim = input.nextInt();

            switch (secim){
                case 1:
                    Toplama(input);
                    break;
                case 2:
                    Cikarma(input);
                    break;
                case 3:
                    Carpma(input);
                    break;
                case 4:
                    Bolme(input);
                    break;
                case 5:
                    usAlma(input);
                    break;
                case 6:
                    Faktoriyel(input);
                    break;
                case 7: 
                    modAlma(input);
                    break;
                case 8: 
                    dkAlanCevre(input);
                    break;
                case 9: 
                    System.out.println("Çıkış yaptınız.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
        input.close();
    }
}
