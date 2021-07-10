class First extends Thread
{
	void run_a() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class Second extends Thread
{
	void run_b() {
		for(int i=0;i<5;i++) {
			System.out.println("World");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		
		First ob1 = new First();
		Second ob2 = new Second();
		
        ob1.run_a();
        ob2.run_b();
	}

}
