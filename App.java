import java.util.Scanner;

public class App extends Methods{
    public static void main(String[] args) {
        binaryDecimalConvertor bdc = new binaryDecimalConvertor();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String a = scanner.nextLine();
            if (a.equals("DtoB")) {
                long x = bdc.toBin();
                System.out.println(x);
            } else if (a.equals("BtoD")) {
                int x = bdc.toDec();
                System.out.println(x);
            } else if (a.equals("HtoD")) {
                long x = bdc.DtoH();
                System.out.println(x);
            } else if (a.equals("HtoB")) {
                long x = bdc.HtoB();
                System.out.println(x);
            } else if (a.equals("exit")) {
                break;
            }
        }
    }
}
