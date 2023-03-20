package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentsInfo {
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student s : arrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Denis", 'm', 22, 4, 9.1);
        Student student2 = new Student("Maria", 'f', 19, 2, 7.5);
        Student student3 = new Student("Ivan", 'm', 20, 2, 6.2);
        Student student4 = new Student("Polina", 'f', 18, 1, 8.4);
        Student student5 = new Student("Pavel", 'm', 22, 3, 8.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentsInfo studentsInfo = new StudentsInfo();

        //PREDICATE
        studentsInfo.testStudents(students, p -> {
            return p.getAvgGrade() > 8;
        });

        students.removeIf(el->el.getName().length()>=6);
        System.out.println(students);
        //PREDICATE

        //CONSUMER
        changeStudent(students.get(1), student-> {
            student.setName("Svetlana");
            student.setAge(18);
            student.setCourse(1);
            student.setAvgGrade(9.2);
            System.out.println(student);
        });
        students.forEach(System.out::println);
        //CONSUMER

        //FUNCTION
        double res = avg(students, student -> student.getAvgGrade());
        System.out.println(res);
        //FUNCTION

    }

    //CONSUMER
    public static void changeStudent(Student student, Consumer<Student> studentConsumer){
        studentConsumer.accept(student);
    }
    //CONSUMER

    //FUNCTION
    public static double avg(List<Student> list, Function<Student, Double> function){
        double res = 0;
        for(Student st: list){
            res+= function.apply(st);
        }
        res = res/ list.size();
        return res;
    }
    //FUNCTION
}
