package Engine;

import java.awt.Dimension;
import javax.swing.JFrame;

//���� ����� ����� ��������� ����
public class Gui_Factory extends Coord {
	
	public static JFrame Kappa = new JFrame("Kappa");//������� ������ ������ JFrame
	
	public static void CreateWindow(int x, int y) {
		
		//JFrame.setDefaultLookAndFeelDecorated(true);
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������, ��� ��������� ����������� ��� �������� ����
		
		Kappa.setPreferredSize(new Dimension(x, y));//�������������� ������
		
		Kappa.pack();//���� � �����, � �� ������������ �����
		Kappa.setVisible(true);//��� � ��� ����(Okno delayetsya visibilnim)
		
	}

}
