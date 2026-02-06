import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice ="";
        do{
            System.out.println("Enter item name : ");
            String item1 = sc.next();
            System.out.println("Enter price : ");
            int price1 = sc.nextInt();
            System.out.println("Enter item name : ");
            String item2 = sc.next();
            System.out.println("Enter price : ");
            int price2 = sc.nextInt();
            System.out.println("Enter item name : ");
            String item3 = sc.next();
            System.out.println("Enter price : ");
            int price3 = sc.nextInt();
            System.out.println("Enter item name : ");
            String item4 = sc.next();
            System.out.println("Enter price : ");
            int price4 = sc.nextInt();
            System.out.println("Enter item name : ");
            String item5 = sc.next();
            System.out.println("Enter price : ");
            int price5 = sc.nextInt();

            double subtotal = price1+price2+price3+price4+price5;
            double discountamount = subtotal * 0.1;
            double withouttax = subtotal - discountamount;
            double salestax = withouttax * 0.05;
            double invoice = withouttax + salestax;

            System.out.println("Subtotal : " + subtotal);
            System.out.println("Discount percent : 10");
            System.out.println("Discount amount : " + discountamount);
            System.out.println("Total before tax : " + withouttax);
            System.out.println("Sales Tax : 5");
            System.out.println("Invoice total : " + invoice);


            System.out.println("Continue(y/n) : ");
            choice = sc.next();
        }while(choice.equals("y") || choice.equals("Y"));
    }
}
