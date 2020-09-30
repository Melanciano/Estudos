package Treinos.SelfStudy.HowToJava10ed.Chapter4.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("Jane Green", 97.3);
        Student student2 = new Student("John Blue", 72.3);

        System.out.printf("A nota do estudante %s foi %s%n",student1.getName(), student1.getLetterGrade() );
        System.out.printf("A nota do estudante %s foi %s%n", student2.getName(), student2.getLetterGrade());





    }
}
