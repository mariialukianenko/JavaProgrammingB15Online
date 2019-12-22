package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        // skip every other letter
        String msg = "I love Java, I love Java";

        for (int i = 0; i <= msg.length() - 1; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(msg.substring(i, i + 1));
        }

        System.out.println();
        System.out.println("------------");
        //task 2
        //when you see letter a get out

        for (int y = 0; y <= msg.length() - 1; y++) {
            if (msg.substring(y, y + 1).equalsIgnoreCase("a")) {
                break;
            }
            System.out.print(msg.substring(y, y + 1));
        }

        System.out.println();
        System.out.println("----------------");
        // combine

        for (int i = 0; i <= msg.length()-1; i++) {
            if (i % 2 != 0) {
                continue;
            }
            String newmsg = msg.substring(i, i + 1);

                if (newmsg.equalsIgnoreCase("v")) {
                    break;
                }
                System.out.print(newmsg);
            }
        }





    }

