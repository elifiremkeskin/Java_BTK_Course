//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,6,7};
        int aranacak = 1;
        sayiBulma(sayilar, aranacak);
        int numbers = topla2(1,2,3,4);

        //diğer classlara erişim için önce çağırmak gerekir
        //classlar referans tiptir
        //referans   ->   new nesne
        CustomerManager customerManager = new CustomerManager();//bellekte nesne üretir
        CustomerManager customerManager2 = new CustomerManager();//bellekte yeni bir referans numarasına konulur
        customerManager = customerManager2; //referans 1in numarası ikiyle aynı oldu 1in tutulduğu heap silinir
        customerManager.add();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        //burada sayi2nin değeri 10dur. int primitive tiptir. heaple bağlantı kurmaz
        //stackte tutar

        int[] sayilar1 = new int[]{1,2,3};  //new diye heapte array nesnesi oluşturdu
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        //burada sayilar[0] = 10 olur çünkü array referans tiptir.
        //stackte referans heapte de arrayin içindeki sayılar tutulur
        //referanslar eşitlendiğinde sayilar2 artık sayilar1in arrayine gider

        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.name = "Laptop";
        productManager.add(product);
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
        return (1);
    }
}