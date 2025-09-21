package pk.org.cas.switchAssignment;

import java.util.Scanner;

public class UserDetail {
    private String name;
    private String fatherName;
    private String id;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDetail(String name, String fatherName, String id) {
        this.name = name;
        this.fatherName = fatherName;
        this.id = id;
    }

    public UserDetail(String name, String fatherName) {
        this.name = name;
        this.fatherName = fatherName;
    }

    public UserDetail() {
    }


    Scanner sc = new Scanner(System.in);
    public void output(){
        switch (getId()){
            case "a-1":
                System.out.print("Enter your name: ");
                setName(sc.next());
                System.out.print("Enter your father name: ");
                setFatherName(sc.next());
                System.out.println("Name of the user is "+getName()+" und vater name ist "+fatherName);
                break;
            case "a-2":
                System.out.print("Enter your name: ");
                setName(sc.next());
                System.out.print("Enter your father name: ");
                setFatherName(sc.next());
                System.out.println("Name of the user is "+getName()+" und vater name ist "+fatherName);
                break;
            case "a-3":
                System.out.print("Enter your name: ");
                setName(sc.next());
                System.out.print("Enter your father name: ");
                setFatherName(sc.next());
                System.out.println("Name of the user is "+getName()+" und vater name ist "+fatherName);
                break;
            default:
                System.out.println("invalid Id");
        }
    }
}
