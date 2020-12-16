import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
    System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
    Scanner obj = new Scanner(System.in);
    int m=obj.nextInt();
    System.out.println("Enter Year:"); 
    int Y=obj.nextInt();
    System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
    int d=obj.nextInt();
            int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(Y%4==0)
             days[2]=29;
            System.out.println("             Calendar               ");
            System.out.println("   S    M    Tu   W    T    F    S");
            for (int i = 0; i < d; i++){
                if(d==7)
                break;
            System.out.print("     ");
            }
            for (int i = 1; i <= days[m]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + d) % 7 == 0) || (i == days[m])) 
                System.out.println();
            }
        }
    }