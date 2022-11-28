package org.example;

public class AlphabetPrintTest {

    public static void alphabetPrint(){
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c\n", 'A' + i);
        }
    }

    public static void main(String[] args) {
        alphabetPrint();
    }
}
