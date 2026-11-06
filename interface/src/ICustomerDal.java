public interface ICustomerDal {
    //naming kuralı interface olduğu için başına I koyduk
    //interfaceler class değildir ama benzer çalışır
    //bi class birden fazla classi extend edemez ama birden fazla interfacei extend

    void Add();
    //bir interfacein üyeleri zaten public ve abstracttır
}
