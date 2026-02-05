import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer to print its table : ");
        num = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

}
