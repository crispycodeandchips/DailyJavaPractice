package th1;

import javax.swing.JButton;
import javax.swing.JFrame;

class Menu extends JFrame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
       System.out.println(" 쓰레드");		
	}
	public Menu(String title) {
		  JButton jbtn=new JButton("버튼");
		  add(jbtn);
		  setVisible(true);
		  setSize(500,500);
		  setLocation(400,400);
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
public class SampleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Menu("메뉴");
	}

}
