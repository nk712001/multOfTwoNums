import java.util.Scanner;

public class multOfTwo {
    public static void main(String[] args) {
        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of a: ");
        a=input.nextInt();

        System.out.println("enter the value of b: ");
        b=input.nextInt();
        
        input.close();
        int pro = a*b;
        System.out.println("multiplication of given numbers is: "+pro);

    }
}
