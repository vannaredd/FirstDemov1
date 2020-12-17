
public class ThreadDemo {

	public static void main(String[] args) {

		/*
		 * new Thread() {
		 * 
		 * public void run() {
		 * 
		 * for (int i = 0; i <= 10; i++) { System.out.println("run" + i); }
		 * 
		 * }
		 * 
		 * }.start();
		 * 
		 * for (int i = 0; i <= 10; i++) { System.out.println("main:" + i); }
		 */

		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("run"+i);
				}
			}

		}).start();

			for (int i = 0; i <= 10; i++) {
			System.out.println("main"+i);
		}

	}

}
