import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Data pengguna yang sudah terdaftar
        String registeredUsername = "aqila";
        String registeredPassword = "aqila78";
        
        // Membuat captcha secara acak
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            captcha.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        
        // Proses login
        System.out.println("Silakan masuk:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        // Memeriksa captcha
        System.out.println("Captcha: " + captcha);
        System.out.print("Masukkan captcha: ");
        String inputCaptcha = scanner.nextLine();
        
        // Memeriksa kredensial dan captcha
        if (username.equalsIgnoreCase(registeredUsername) && password.equals(registeredPassword) && inputCaptcha.equals(captcha.toString())) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username, password, atau captcha salah.");
        }
        
        scanner.close();
    }
}
