//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseDatabaseManager baseDatabaseManager; //abstract, ileride belirlemen lazım

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager(); //abstract class belirlendi
        customerManager.getCustomer();
    }
}