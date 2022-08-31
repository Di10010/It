import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("Введите число");
        int b = sc.nextInt();
        System.out.println(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }
}