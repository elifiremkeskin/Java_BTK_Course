public class CustomerDal implements IEntityRepository<Customer>{
    //burada sadece customera ait kodları doldururuz
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }

    /*@Override
    public void add(Object entity) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void update(Object entity) {

    }*/
    //< > nesneyi belirtmezsen böyle hatalı olur
    //bu generic kısıtlamadır
}
