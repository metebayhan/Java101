import java.util.Scanner;
public class DersGecmeDurumu {
    public static void main(String[] args){
        
        double mat, fizik, kimya, tur, muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();
        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();

        if(mat >= 0 && mat <= 100){
            if(tur >= 0 && tur <= 100){
                if(fizik >= 0 && fizik <= 100){
                    if(kimya >= 0 && kimya <= 100){
                        if(muzik >= 0 && muzik <= 100){

                            ortalama = (mat + tur + fizik + kimya + muzik) / 5;
                            if (ortalama >= 55) {
                                System.out.print("Tebrikler! Sınıfı geçtiniz. Ortalamanız :" + ortalama);
                            } else {
                                System.out.print("Sınıfı geçemediniz! Ortalamanız: " + ortalama);
                            }

                        } else {System.out.println("Lütfen geçerli bir not giriniz.");}
                    } else {System.out.println("Lütfen geçerli bir not giriniz.");} 
                } else {System.out.println("Lütfen geçerli bir not giriniz.");}
            } else {
                System.out.println("Lütfen geçerli bir not giriniz.");}
} else {
    System.out.println("Lütfen geçerli bir not giriniz.");
}
input.close();
    } 

}
