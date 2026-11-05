public abstract class GameCalculator {
    //abstract sınıf bir sınıf türüdür
    //içinde belirlediğin abstract fonksiyonlar çocuklarda bulunmak ve override edilmek zorundadır
    public abstract void hesapla();

    public final void gameOver(){
        System.out.print("oyun bitti");
    }
}
