import java.util.Scanner;
public class Camzl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num%2 == 1){
            System.out.print("She loves me.");
        }
        else {
            System.out.print("She loves me not.");
        }
    }
}
