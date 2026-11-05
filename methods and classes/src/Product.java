public class Product {
    //constructer fonksiyon bu metot için her nesne oluşturulduğunda (new) çalışır
    //çağırılması gerekmez, başka bir classta nesne oluşturulması yeterlidir
    public Product(){
        System.out.println("pruduct nesnesi oluşturuldu");
    }

    private int id;
    //getter ve setter daha kolay yamak için id üstüne sağ tık
    //refactor
    //encapculates field seçip oradan istediklerinin hepsinde değişiklik yapabilirsin
    private String name;
    private int stock;
    private int price;
    private String description;

    //encapculation olması parçaların kendi bölgelerinin birbirinden ayrı olmasını gerektirir
    //bu classta özellikler tutulur
    //yeni bir özellik ekleneceği zaman da buraya eklenir

    //getter
    //private olan bir birimin başka classlardan okunmasını sağlar
    //geri dönüşlüdür çünkü o classa bilgi gönderiyosun
    public int getId(){
        return id;
    }

    //setter
    //private olan elemanın başka bir classta değer alabilmesini sağlar
    //alınabilmesi için veri tipi belirtilmeli
    public void setId(int id){
        this.id = id; //this isimlerin karışmaması için eklenir
        //this olan id içinde bulunduğu classın idsi
        // _id kullanımı da sık sık görülür
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
