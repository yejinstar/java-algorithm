package org.example;

public class AlphabetPrintTestRecur {

    public static void alphabetPrint(char C){

        if (C > 'Z')
            return;
        System.out.printf("%c",C);
        System.out.println();
        alphabetPrint((char)(C+1));
    }

    public static void alphabetPrint2(char C, char two){
        if (two > 'Z')
            return;
        System.out.printf("%c %c\n",C,two);
        alphabetPrint2(C , (char)(two + 1));
    }

    public static void alphabetPrint3(char C){

        if (C > 'Z')
            return;

        alphabetPrint2(C,'A');
        alphabetPrint3((char)(C+1));
    }

    public static void main(String[] args) {
        alphabetPrint('A');
        System.out.println("-------------");
        alphabetPrint3('A');
    }
}
