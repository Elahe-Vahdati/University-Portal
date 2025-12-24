package se.fifth.universityPortal;

public class Student extends User {

    private int entryYear;
    private double avg;

    public Student(String name, String username, String password, int entryYear, double avg) {
        super(name, username, password);
        this.entryYear = entryYear;
        this.avg = avg;
    }

    @Override
    public void showUser() {
        System.out.println("Information of Student:");
        super.showUser();
        System.out.println("Entry year: " + entryYear);
        System.out.println("Average: " + avg);
    }
}

