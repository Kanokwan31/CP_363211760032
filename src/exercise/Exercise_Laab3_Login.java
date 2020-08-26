package exercise;
import java.util.Scanner;

public class Exercise_Laab3_Login {
    public static void main(String[] args) {
        //define acount
        String username = "Mit212";
        String password = "1234";

        //create Scanner object as sc
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("Username: ");
            String u = sc.nextLine();
            System.out.println("Password: ");
            String p = sc.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcome to MT System.");
                break;
            } else {
                System.out.println("Username or Password is not corected.");
                count++;
                if (count == 3) {
                    System.out.println("Your acount has been locked.Please,contact admin.");
                }

            }

        }
        while (count < 3);
    }
}