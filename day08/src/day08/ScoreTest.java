package day08;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input inwon");
		int inwon = Integer.parseInt(sc.nextLine());
		
		if (inwon > 10)
		{
			System.out.println("입력오류!!!");
		}else {
			String[] name = new String[inwon];
			int[] kor = new int[inwon];
			int[] eng = new int[inwon];
			int[] tot = new int[inwon];
			float[] avg = new float[inwon];
			String[] result = new String[inwon];
			
			// 입력
			for(int i=0; i<inwon; i++)
			{
				System.out.println("input name");
				name[i] = sc.nextLine();
				System.out.println("input kor");
				kor[i] = Integer.parseInt(sc.nextLine());
				System.out.println();
				eng[i] = Integer.parseInt(sc.nextLine());
				
				tot[i] = kor[i]+eng[i];
				avg[i] = (float)tot[i]/2;
				
				if (avg[i] >= 90) {
					result[i] = "A";

				} else if (avg[i] >= 80) {
					result[i] = "B";

				} else if (avg[i] >= 70) {
					result[i] = "C";

				} else if (avg[i] >= 60) {
					result[i] = "D";

				} else
					result[i] = "F";
			}
			
			
			int imsi=0;
			String nimsi="";
			float avgimsi=0;
			for(int i=0; i<inwon-1  ; i++)
			{
				for(int j=i+1  ; j<inwon; j++)
				{
					if(tot[i]<tot[j])
					{
						nimsi=name[i];
						name[i]=name[j];
						name[j]=nimsi;

						imsi=kor[i];
						kor[i]=kor[j];
						kor[j]=imsi;

						imsi=eng[i];
						eng[i]=eng[j];
						eng[j]=imsi;

						imsi=tot[i];
						tot[i]=tot[j];
						tot[j]=imsi;

						avgimsi=avg[i];
						avg[i]=avg[j];
						avg[j]=avgimsi;

						nimsi=result[i];
						result[i]=result[j];
						result[j]=nimsi;
					}
				}
			}

              //처리
             
             
             //결과보기
             System.out.println("이름\t 국어\t 영어\t 총점\t 평균");
             System.out.println("========================================");
             for(int i=0; i<inwon; i++)
             {
            	 System.out.printf("%s\t %d\t %d\t %d\t %.3f\t   %s\n",
            			 name[i], kor[i], eng[i], tot[i], avg[i],result[i]);
             }
		}
		sc.close();
	}
}

