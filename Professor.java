package se.fifth.universityPortal.src.main.java.university;

public class Professor extends User {

    private String code;
    private String expert;
    
    public Professor() {
        
    }
    public Professor(String name, String username, String password, String code, String expert) {
        super(name, username, password);
        this.code = code;
        this.expert = expert;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getExpert() {
        return expert;
    }
    public void setExpert(String expert) {
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

