import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        int evensum = 0;
        int oddsum = 0 ;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<100; i++){
            System.out.println("Enter Integer : ");
            int num = sc.nextInt();

            if(num % 2 == 0 ){
                evensum += num;
            }
            else{
                oddsum += num;
            }
        }

        System.out.println("Sum of even integers : " + evensum);
        System.out.println("Sum of odd integers : " + oddsum);
    }
}
