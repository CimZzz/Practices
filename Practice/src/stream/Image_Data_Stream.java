package stream;

import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import file.GetFile;

/**
 * 测试通过数据读入流来读取Image
 * @author CimZzz
 *
 */
public class Image_Data_Stream {

	public static void main(String[] args) {
		DataInputStream dataInputStream;
		try {
			dataInputStream = new DataInputStream(new FileInputStream(new File(GetFile.getFilePath("txtFolder"),"main_setting.png")));
			BufferedImage bufferedImage =ImageIO.read(dataInputStream);
			ImageStream.WriteImage(bufferedImage, new File(GetFile.getFilePath("txtFolder"),"Image_Data_Stream.png"), "PNG");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
