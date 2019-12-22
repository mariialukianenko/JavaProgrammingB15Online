package day16;

public class StringPractice {
    public static void main(String[] args) {

        String keywordToSearch = "java";
        String tabTitle = keywordToSearch + " - Google search";
        if( tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google search")){
            System.out.println("Test passed.");
        } else{
            System.out.println("Test failed.");
        }

    }
}
