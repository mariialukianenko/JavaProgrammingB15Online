package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println(num);

//        String empID = "FB-457";    // should be a number
//        int id = Integer.parseInt(empID);

        String empID = "FB-457";
        String[] emptIDSplit = empID.split("-");
        int id = Integer.parseInt(emptIDSplit[1]);
        System.out.println(id);

        String twoNumbers = "100,600";
        String[] split = twoNumbers.split(",");
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        System.out.println(num1+num2);




    }
}
