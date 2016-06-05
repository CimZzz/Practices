package swing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class CaptureScreen {

	public static void main(String[] args) throws AWTException {
		Robot robot=new Robot();
		
		BufferedImage bufferedImage=robot.createScreenCapture(null);
		
		
	}

}
