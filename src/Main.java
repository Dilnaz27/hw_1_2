public class Main {
    public static void main(String[] args) {
        Vacation vacation = new Vacation(60,"Sea");
        Teacher teacher = new Teacher(27000, PlaceOfWork.SCHOOL,
                vacation, 12, "English teacher");
        System.out.println(teacher.getInfo());
        teacher.makeWork();
        teacher.makeWork("You have to learn new words from this text");


        System.out.println("--------------------");


        Vacation vacation1 = new Vacation(28, "Mountains");
        Programmer programmer = new Programmer(80000, PlaceOfWork.HOME, vacation1,
                8, "Android developer", "Gaming computer",
                "Java, Kotlin");
        System.out.println(programmer.getInfo());
        programmer.makeWork();
        programmer.makeWork("I'm working on new project right now");


        System.out.println("--------------------");


        Vacation vacation2 = new Vacation(14,"Football World Cup");
        Programmer programmer1 = new Programmer(200000, PlaceOfWork.HOME, vacation2,
                6, "IOS developer", "Macbook Air M1",
                "Swift");
        System.out.println(programmer1.getInfo());
        programmer1.makeWork();
        programmer1.makeWork("Do that part of your work on time!");
    }
}