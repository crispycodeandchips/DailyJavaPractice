package io2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FwTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter fw=null;
		File f=new File("c:\\msa/myboard");
		try {
			boolean result=f.mkdir();
			if(result)
				System.out.println("���������Ϸ�");
			else
			   System.out.println("�������� ����");	
				
			fw=new BufferedWriter(new FileWriter(new File(f, "myfav.txt"),true));
			fw.write("����");
			fw.write("������ �ݰ����ϴ�");
			fw.newLine();
			fw.write("���� �̸���");
			fw.newLine();
			fw.write("hong gil dong�Դϴ�");
			System.out.println("���� ���� �Ϸ�!!!");
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			if(fw!=null) try { fw.close();} catch(IOException e) {}
		}
	}
}
