package org.example.practice259;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlsReader {
    private XlsReader(){
    }

    //читаем университеты
    public static List<University> readXlsUniver(String filePath) throws IOException {

        List<University> univer = new ArrayList<>();

        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("universitet");
        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()) {
            Row curow = rows.next();
            University uni = new University();
            univer.add(uni);
            uni.setId(curow.getCell(0).getStringCellValue());
            uni.setFullName(curow.getCell(1).getStringCellValue());
            uni.setShortName(curow.getCell(2).getStringCellValue());
            uni.setYearOfFoundation((int) curow.getCell(3).getNumericCellValue());
            uni.setMainProfile(StudyProfile.valueOf(
                    StudyProfile.class, curow.getCell(4).getStringCellValue()));
        }
        return univer;
    }

    public static List<Student> readXlsStudent(String filePath) throws IOException {

        List<Student> stud = new ArrayList<>();

        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("student");
        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()) {
            Row curow = rows.next();
            Student std = new Student();
            stud.add(std);
            std.setUniversityId(curow.getCell(0).getStringCellValue());
            std.setFullName(curow.getCell(1).getStringCellValue());
            std.setCurrentCourseNumber((int) curow.getCell(2).getNumericCellValue());
            std.setAvgExamScore((int)curow.getCell(3).getNumericCellValue());
        }
        return stud;
    }

}
