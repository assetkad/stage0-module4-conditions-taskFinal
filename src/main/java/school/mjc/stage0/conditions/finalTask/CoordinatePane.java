package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
  public void printQuadrant(int x, int y) {
    if (x == 1 && y == 1) {
      System.out.println("first");
    } else if (x < y) {
      System.out.println("second");
    } else if (x == -1 && y == -1) {
      System.out.println("third");
    } else if (x > y) {
      System.out.println("fourth");
    } else {
      System.out.println("zero");
    }
  }
}
