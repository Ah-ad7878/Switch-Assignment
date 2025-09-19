package pk.org.cas.switchAssignment;

import java.util.Scanner;

public class VowelorConsonant {
    private char alphabet;

    Scanner sc = new Scanner(System.in);

    public void setAlphabet(char alphabet){
        this.alphabet = alphabet;
    }
    public char getAlphabet(){
        return alphabet;
    }
    public VowelorConsonant(){

    }
    public VowelorConsonant(char alphabet){
        this.alphabet = alphabet;
    }

    public void output(){
        switch (getAlphabet()){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowels");
                break;

            default:
                System.out.println("consonant letter");
        }
    }

    public String display(){
        return switch (getAlphabet()){
            case 'a','e','i','o','u','A','E','I','O','U'->"vowel";
            default -> "consonant";

        };
    }
}
