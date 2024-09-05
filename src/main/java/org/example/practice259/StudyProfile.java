package org.example.practice259;
public enum StudyProfile {
    MEDICINE("Медицинский"),
    MECHANIC("Механический"),
    ELECTRICITY("Электротехника"),
    OPTIKA("Оптикомеханический"),
    CHEMICAL("Химический"),
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MAGICAL("Магический"),
    LINGUISTICS("Лингвистика");
    private final String profileName;

    private StudyProfile(String profileName){
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }

}
