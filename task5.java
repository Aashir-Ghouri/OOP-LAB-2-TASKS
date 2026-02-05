import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user;
        String password;
        String cont = "Y";
        Boolean login = false;
        double balance = 0.0;

        do{
            System.out.println("Enter username : ");
            user = sc.next();
            System.out.println("Enter password : ");
            password = sc.next();
            if(user.equals("aashir") && password.equals("abcd")){
                login = true;
                System.out.println("Login successful.");
            }
            else{
                System.out.println("Incorrect credentails ! Try again.");
            }
        }while(login == false);

        do{
            System.out.println("Main Menu **Welcome to Bank of Pakistan**");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Account status");
            System.out.println("Select your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if(balance - withdraw >= 0){
                        System.out.println("Withdraw successful.");
                        balance -= withdraw;
                    }
                    else{
                        System.out.println("Insufficient account balance.");
                    }
                    break;
                case 3:
                    System.out.println("Account Status : Current account.");
                    System.out.println("Account Balance : " + balance);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to continue?[y/Y]: ");
            cont = sc.next();

        }while(cont.equals("Y") || cont.equals("y"));
    }
}
