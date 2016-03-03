
public class Task1 implements Runnable {

	@Override
	public void run() {
		try{
			Thread.sleep(5000);
		}catch (InterruptedException e1){
			e1.printStackTrace();
		}
	}

}
