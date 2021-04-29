package readFileStudent;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static final String PATH ="C:\\Users\\babke\\IdeaProjects\\PicsArt\\src\\readFileStudent\\students.txt";
    public static void main(String[] args) throws IOException {
        boolean isMenuActive = true;
        Scanner scanner = new Scanner(System.in);
        while (isMenuActive){
            System.out.println("Print full names of students: 1");
            System.out.println("Print all male students: 2");
            System.out.println("Print all female students who has mark greater then 50.4: 3");
            System.out.println("Print student information having the minimal mark: 4");
            System.out.println("Print biggest male student information: 5");
            System.out.println("Print students sorted by mark: 6");
            System.out.println("Print female students sorted by year: 7");
            System.out.println("Create file: 8");
            System.out.println("Write in file: 9");
            System.out.println("Exit: 0");


            switch (scanner.nextInt()){
                case 1:
                    StudentService.printFullNamesOfStudents(StudentService.readStudents(PATH));
                    break;
                case 2:
                    StudentService.printMaleStudents(StudentService.readStudents(PATH));
                    break;
                case 3:
                    StudentService.printFemaleStudentGreater(StudentService.readStudents(PATH));
                    break;
                case 4:
                    StudentService.printMinMarkStudent(StudentService.readStudents(PATH));
                    break;
                case 5:
                    StudentService.printBiggestMaleStudent(StudentService.readStudents(PATH));
                    break;
                case 6:
                    StudentService.printStudentsByMark(StudentService.readStudents(PATH));
                    break;
                case 7:
                    StudentService.printFemaleStudentsByYear(StudentService.readStudents(PATH));
                    break;
                case 8:
                    FileService.createFile(scanner.next());
                    break;
                case 9:
                    //FileService.writeFile(PATH,scanner.nextLine());
                    break;

                case 0:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("wrong input");

            }
        }
    }
}
