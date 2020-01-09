import java.util.Random;

public class Pussy implements Runnable{
	
	int time;
	String name;
	Random r = new Random();
	
	public Pussy(String name) {
		this.name = name;
		time = r.nextInt(999);
	}

	@Override
	public void run() {
		
		System.out.printf("Поток %s спит %d.\n", name, time);
		
		try {
			Thread.sleep(time);
		}catch(Exception exc) {}
		
		System.out.printf("Поток %s проснудся и закончился.\n", name);
		
	}

}
