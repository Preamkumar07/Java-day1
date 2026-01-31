import java.util.Scanner;
public class ScannerMethods{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=ob.nextInt();
        System.out.println(a);
        System.out.println("enter b value:");
        float b=ob.nextFloat();
        System.out.println(b);
        System.out.println("enter a String:");
        String Str=ob.next();
        System.out.println(Str);
        System.out.println("enter d value:");s
        Double d=ob.nextDouble();
        System.out.println(d);
        System.out.println("entyer e value:");
        short e=ob.nextShort();
        System.out.println(e);
    }
}