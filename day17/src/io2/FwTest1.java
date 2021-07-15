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
				System.out.println("폴더생성완료");
			else
			   System.out.println("폴더생성 실패");	
				
			fw=new BufferedWriter(new FileWriter(new File(f, "myfav.txt"),true));
			fw.write("하이");
			fw.write("만나서 반갑습니다");
			fw.newLine();
			fw.write("저의 이름은");
			fw.newLine();
			fw.write("hong gil dong입니다");
			System.out.println("파일 쓰기 완료!!!");
			
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			if(fw!=null) try { fw.close();} catch(IOException e) {}
		}
	}
}
