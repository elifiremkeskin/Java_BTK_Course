//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Milk";
        product.price = 10;
        productManager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
        //inner classlar pek önerilmez çünkü solide aykırıdır
        //tek class tek iş yapmalı, içiçe yazmak yerine ayrı classlar oluşturulsa daha iyi

    }
}