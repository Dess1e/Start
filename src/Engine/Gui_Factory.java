package Engine;

import javax.swing.JFrame;

//���� ����� ����� ��������� ����
public class Gui_Factory extends Coord {
	
	public static JFrame Kappa = new JFrame("Kappa");//������� ������ ������ JFrame
	
	public static void createWindow() {
		
		Kappa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������, ��� ��������� ����������� ��� �������� ����
		
		Kappa.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Kappa.setVisible(true);//��� � ��� ����(Okno delayetsya visibilnim)
		
	}
	
	public static void createPanel() {
		
		
		
	}

}
