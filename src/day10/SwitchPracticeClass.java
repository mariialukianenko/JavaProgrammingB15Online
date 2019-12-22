package day10;

public class SwitchPracticeClass {
    public static void main(String[] args) {

        System.out.println("What do you usually do before class to get ready for class?");
         int chooseNumber = 5;
         String IDoThat ="";
        System.out.println("You choose number "+chooseNumber);
         switch (chooseNumber){

             case 1:
                 IDoThat = "I find out what topic will be yaught.";
                 break;
             case 2:
                 IDoThat = "I review and practice previous topic.";
                 break;
             case 3:
                 IDoThat = "I do repl practice.";
                 break;
             case 4:
                 IDoThat = "I prepare questions that I have in mind for class or office hour.";
                 break;
                 case 5:
                     IDoThat = "I watch the short on upcoming topic.";
                     break;
             case 6:
                 IDoThat = "I read the book to get general idea.";
                 break;
             case 7:
                 IDoThat = "I join office hour review if time allow";
                 break;
             default:
                 IDoThat = "Unknow number";



         }

        System.out.println(IDoThat);



    }
}
