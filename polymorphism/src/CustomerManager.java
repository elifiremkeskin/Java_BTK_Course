public class CustomerManager {
    private BaseLogin logger;

    public CustomerManager(BaseLogin logger){
        this.logger=logger;
    }
    public void add(){
        System.out.println("logger eklendi");
        this.logger.log("log mesajı");

       /* DatabaseLogin databaseLogin = new DatabaseLogin();
        databaseLogin.log("mesaj");*/
        //böyle bir şey kullansaydık customer manager database e bağımlı olurdu
        //biz bunu istemiyoruz, istediğimiz zaman mainde diğer logları da kullanabilmeliyiz
    }
}
