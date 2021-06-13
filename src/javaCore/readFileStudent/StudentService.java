package javaCore.readFileStudent;

import java.io.IOException;
import java.util.List;

public class StudentService {
    public static List<Student> readStudents(String path) throws IOException {
        List<Student> list = null;
        list = StudentConvector.convert(FileService.readFile(path));
        return list;
    }

    //Print full name of students
    public static void printFullNamesOfStudents(List<Student> studentList){
        for (Student student: studentList){
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    // Print all male students
    public static void printMaleStudents(List<Student> studentList){
        for (Student student: studentList){
            if (student.getGender() == 'm') {
                System.out.println(student);
            }
        }
    }

    // print all female students who has mark greater then 50.4
    public static void printFemaleStudentGreater(List<Student> studentList){
        for (Student student: studentList){
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    //min mark student
    public static void printMinMarkStudent(List<Student> studentList){
        Student min = studentList.get(0);
        for (Student student: studentList){
            if (student.getMark() < min.getMark()) {
               min = student;
            }
        }
        System.out.println(min);
    }
    // print biggest male student
    public static void printBiggestMaleStudent(List<Student> studentList){
        Student biggestStudent = null;
        for (Student student: studentList){
            if (student.getGender()=='m') {
                biggestStudent = student;
                break;
            }
        }
        if (biggestStudent!=null){
            for (Student student: studentList){
                if(student.getGender()=='m' && student.getBornYear() < biggestStudent.getBornYear()){
                    biggestStudent = student;
                }
            }
        }
        System.out.println(biggestStudent);
    }

    //print student sorted by mark
    public static void printStudentsByMark(List<Student> studentList){
        studentList.sort((o1, o2) -> {
            if ((o1.getMark() - o2.getMark()) > 0) {
                return (int) Math.ceil(o1.getMark() - o2.getMark());
            } else {
                return (int) (o1.getMark() - o2.getMark());
            }
        });
        for (Student student:studentList){
            System.out.println(student);
        }
    }
    //print female student by year
    public static void printFemaleStudentsByYear(List<Student> studentList){
        studentList.sort((o1, o2) -> (int)(o1.getBornYear() - o2.getBornYear()));
        for (Student student:studentList){
            if (student.getGender()=='f') {
                System.out.println(student);
            }
        }
    }

}
