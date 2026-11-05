public class OgretmenKrediManager extends BaseKrediManager {
    //hesapla fonkfiyonunu Base kredi managerdekiyle aynı şekilde yazıldı
    //artık öğretmen için hesapla fonksiyonu kullanıldığında bu hesap kullanılacak
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
