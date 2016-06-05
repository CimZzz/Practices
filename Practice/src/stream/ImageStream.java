package stream;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import file.GetFile;
import robot.Robot_Capture;

/**
 * 测试图像读入输出流
 * @author CimZzz
 *
 */
public class ImageStream {
	
	public static void WriteImage(RenderedImage im,File file,String format)
	{
		try {
			ImageIO.write(im, format, file);
			System.out.println("图像写入图像成功");
		} catch (IOException e) {
			System.out.println("图像写入图像失败");
		}
	}
	
	public static BufferedImage ReadImage(File file)
	{
		try {
			BufferedImage bufferedImage=ImageIO.read(file);
			System.out.println("图像读入图像成功");
			
			return bufferedImage;
		} catch (IOException e) {
			System.out.println("图像读入图像失败");
		}
		return null;
	}
	
	public static void main(String[] args) {
		//WriteImage(Robot_Capture.getCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())),new File(GetFile.getFilePath("txtFolder"),"ImageStreamTest.png"), "PNG");
		
		BufferedImage bufferedImage=ReadImage(new File(GetFile.getFilePath("txtFolder"),"ImageStreamTest.png"));
		
		WriteImage(bufferedImage,new File(GetFile.getFilePath("txtFolder"),"ImageStreamTest_Read.png"), "PNG");
	}

}
