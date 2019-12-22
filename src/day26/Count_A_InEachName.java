package day26;

public class Count_A_InEachName {
    public static void main(String[] args) {

        String student = "Abbos, Zulyar, Zhibek, Hasan, Beza, Muge, Orhan, Susan";

        // count a
        int count = 0;
        for (int i = 0; i <= student.length()-1 ; i++) {
            if(student.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

        //////    tty to find unique number or letter
    }
}
