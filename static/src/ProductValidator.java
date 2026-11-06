public class ProductValidator {

    public ProductValidator(){
        System.out.println("constructor çalıştı");
    }// yapıcı bloklar sadece newlendiğinde çalışır
    //static kullandığında newleme olmadığı için bu çalışmaz

    //bunu static yapabiliriz çünkü bi kere oluşturulup prokram kapatılana kadar kullanılabilir.
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    //inner class oluşturalım
    //main class içinde başka classlar oluşturabilirsiniz
    //static olmalılar
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
