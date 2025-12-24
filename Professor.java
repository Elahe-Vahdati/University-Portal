package se.fifth.universityPortal;

public class Professor extends User {

    private String code;
    private String expert;

    public Professor(String name, String username, String password, String code, String expert) {
        super(name, username, password);
        this.code = code;
        this.expert = expert;
    }

    @Override
    public void showUser() {
        System.out.println("Information of Professor :");
        super.showUser();
        String Code = "";
        System.out.println("Professor Code: " + Code);
        System.out.println("expert: " + expert);
    }
}

