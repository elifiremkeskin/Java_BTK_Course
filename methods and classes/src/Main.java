//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,6,7};
        int aranacak = 1;
        sayiBulma(sayilar, aranacak);
        int numbers = topla2(1,2,3,4);

    }

    //void istenen şeyi yapan metotlardır, sonuç döndürmez
    public static void sayiBulma(int[] sayilar, int a){
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi==a){
                varMi = true;
                break;
            }
        }

        mesajVer(varMi);
    }
    public static void mesajVer(boolean varMi) {
        if(varMi==true){
            System.out.printf("bu sayı dizide var");
        }
        else {
            System.out.printf("bu sayı dizide yok");
        }
    }

    public static int topla(){
        int a = 1;
        return(a);
    }

    //birden fazla parametre alması için ... koy array gibi çalışır
    public static int topla2(int... numbers){

    }
}