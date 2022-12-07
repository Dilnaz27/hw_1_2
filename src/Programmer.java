public final class Programmer extends Teacher{
    private String typeOfComputer;
    private String programmingLanguage;

    public Programmer(int salary, PlaceOfWork placeOfWork, Vacation vacation, int hoursOfWork,
                      String direction, String typeOfComputer, String programmingLanguage) {
        super(salary, placeOfWork, vacation, hoursOfWork, direction);
        this.typeOfComputer = typeOfComputer;
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    @Override
    public void makeWork() {
        System.out.println("I'll do this part of project, don't worry about that");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nType of computer: " + typeOfComputer +
                "\nProgramming language: " + programmingLanguage;
    }
}
