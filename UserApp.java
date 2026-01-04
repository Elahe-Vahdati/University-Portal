package se.fifth.universityPortal.src.main.java.university;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class UserApp {
    List<User> users = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public UserApp() {
        menu();
    }

    void menu() {
        BreakUser:
        while (true) {
            System.out.println("""
                    
                    1 add Student
                    2 add Professor
                    3 show all user
                    4 exit
                    5 choose
                    
                    """);
        int choice = sc.nextInt();
        switch (choice) {
            case 1->{
                User user = userEntery();
                System.out.println("Enter Student entryYear:");
                int entryYear = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student avg:");
                double avg = sc.nextDouble();
                sc.nextLine();
                users.add(new Student(user.getName(), user.getUsername(), user.getPassword(), entryYear, avg));
                System.out.println("Student added successfully");
                break;
            }
            case 2->{
                User user = userEntery();
                System.out.println("Enter Professor Code:");
                String code = sc.next();
                sc.nextLine();
                System.out.println("Enter Professor expert:");
                String expert = sc.next();
                sc.nextLine();
                users.add(new Professor(user.getName(), user.getUsername(), user.getPassword(), code, expert));
                System.out.println("Professor added successfully");
                break;
            }
            case 3->{
                if (users.isEmpty()) {
                    System.out.println("There is no users in the system");
                }else  {
                    for (User user : users) {
                        System.out.println(user);
                    }
                }

            }
            case 4->{
                System.out.println("Exit Program");
                break BreakUser;
            }
            default ->  System.out.println("Invalid choice");
        }
        }

    }

private User userEntery(){

    System.out.println("Enter Student Name:");
    String name = sc.next();
    sc.nextLine();
    System.out.println("Enter Student username:");
    String username = sc.next();
    sc.nextLine();
    System.out.println("Enter Student password:");
    String password = sc.next();
    sc.nextLine();
    return new User(name, username, password);
}


}
