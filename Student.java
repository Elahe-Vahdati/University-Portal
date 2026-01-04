package se.fifth.universityPortal.src.main.java.university;

public class Student extends User {

    private int entryYear;
    private double avg;

public Student() {

}
    public Student(String name, String username, String password, int entryYear, double avg) {
        super(name, username, password);
        this.entryYear = entryYear;
        this.avg = avg;
    }
    public int getEntryYear() {
        return entryYear;
    }
    
    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }
    
    public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
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

