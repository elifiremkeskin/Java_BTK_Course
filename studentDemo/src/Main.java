//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[] {addStudent(), addStudent(), addStudent()};

        calculate(students[0].getGrade1(), students[0].getGrade2(), students[0].getGrade3());

    }

    public static void calculate(int a, int b, int c){
        int ort = (a + b + c)/3;
        System.out.print(ort);
    }

    public static Student addStudent(){
        Student student = new Student();
        student.setName("ali");
        student.setGrade1(100);
        student.setGrade2(70);
        student.setGrade3(30);
        return(student);
    }
}