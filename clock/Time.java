package clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
  public static void GetTime() {
    var now = LocalDateTime.now();
    String formattedNow = now.format(DateTimeFormatter.ofPattern("HH:mm:ss a"));
    System.out.format("\r%s   ", formattedNow);
  }
}
