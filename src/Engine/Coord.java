/**
 * 
 */
package Engine;

import java.awt.*;
import javax.swing.JPanel;
import Engine.*;

/**
 * @author ����
 *��� ����� ����������� ������� �����
 */
public class Coord {

		public static void Draw_Grid(int x, int y ,int z) {
			
			JPanel Panel = new JPanel();//������� ������� ��� ���������
			Panel.setBackground(Color.getHSBColor(x, y, z));//������ ���� ����
			Panel.setLayout(new FlowLayout());//����� ����
			
			Gui_Factory.Kappa.add(Panel);//��������� � ������� ���� ��������� ������ �������

		}
		
		public static int getCoordX(int x) {
			
			int squareX;
			
			squareX = (x*32) - 16;
			
			return squareX;
		}
		
		public static int getCoordY(int y) {
			
			int squareY;
			
			squareY = (y*32) - 16;
			
			return squareY;
			
		}

}
