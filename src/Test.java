import model.Student;
import service.FileService;
import service.StudentService;

import java.time.LocalDate;

public class Test {

    public static final String URL = "text.txt";

    public static void main(String[] args) throws Exception {

        String[] lines = FileService.readFile(URL);

        Student[] convert = StudentService.convert(lines);
        StudentService.sort(convert);

        for (Student student : convert) {
            System.out.println(student);
        }


//        Student max = StudentService.max(convert);

//        LocalDate date = LocalDate.now();
//        int year = date.getYear();

//        FileService.writeFile(URL, "\nMax = " + max.getFirstName() + " " + max.getLastName() + (year - max.getYear()));

//        System.out.println(max);

    }
}