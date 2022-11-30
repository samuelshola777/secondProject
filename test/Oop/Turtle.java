package Oop;

import static Oop.Direction.*;

public class Turtle {
  private   Pen pen;
  private Direction currectionDirrection;
  private Position currectionPosition;
  public Turtle(){
      pen = new Pen();
      currectionDirrection = EAST;
      currectionPosition = new Position(0,0);
  }
    public void penUp() {
        pen.penUp();
    }


    public boolean isPenUp() {
        return pen.isPenUp();
    }
    public void penDown(){
        pen.penDown();
    }
    public Direction getCurrectionDirrection(){
      return currectionDirrection;
    }
    public Position getCurrectionPosition(){
      return currectionPosition;
    }
    public void turnRight(){
      switch (currectionDirrection){
          case EAST -> face(SOUTH);
          case SOUTH -> face(WEST);
          case WEST -> face(NORTH);
          case NORTH -> face(EAST);
      }
    }
    private void face(Direction direction){
      currectionDirrection = direction;
    }
public void move(int numberOfSteps){
      switch (currectionDirrection){
          case EAST -> {
              currectionPosition.setColumn(currectionPosition.getColumn()+ numberOfSteps);
          }
      }
}

}
