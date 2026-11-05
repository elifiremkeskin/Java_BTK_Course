public class DatabaseLogin extends BaseLogin{
    @Override
    public void log(String message) {
        //base loginden ayrı olacak şekilde bir işlem yapılacaksa buraya eklenebilir
        //bu overwritingdir
        System.out.println("logged to database" + message);

    }
}
