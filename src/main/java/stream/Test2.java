package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Denis", 'm', 22, 4, 9.1);
        Student student2 = new Student("Maria", 'f', 19, 2, 7.5);
        Student student3 = new Student("Ivan", 'm', 20, 2, 6.2);
        Student student4 = new Student("Polina", 'f', 18, 1, 8.4);
        Student student5 = new Student("Pavel", 'm', 22, 3, 8.5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        students = students.stream().filter(el -> el.getAge() > 19 && el.getAge() < 23).collect(Collectors.toList());
        System.out.println(students);
//
//        students = students.stream().sorted((x,y)->x.getAge()-y.getAge()).collect(Collectors.toList());
//        System.out.println(students);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Math");

        f1.addStudToFaculty(student1);
        f1.addStudToFaculty(student2);
        f1.addStudToFaculty(student3);
        f2.addStudToFaculty(student4);
        f2.addStudToFaculty(student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudOnFaculty().stream()).forEach(e-> System.out.println(e.getName()));


    }
}

class Faculty{
    String name;
    List<Student> studentFaculty = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public List<Student> getStudOnFaculty(){
        return studentFaculty;
    }

    public void addStudToFaculty(Student st){
        studentFaculty.add(st);
    }
}
