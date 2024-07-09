import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("Admin") && password.equals("password")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış, şifrenizi sıfırlamak ister misiniz? (0/1)");
            int cevap = input.nextInt();
            input.nextLine();

            switch (cevap) {
                case 1:
                    System.out.print("Yeni şifrenizi girin: ");
                    String newPassword = input.nextLine();
                    if (newPassword.equals("password")) {
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz. Lütfen farklı bir şifre deneyin.");
                    } else {
                        System.out.println("Yeni şifreniz oluşturuldu.");
                    }
                    break;
                case 0:
                    System.out.println("Yeniden giriş yapınız.");
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;
            }
        }

        input.close();
    }
}
