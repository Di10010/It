import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int b = a + 1;
        int c = a - 1;
        System.out.println("The next number for the number" + a + " is " + b);
        System.out.println("The next number for the number" + a + " is " + c);
        
        
    }
}