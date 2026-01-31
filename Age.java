import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a=obj.nextInt();
        if (a>=18){
            System.out.println("You are eligible for vote!");
        }
        else{
            System.out.println("You are not eligible for vote!");
        }
    }
}
