package clock.main;

import clock.Time;

public class Main {
  public static void main(String[] args) {
    while (true) {
      Time.GetTime();
      try {
        Thread.sleep(1000);
      } catch (Exception a) {
        System.out.println(a);
      }
    }
  }
}