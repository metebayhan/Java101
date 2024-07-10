import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0 ) ||  (yil % 400 == 0)) {
        System.out.print("Yılınız, bir artık yıl!");
        } else { 
            System.out.print("Yılınız, bir artık yıl değil!");
        }
        input.close();
    }
}
