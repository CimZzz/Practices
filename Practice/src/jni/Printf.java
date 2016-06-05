package jni;

import file.GetFile;

/**
 * 测试JNI编程第一步
 * 步骤1：使用javah导出.h头文件：
 *       到项目的src文件中,使用 javah+完整类名 导出.h头文件
 * 步骤2：使用CDT编写C++代码
 * 步骤3：通过 gcc -shared -fpic -o 指令导出dll
 * 步骤4：放到项目中,使用System.load加载
 * 向控制台输出字符串
 * @author CimZzz
 *
 */
public class Printf {

	static{
		System.load(GetFile.getFilePath("dllFolder/jni_Printf.dll"));
	}
	
	private native void Print(String string);
	
	public static void main(String[] args) {
		new Printf().Print("s");
	}

}
