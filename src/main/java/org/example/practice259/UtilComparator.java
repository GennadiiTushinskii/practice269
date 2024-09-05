package org.example.practice259;

public class UtilComparator {
    private UtilComparator() {
    }

    public static StudentComparator getStudComp(StudEnumTypeCompar setc){
        switch (setc){
            case FULLNAME:
                return new StudentCompFullName();
            case UNIVERSITY_ID:
                return new StudentCompUniversityID();
            case COURSE:
                return new StudentCompCourseNumber();
            default:
                return new StudentCompAvgExamScore();
        }
    }

    public static UniversityComparator getUniverComp(UniverEnumTypeCompar uetc){
        switch (uetc){
            case ID:
                return new UniverCompID();
            case FULLNAME:
                return new UniverCompFullName();
            case SHORTNAME:
                return new UniverCompShortMane();
            case YEAR:
                return new UniverCompYearFound();
            default:
                return new UniverCompMainProfile();
        }
    }
}
