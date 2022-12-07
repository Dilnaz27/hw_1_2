public class Teacher extends Employee {
    private int hoursOfWork;
    private String direction;
    private Vacation vacation;


    public Teacher(int salary, PlaceOfWork placeOfWork,
                   Vacation vacation, int hoursOfWork, String direction) {
        super(salary, placeOfWork);
        this.hoursOfWork = hoursOfWork;
        this.direction = direction;
        this.vacation = vacation;
    }

    public String getDirection() {
        return direction;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void makeWork() {
        System.out.println("I am working, don't disturb me, please");
    }

    final public void makeWork(String work) {
        System.out.println(work);
    }

    public String getInfo() {
        return "Salary: " + getSalary() +
                "\nPlace of work: " + getPlaceOfWork() +
                "\nVacation place: " + vacation.getRestingPlace() +
                "\nNumber of vacation days: " + vacation.getNumberOfVacationDays() +
                "\nHours of work: " + hoursOfWork +
                "\nDirection: " + direction;
    }
}
