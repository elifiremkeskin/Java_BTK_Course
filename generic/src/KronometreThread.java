public class KronometreThread implements Runnable{
    //threadler bir işlem hapılırken ekranda hata görünmesin o sırada başka bir işlem yapılabilsin diye
    //işlem bitene kadar arkada çalışacak sayaçtır

    //standarttır
    //thread nesnesi oluştur
    private Thread thread;
    //thread ismi
    private String threadName;
    //threaddin ismini set etmek için constructer
    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Thread oluşturuluyor : "+threadName);
    }


    @Override
    public void run() {
        System.out.println("thread çalıştırılıyor : "+threadName);
        //burada thread sırasında yapılmasını istediğiniz şeyleri çağırabilirsiniz


            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(threadName + " : " + i);
                    //çok hızlı sayacağı için onu biraz yavaşlatır
                    Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e){
                System.out.println("kesildi : "+threadName);
                }

    }

    //standarttır
    public void start(){
        System.out.println("Thread başlatılıyor : "+threadName);
        //thread yoksa yeni thread oluştururuz
        if(thread==null){
            //thread nesnesi oluştur, çalışacağı işi ve ismini ver
            thread = new Thread(this, this.threadName);
            thread.start();
        }
    }
}
