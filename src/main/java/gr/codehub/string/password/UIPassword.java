package gr.codehub.string.password;

import java.util.Scanner;

public class UIPassword {

       public void startApp() {
        String password;
        do {
            password = getPassword();
            if (PasswordValidation.acceptPassword(password)) {
                switch (PasswordValidation.countCriteria(password)) {
                    case 2:
                    case 3:
                        System.out.println("Password OK");
                        break;
                    case 4:
                        System.out.println("Strong password");
                        break;
                    case 5:
                        System.out.println("Very Strong password");
                        break;
                }
            } else
                printInvalidInfo();

        } while (wantContinue());
    }


    private String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a password: ");
        String password = scanner.nextLine();
        return password;
    }

    private boolean wantContinue() {
        System.out.println("Do you want to try a new password? (y=yes) ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("y"))
            return true;
        else
            return false;
    }

    private void printInvalidInfo() {
        System.out.println("Invalid password!");
        System.out.println("Please, password length must be at least 8 characters long");
        System.out.println("Additionally, at least 2 out 5 below criteria must be met:");
        System.out.println("1. Password contains at least one uppercase character");
        System.out.println("2. Password contains at least one lowercase character");
        System.out.println("3. Contains at least one number");
        System.out.println("4. Contains at least one special character (e.g., !, _ etc) ");
        System.out.println("5. Cannot contain a sequence of 3 same characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)");
    }
}
