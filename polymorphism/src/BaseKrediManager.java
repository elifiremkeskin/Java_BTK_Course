public class BaseKrediManager {
    //public final double hesapla şeklinde yazılsaydı bu fonksiyon çocukları tarafından override edilemezdi
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
}
