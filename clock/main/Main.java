package clock.main;

import clock.Art;
import clock.Time;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.printf("%43s%n%n", "");
		Art.printCat();

		while (true) {
		  String time = Time.GetTime();

		  System.out.printf("\033[%dA", Art.CAT_ART.length + 2); 
		  System.out.printf("\r%43s%n", time);
		  System.out.printf("\033[%dB", Art.CAT_ART.length + 1);

		  Thread.sleep(1000);
		}
	}
}

