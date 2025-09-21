package pk.org.cas.switchAssignment;

import java.util.Scanner;

public class Password {
    private final String password = "Ali@123";
    private String userInput;


    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Password(){

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        setUserInput(sc.next());
    }

    public Password(String userInput){
        this.userInput = userInput;
    }

    public void output(){
        switch (getUserInput()){
            case "Ali@123":
                System.out.println("password is correct");
                break;
            default:
                System.out.println("password is wrong");

        }
    }
}
