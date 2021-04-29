package readFileStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentConvector {
    public static List<Student> convert(List<String> list){
        List<Student> studentList = new ArrayList<>();
        for(String studentString:list){
            List<String> param = Arrays.asList(studentString.split(","));
            Student student = new Student(param.get(0),param.get(1),Integer.parseInt(param.get(2)),param.get(3).charAt(0));
            student.setMark(Double.parseDouble(param.get(4)));
            studentList.add(student);
        }

        return studentList;
    }
}
