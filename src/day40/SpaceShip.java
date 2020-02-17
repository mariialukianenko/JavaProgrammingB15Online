package day40;

public class SpaceShip {

    String name;
    int x;
    int y;
    String currentDirection;


    public void setInitialPosition(int newX, int newY){
        x = newX;
        y = newY;
    }

    public void setDirection(String newDirection){
        if (newDirection.equals("up") ||
                newDirection.equals("down") ||
                newDirection.equals("right") ||
                newDirection.equals("left") ) {
            currentDirection = newDirection;
        } else{
            System.out.println("Invalid direction");
            currentDirection = "";
        }
    }


    public void move1Block(){

        switch (currentDirection){
            case  "right" : x +=1;
                break;
            case  "left" : x -=1;
                break;
            case  "up" : y +=1;
                break;
            case  "down" : y -=1;
                break;
            default:
                break; }

    }

    // right click in your class anewhere, select generate,  select toString and hit enter
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
