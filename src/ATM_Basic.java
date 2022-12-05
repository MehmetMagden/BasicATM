import java.util.Scanner;

public class ATM_Basic {

    static int cardNo = 12341234;
    static String password = "asdfasdf";
    static int balance = 2000;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int enteredCardNumber =0;
        String enteredPassword ="";

        do {
            System.out.println("Please enter your cardNo");
            enteredCardNumber = scan.nextInt();

            System.out.println("Please enter your password");
            enteredPassword = scan.next();

            if (cardNo == enteredCardNumber && password.equals(enteredPassword)) {

                System.out.println("Login is Succesfull");

                ATM_Menu();

            } else {
                System.out.println("Something is wrong");
            }
        } while (cardNo != enteredCardNumber || !password.equals(enteredPassword));
    }

    private static void ATM_Menu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1)Balance\n2)Deposit\n3)Withdraw\n4)Send Money\n5)Quit");
        System.out.println("Please select");
        int swtcr = scan.nextInt();
        int money =0;

        switch (swtcr){

            case 1:
                System.out.println("Your balance is : "+ balance);
                ATM_Menu();
                break;

            case 2:
                System.out.println("Your balance is : "+ balance);
                System.out.println("Please enter the amount you want to deposit");
                money= scan.nextInt();
                balance+=money;
                System.out.println("Your balance is : "+ balance);
                ATM_Menu();
                break;

            case 3:
                System.out.println("Your balance is : "+ balance);
                System.out.println("please enter the amount of money you want to withdraw");
                money= scan.nextInt();
                if (money<=balance){
                    balance=balance-money;
                    System.out.println("Your balance is : "+ balance);
                    ATM_Menu();
                    break;
                }else {
                    System.out.println("you dont have enough money");
                    ATM_Menu();
                    break;
                }

            case 4:
                System.out.println("Your balance is : "+ balance);
                System.out.println("please enter the amount of money you want to send");
                money= scan.nextInt();
                if (money<=balance){
                    balance=balance-money;
                    System.out.println("Your balance is : "+ balance);
                    ATM_Menu();
                    break;
                }else {
                    System.out.println("you dont have enough money");
                    ATM_Menu();
                    break;
                }

            case 5:
                System.out.println("thank you");
                System.exit(0);
        }
    }
}
