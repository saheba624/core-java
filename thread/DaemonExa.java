package thread;

public class DaemonExa {
	public void run() {

		System.out.println("Daemon thread :" + Thread.currentThread());

		while (true) {

			try {
				Thread.sleep(500);
				System.out.println("daemon thread wke up");
			} catch (InterruptedException e) {

			}
		}

	}
	
	
	public static void main(String[] args) {
		
		
		DaemonExa t= new DaemonExa();
		
		t.setDaemon(true);
		
		t.start();
		
		try{
			Thread.sleep(3000);
		}
		
		catch(InterruptedException e){}

		System.out.println("living main threasd");
		System.out.println("now jvm will exit");
	
	}


	private void start() {
		// TODO Auto-generated method stub
		
	}


	private void setDaemon(boolean b) {
		// TODO Auto-generated method stub
		
	}
	

}



