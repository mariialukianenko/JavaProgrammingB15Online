package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws Exception {
        // or without "throws Exception" for first method handle
        // second way for declared

//        System.out.println("Checked exception in next line");
//
//        try {
//            Thread.sleep(1000);   // will stop for 1 second. This is checked exception.
//        }catch (InterruptedException e){
//            System.out.println("Exception was caught");
//        }
//
//        System.out.println("After thread.sleep");

        System.out.println("Checked exception in next line");
            Thread.sleep(1000);
        System.out.println("After thread.sleep");

    }
}
