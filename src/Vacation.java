public class Vacation {
    private int numberOfVacationDays;
    private String restingPlace;

    public Vacation(int numberOfVacationDays, String restingPlace) {
        this.numberOfVacationDays = numberOfVacationDays;
        this.restingPlace = restingPlace;
    }

    public int getNumberOfVacationDays() {
        return numberOfVacationDays;
    }

    public String getRestingPlace() {
        return restingPlace;
    }
}
