public class Customer {
    int id;
    String firstName;
    String lastName;

    public Customer(){

    }
    //customer bilgilerini alıp kaydederiz
    public Customer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
