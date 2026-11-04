public class ProductManager {
    public static void add(Product product){
        // işlemler yapılır
        System.out.println("ürün eklendi " + product);
    }
    //add bu şekilde belirtilmek yerine özellikleri içerseydi mainde çağırıldığında
    //yeni bir özellik ekleneceği zaman bütün çağrılar hata verirdi ve düzeltilmesi gerekirdi
    //bu sebeple bu işlem ve tutulan bilgiler birbirinden ayrı tutulmalıdır
}
