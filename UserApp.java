package se.fifth.universityPortal;
import java.util.Scanner;
import java.util.ArrayList;

public class UserApp {
    ArrayList<User> users = new ArrayList<>();
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
                System.out.println("Enter Student Name:");
                String name = sc.next();
                sc.nextLine();
                System.out.println("Enter Student username:");
                String username = sc.next();
                sc.nextLine();
                System.out.println("Enter Student password:");
                String password = sc.next();
                sc.nextLine();
                System.out.println("Enter Student entryYear:");
                int entryYear = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student avg:");
                double avg = sc.nextDouble();
                sc.nextLine();
                users.add(new Student(name, username, password, entryYear, avg));
                System.out.println("Student added successfully");
                break;
            }
            case 2->{

                System.out.println("Enter Professor Name:");
                String name = sc.next();
                sc.nextLine();
                System.out.println("Enter Professor username:");
                String username = sc.next();
                sc.nextLine();
                System.out.println("Enter Professor password:");
                String password = sc.next();
                sc.nextLine();
                System.out.println("Enter Professor Code:");
                String code = sc.next();
                sc.nextLine();
                System.out.println("Enter Professor expert:");
                String expert = sc.next();
                sc.nextLine();


                users.add(new Professor(name, username, password, code, expert));
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




}
