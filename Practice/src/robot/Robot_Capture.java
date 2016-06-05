package robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 * 获得截屏图片
 * @author CimZzz
 *
 */
public class Robot_Capture {

	public static BufferedImage getCapture(Rectangle rect)
	{
		try {
			Robot robot=new Robot();
			BufferedImage bufferedImage=robot.createScreenCapture(rect);
			return bufferedImage;
		} catch (AWTException e) {
			System.out.println("Robot实例化失败");
		}
		return null;
	}
	
	public static void main(String[] args) {
		if(getCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()))!=null)
			System.out.println("截屏获取成功");
	}

}
