import java.util.Scanner;
public class NotOrtalamasi {
  public static void main (String[] args) {
      int mat, fizik, tarih, kimya, tur, muz;
    
      Scanner inp = new Scanner (System.in);
  
      System.out.println("Matematik Notunuz: ");
      mat = inp.nextInt();

      System.out.println("Fizik Notunuz: ");
      fizik = inp.nextInt();

      System.out.println("Tarih Notunuz: ");
      tarih = inp.nextInt();

      System.out.println("Kimya Notunuz: ");
      kimya = inp.nextInt();

      System.out.println("Türkçe Notunuz: ");
      tur = inp.nextInt();

      System.out.println("Müzik Notunuz: ");
      muz = inp.nextInt();

        int notToplami = mat + fizik + tarih + kimya + tur + muz;
        double notOrtalamasi = notToplami / 6;
        String sonuc = (notOrtalamasi >= 60 ? "Sınıfı geçtiniz." : "Sınıfı geçemediniz." );
        System.out.println("Not Ortalamanız: " +  notOrtalamasi);
        System.out.println(sonuc);
  } 
  }