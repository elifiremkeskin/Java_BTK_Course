public class ProductManager {
    //validator static olmasaydı new diye yeni bir nesne oluşturmamız gerekirdi
    //ama static olduğu için ProductValidator.isValid şeklinde kullanılabilir
    //Product manager static olamaz çünkü yeni ürün eklendikçe yeniden oluşturulması gerekecek
    //ürünle işin bittiğinde de tutulmayacak silinecek. static olsaydı asla silinmezdi

    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("ürün veri tabanına eklendi");
        }
        else{
            System.out.println("ürün eklenemedi");
        }
    }
}
