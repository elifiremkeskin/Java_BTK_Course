import java.util.Scanner;
import mathmatic.* ; // means mathmatic library all classes

public class Main {
    public static void main(String[] args) {
        System.out.println("Adınız: ");

        Scanner scanner = new Scanner(System.in);
        String isim = scanner.nextLine();
        System.out.println("merhaba "+isim);

        Arithmetic art= new Arithmetic();
        System.out.println(art.sum(4,5));
        Log log =new Log();
        System.out.println(log.logarithm(5));
    }
}