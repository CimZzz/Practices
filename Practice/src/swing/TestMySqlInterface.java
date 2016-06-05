package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 一个用于检测本地mysql是否可以连接的小GUI程序
 * @author CimZzz
 *
 */
public class TestMySqlInterface {

	public static void main(String[] args) {
		JFrame jframe=new JFrame("测试能否连接Mysql数据库的小程序");
		
		
		Container container=jframe.getContentPane();
		
		JLabel []tips=new JLabel[]{
				new JLabel("本地数据库的用户名",JLabel.CENTER),
				new JLabel("本地数据库的密码",JLabel.CENTER),
				new JLabel("本地数据库的端口",JLabel.CENTER),
				new JLabel("本地数据库名",JLabel.CENTER)
		};
		JTextField[] jTextFields=new JTextField[]{
				new JTextField(),
				new JPasswordField(),
				new JTextField(),
				new JTextField()
		};
		
		JPanel jPanel=new JPanel();
		
		jPanel.setLayout(new GridLayout(4, 2));
		
		for(int i=0;i<4;i++)
		{
			jPanel.add(tips[i]);
			jPanel.add(jTextFields[i]);
		}

		JButton jButton=new JButton("尝试连接");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:"+jTextFields[2].getText()+"/"+jTextFields[3].getText()
							,jTextFields[0].getText(),jTextFields[1].getText());

					JOptionPane.showConfirmDialog(null, "OK!");
				} catch (ClassNotFoundException e1) {
					JOptionPane.showConfirmDialog(null, "No!");
					e1.printStackTrace();
				} catch (SQLException e1) {
					JOptionPane.showConfirmDialog(null, "No!");
					e1.printStackTrace();
				}
				
			}
		});
		
		container.add(jPanel,BorderLayout.CENTER);
		container.add(jButton,BorderLayout.SOUTH);
		
		jframe.setSize(500, 200);
		jframe.setLocationRelativeTo(null);
		jframe.setLocale(null);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.show();
	}

}
