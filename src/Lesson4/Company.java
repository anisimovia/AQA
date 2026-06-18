package Lesson4;


public class Company {
    private static int INDEX_COMPANY = 12;
    private String name;
    private String description;
    private int companyIndex;

    public Company(String name, String description, int companyIndex) {
        this.name = name;
        this.description = description;
        this.companyIndex = companyIndex;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static int getIndexCompany(){
        return INDEX_COMPANY;
    }
}
