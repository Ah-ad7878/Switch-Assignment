package pk.org.cas.switchAssignment;

import java.util.Scanner;

public class NumberToWords {
    private int number;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public NumberToWords(){

    }
    public NumberToWords(int number){
        this.number = number;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        setNumber(sc.nextInt());
    }

    public void output(){
        switch (getNumber()){
            case 1:
                System.out.println(getNumber()+" in words is One");
                break;
            case 2:
                System.out.println(getNumber()+" in word is Two");
                break;
            case 3:
                System.out.println(getNumber()+" in word is Three");
                break;
            case 4:
                System.out.println(getNumber()+" in word is four");
                break;
            case 5:
                System.out.println(getNumber()+" in word is Five");
                break;
            case 6:
                System.out.println(getNumber()+" in word is Six");
                break;
            case 7:
                System.out.println(getNumber()+" in word is Seven");
                break;
            case 8:
                System.out.println(getNumber()+" in word is Eight");
            case 9:
                System.out.println(getNumber()+" in word is Nine");
                break;
            case 10:
                System.out.println(getNumber()+" in word is Ten");
                break;
            default:
                System.out.println("invalid No");
        }
    }

    public String checkNumber(){
        return switch (getNumber()){
            case 1 -> "one";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "invalid no";






        };
    }
}
