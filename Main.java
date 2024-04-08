
package company.com;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5 Subject mark:");
        System.out.print("Enter the tamil mark:");
        int T = in.nextInt();
        System.out.print("Enter the english mark:");
        int E = in.nextInt();
        System.out.print("Enter the maths mark:");
        int M = in.nextInt();
        System.out.print("Enter the science mark:");
        int S = in.nextInt();
        System.out.print("Enter the social science mark:");
        int SS = in.nextInt();
        int num = T + E + M + S + SS;
        System.out.println("Total Mark:"+num);
        int average = num / 5;
        System.out.println("Average:" + average);

            if(average>=35&&average<=60) {
                System.out.println("C");
            }
                else if(average>=61&&average<=85) {
                    System.out.println("B");
                }
                    else if (average >= 86 && average <= 100) {
                        System.out.println("A");
                    }
                    else  {
                        System.out.println("Fail");}
    }
}


