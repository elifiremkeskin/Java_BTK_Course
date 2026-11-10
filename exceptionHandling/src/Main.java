import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) /*throws FileNotFoundException*/ { //exception fırlatma eklenebilir
       /* int[] sayilar= new int[] {1,2,3};
        System.out.println(sayilar[5]);*/
        //burada hata var ama compile edilebiliyor
        //hatayı yakalamak için try catch finally blokları kullan
        try{
            int[] sayi = new int[] {1,2,3};
            System.out.println(sayi[5]);
        }
        catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println("loglandı "+exception);
        }
        finally{
            System.out.println("bu blok hep çalışır");
        }

        int total = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\elif\\Documents\\GitHub\\Java_BTK_Course\\exceptionHandling\\src\\sayilar.txt"));
            String line = null;
            while((line = reader.readLine())!=null){
                total += Integer.valueOf(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(total);
        //burada fileReader dosanın bulunamamasına karşın try catchi zorunlu kılar
        //başkası kullanacaksa da exception fırlatması gerekir

        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    private static void createFile() {
        File file = new File("C:\\Users\\elif\\Documents\\GitHub\\Java_BTK_Course\\exceptionHandling\\src\\students.txt");
        try{
            if(file.createNewFile()){
                System.out.println("dosya oluşturuldu");
            }
            else{
                System.out.println("dosya zaten mevcut");
            }
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    private static void getFileInfo(){
        File file = new File("C:\\Users\\elif\\Documents\\GitHub\\Java_BTK_Course\\exceptionHandling\\src\\students.txt");
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }
    }

    private static void readFile(){
        File file = new File("C:\\Users\\elif\\Documents\\GitHub\\Java_BTK_Course\\exceptionHandling\\src\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            } reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\elif\\Documents\\GitHub\\Java_BTK_Course\\exceptionHandling\\src\\students.txt", true));
            // dosya yolunun sonunu true yaparsan (append) dosya yazma işlemi üstüne yazmak yerine devamına ekler
            writer.newLine();
            writer.write("fatma");
            writer.newLine();
            writer.write("aliye");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}