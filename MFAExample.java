import java.util.Scanner;
import java.util.Random;
public class MFAExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int token = 100000 + random.nextInt(900000);
        String OTP = Integer.toString(token);
        System.out.println("Eneter your user name: ");
        String name = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        System.out.println("Your token is: "+ OTP);
        user u = new user("user123", "user123");
        System.out.println("Enter your OTP: ");
        String otp = sc.nextLine();
        if(otp.equals(OTP)){
            u.validation();
        }
        else{
            System.out.println("Invalid OTP");
        }
        if (u.passvalid(pass)&&u.isValid()&&u.namevalid(name)){
            System.out.println("Successful login");
        }
        else{
            System.out.println("Wrong name or password or OTP");
        }
        sc.close();
    }
}
