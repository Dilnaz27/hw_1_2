public class Employee {
    private int salary;
    private PlaceOfWork placeOfWork;

    public Employee(int salary, PlaceOfWork placeOfWork) {
        this.salary = salary;
        this.placeOfWork = placeOfWork;
    }

    public int getSalary() {
        return salary;
    }

    public PlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }
}
