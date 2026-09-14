import java.util.Scanner;
public class  suminput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter First number:");
    int a=sc.nextInt();
System.out.println("Enter second number:");
     int b=sc.nextInt();
    System.out.println("Sum="+(a+b));
sc.close();
    }
}