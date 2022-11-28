package org.example;

public class AlphabetPrintTest {

    public static void alphabetPrint(){
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c\n", 'A' + i);
        }
    }

    public static void alphabetPrint2(){
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.printf("%c %c\n", 'A' + i, 'A' + j);
            }
        }
    }

    public static void main(String[] args) {
        alphabetPrint();
        System.out.println("-------------");
        alphabetPrint2();
    }
}
