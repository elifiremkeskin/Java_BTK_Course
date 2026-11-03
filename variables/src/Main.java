//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables

        int num = 21;
        String message = "örnek sayı: ";
        System.out.println(message + num);
        double half = 12.5;
        char a = 'a';
        boolean isItTrue = true;

        //conditions

        if (num < 20) {
            System.out.println("sayı yirmiden küçüktür");
        }
        else if (num == 20) {
            System.out.println("sayı yirmiye eşittir");
        }
        else{
            System.out.println("sayı yirmiden büyüktür");
        }

        //even or odd
        boolean remainder = false;
        if (num % 2 == 1){
            remainder = true;
            System.out.println("sayı tektir");
        }
        else {
            remainder = false;
            System.out.println("sayı çifttir");
        }

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("geçtiniz");
                break;
            case 'B':
                System.out.println("geçtiniz");
                break;
            case 'C':
                System.out.println("geçtiniz");
                break;
            case 'D':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("geçersiz not");
        }
    }
}