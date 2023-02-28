import java.util.Scanner;

public class binaryDecimalConvertor extends Methods{
    public long toBin(){
        System.out.print("Enter a Decimal number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return Long.parseLong(Integer.toBinaryString(a));
    }

    public int toDec(){
        System.out.println("Enter a binary number: ");
        Scanner scan = new Scanner(System.in);
        String binaryString = scan.nextLine();
        return Integer.parseInt(binaryString,2);
    }

    public int toHex(){
        Scanner ui = new Scanner(System.in);
        int a = ui.nextInt();
        String x = Integer.toHexString(a);
        return Integer.parseInt(x);
    }

    public long DtoH(){
        Scanner s = new Scanner(System.in);
        String hex = s.nextLine();
        long decimal = Integer.parseInt(hex,16);
        return decimal;
    }

    public long HtoB(){
        Scanner s = new Scanner(System.in);
        String hex = s.nextLine();
        long decimal = Integer.parseInt(hex,16);
        return Long.parseLong(Integer.toBinaryString((int) decimal));
    }
}
