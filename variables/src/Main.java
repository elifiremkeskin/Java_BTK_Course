//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables

        int num = 21;
        String message = "örnek sayı: ";
        System.out.println(message + num);
        double half = 12.5;
        char a = 'a';
        boolean isItTrue = true;

        //conditions

        if (num < 20) {
            System.out.println("smaller than 20");
        }
        else if (num == 20) {
            System.out.println("its 20");
        }
        else{
            System.out.println("higher than 20");
        }

        //even or odd
        boolean remainder = false;
        if (num % 2 == 1){
            remainder = true;
            System.out.println("its odd");
        }
        else {
            remainder = false;
            System.out.println("its even");
        }

        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("you passed");
                break;
            case 'B':
                System.out.println("you passed");
                break;
            case 'C':
                System.out.println("you passed");
                break;
            case 'D':
                System.out.println("you couldnt pass");
                break;
            default:
                System.out.println("unavailible grade");
        }

        // loops

        int i;
        for(i=1; i<10 ; i+=2){
            System.out.println(i);
        }
        System.out.println("döngü bitti");

        i=2;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("döngü bitti");

        i=2;
        do{
            System.out.println(i);
            i+=2;
        }
        while(i<10);
        //şart sağlanmasa bile bir kere çalışır

        //arrays
        String[] öğrenciler = new String[4]; //diziyi ve kaç eleman olacağını tanımladın
        öğrenciler[0] = "Feyza";
        öğrenciler[1] = "Aylin";
        öğrenciler[2] = "Gökçe";
        öğrenciler[3] = "Lina";

        i=0;
        for(i=0 ; i<4 ; i++){
            System.out.println(öğrenciler[i]);
        }

        //öğrenciler dizisindeki stringleri gez ve onlara öğrenci değerini ata
        for(String öğrenci:öğrenciler){
            System.out.println(öğrenci);
        }

        double total = 0.0;
        double[] myList = {1.2, 6.3, 1.3, 1.6, 4.3};
        double max = myList[0];
        for (double number : myList){
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("toplam = "+total);
        System.out.println(max);

        String[][] şehirler =new String[3][3];

        String words = "Bugün hava çok güzeldi";

        System.out.println("uzunluğu: " + words.length());
        System.out.println("4. harf: " + words.charAt(3));
        System.out.println(words.concat(" yaşasın")); //stringe eklemez sadece yanına koyar
        char[] ilkBeş = new char[5];
        words.getChars(0,4, ilkBeş,0);
        //5 adet karakteri ilkbeş adlı char dizinine ata 0. karakterden itibaren
        String newWords = words.replace(" ","-");
        System.out.println(newWords);
        System.out.println(words.substring(2,4)); //2. indexten 4. indexe kadar seçer

        //asal sayı bulma
        int numm = 7;
        int remain = numm % 2;
        boolean isPrime = true;

        if(numm == 1){
            System.out.println("1 asal değildir");
            return;
        }

        if(numm == 2){
            System.out.println("2 asaldır");
            return;
        }

        for (i = 2; i<numm ; i++){
            if (numm%i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);

        // kalın ya da ince sesli harf belirtme
        char harf='İ';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("bu kalın sesi bir harftir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("bu ince sesi bir harftir");
                break;
            default: System.out.println("bu sesli harf değildir");
        }

        //mükemmel sayı bulma
        int m = 6;
        boolean isGreater = false;
        int remainTotal = 0;

        for (i=1; i<m; i++) {
            if (m % i == 0) {
                remainTotal = remainTotal + i;
            }
        }
        if(remainTotal == m){
            isGreater = true;
        }
        System.out.println(isGreater);

        //arkadaş sayılar, kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan msayılar
        //toplam1 sayı2ye toplam2 sayı1e eşit olmalı
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for(i=1; i<sayi1; i++){
            if(sayi1%i==0){
                toplam1 = toplam1 + i;
            }
        }
        for(i=1; i< sayi2; i++){
            if(sayi2%i==0){
                toplam2 = toplam2 + i;
            }
        }
        if(toplam1==sayi2 && toplam2==sayi1){
            System.out.println("bu sayılar arkadaş sayıdır");
        }
        else{
            System.out.println("bu sayılar arkadaş sayı değildir");
        }

        //sayı bulma

        int[] sayılar = new int[]{1,2,4,6,3,7};
        int aranacak = 5;

        for(i=0; i<=5; i++){
            if(sayılar[i]==aranacak){
                System.out.printf("Aradığınız sayı bulundu");
                return;
            }
        }
        if(i>5){
            System.out.printf("aradığınız sayı listede yok");
        }



    }
}