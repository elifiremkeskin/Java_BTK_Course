import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //bu array her türlü objeyi alır
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(10);
        list.add("ankara");

        list.add(1,100);
        System.out.println(list.get(1));

        //type safe array, sadece stringle çalışır, tercih edilir
        ArrayList<String> sehirler = new ArrayList<String>();

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer solvian = new Customer(1,"solvian", "brugmansia");
        customers.add(new Customer(1,"clive", "donovan"));
        customers.add(new Customer(1,"angel", "ren"));
        customers.add(solvian);

        customers.remove(solvian);
        //bu çalışır çünkü referansı kullanarak silme işlemi yapıyoruz

        //customers.remove(new Customer(1,"clive", "donovan"));
        //bu çalışmaz çünkü new dediğinde yeni bir referans num oluşuyor(c# pointer mantığı)

        for (Customer customer : customers){
            System.out.println(customer.firstName);
        }

        HashMap<String, String> sozluk = new HashMap<String, String>();
        //ilk eleman key ikincisi data
        //dataya ulaşmak üstünde işlem yapmak için anahtarı kullanıyoruz
        sozluk.put("clive", "fallen devotion");
        sozluk.put("ren", "14dwy");
        sozluk.put("solvian", "the kid atb");

        System.out.println(sozluk.get("clive"));

        // keyset tüm keyleri liste verir
        for(String key : sozluk.keySet()){
            System.out.println(key);
            System.out.println("karakter: "+key +" ,bulunduğu oyun: "+sozluk.get(key));
        }
    }
}