package robot;

import java.awt.AWTException;
import java.awt.Robot;

public class Robot_Press {
	static int x=0;
	static int y=0;
	public static void main(String[] args) throws AWTException {
		Robot robot=new Robot();
	
		new Thread(()->{
			while(true){
			robot.mouseMove(x, y);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			x+=10;
			y+=10;
			}
		}).start();
	}

}
