package Engine;

import java.awt.Dimension;
import javax.swing.JFrame;
//���� ����� ����� ��������� ����
public class Gui_Factory extends Coord {
	
	public static void CreateWindow(int x, int y) {
		
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Window = new JFrame("Kappa");//������� ������ ������ JFrame
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������, ��� ��������� ����������� ��� �������� ����
		
		Window.setPreferredSize(new Dimension(x, y));//�������������� ������
		
		Window.pack();//���� � �����, � �� ������������ �����
		Window.setVisible(true);//��� � ��� ����(Okno delayet visibilnim)
		
	}

}
