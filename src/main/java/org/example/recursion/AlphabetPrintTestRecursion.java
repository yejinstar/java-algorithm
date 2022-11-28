package org.example.recursion;

public class AlphabetPrintTestRecursion {

    public static void alphabetPrint(char C){

        if (C > 'Z')
            return;
        System.out.printf("%c",C);
        System.out.println();
        alphabetPrint((char)(C+1));
    }

    public static void alphabetPrintSecond(char C, char two){
        if (two > 'Z')
            return;
        System.out.printf("%c %c\n",C,two);
        alphabetPrintSecond(C , (char)(two + 1));
    }

    public static void alphabetPrintFirst(char C){

        if (C > 'Z')
            return;

        alphabetPrintSecond(C,'A');
        alphabetPrintFirst((char)(C+1));
    }

    public static void main(String[] args) {
        alphabetPrint('A');
        System.out.println("-------------");
        alphabetPrintFirst('A');
    }
}
