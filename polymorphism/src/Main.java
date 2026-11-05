//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailLogin emailLogin = new EmailLogin();
        emailLogin.log("default message");

        BaseLogin[] loggers = new BaseLogin[] {new BaseLogin(), new EmailLogin(), new DatabaseLogin(), new FileLogin()};
        // burada veri tipi base logger olmasına rağmen file email ve databasei de kabul eder
        //çünkü aslında bu loggerlar da birer base loggerdır (çocuklarıdır)
        for(BaseLogin logger : loggers){
            logger.log(" : log mesajı");
        }
        CustomerManager customerManager = new CustomerManager(new FileLogin());
        //artık customer manager bağımlı değil istediğimiz
        customerManager.add();

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.print(ogretmenKrediManager.hesapla(1000));

        BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager()};
        for(BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}