import java.util.Scanner;
public class task4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        int passcount=0;
        int failcount=0;
        int total=0;
        double avg=0.0;

        System.out.println("Enter number of students : ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter marks for #" + (i+1) + " Student : ");
            arr[i] = sc.nextInt();

            total += arr[i];

            if(arr[i] >= 60){
                passcount++;
            }
            else{
                failcount++;
            }
        }
        avg = total/n;

        System.out.println("Number of students who passed : " + passcount);
        System.out.println("Number of students who failed : " + failcount);
        System.out.println("The average number of marks : " + avg);
    }
}
