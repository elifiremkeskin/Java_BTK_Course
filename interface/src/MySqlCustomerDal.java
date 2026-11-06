public class MySqlCustomerDal implements ICustomerDal, IRepository{
    //Dal = data access layer
    //birden fazla interface eklenebilir
    @Override
    public void Add() {
        System.out.println("My sql eklendi");

    }
}
