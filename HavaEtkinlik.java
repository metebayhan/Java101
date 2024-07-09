import java.util.Scanner;
public class HavaEtkinlik {
    public static void main(String[] args){
        double isi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklığı giriniz: ");
        isi = input.nextDouble();

        if (isi < 5) {
            System.out.println("Kayak yapabilirsiniz!");
        } else if (isi >= 5 && isi < 15) {
            System.out.println("Sinemaya gidebilirsiniz!");
        } else if (isi >= 15 && isi < 25) {
            System.out.println("Pikniğe gidebilirsiniz!");
        } else if (isi >= 25 && isi <= 60) {
            System.out.println("Yüzmeye gidebilirsiniz!");
        } else {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }
        input.close();
    }
}
