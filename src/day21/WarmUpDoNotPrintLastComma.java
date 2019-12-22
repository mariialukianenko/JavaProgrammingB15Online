package day21;

public class WarmUpDoNotPrintLastComma {
    public static void main(String[] args) {
        String myName = "Mariia Lukianenko";

        int charCount = myName.length();
        int lastCharIndex = charCount -1;

        System.out.println(myName.substring(0,1));
        System.out.println();

        for (int x=0; x <= lastCharIndex; x++ ){
           String newMyName =  myName.substring(x, x+1);
           if (x<lastCharIndex){
               newMyName = newMyName + "->";
           }
            System.out.print(newMyName);
        }




        System.out.println();
        for (int x=0; x <= charCount-2; x++ ){
            System.out.print(myName.substring(x,x+2)+"->");
        }

        System.out.println();
        for (int x=0; x <= charCount-3; x++ ){
            System.out.print(myName.substring(x,x+3)+"->");
        }


        }
    }

