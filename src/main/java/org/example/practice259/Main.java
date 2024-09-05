package org.example.practice259;
import java.io.IOException;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                XlsReader.readXlsUniver("d:\\JAVA\\studies\\IdeaProjects\\module26\\Practice269\\src\\main\\resources\\univer.xlsx");
        UniversityComparator uniCompar = UtilComparator.getUniverComp(UniverEnumTypeCompar.ID);
        universities.stream().sorted(uniCompar).forEach(System.out::println);


        List<Student> students =
                XlsReader.readXlsStudent("d:\\JAVA\\studies\\IdeaProjects\\module26\\Practice269\\src\\main\\resources\\univer.xlsx");
        StudentComparator studCompar = UtilComparator.getStudComp(StudEnumTypeCompar.AVG_EXAM_SCORE);
        students.stream().sorted(studCompar).forEach(System.out::println);

    }
}