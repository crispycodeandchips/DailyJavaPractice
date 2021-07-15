package day11;

public class MemberDTO {
	
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;

	public MemberDTO(String name, int kor, int eng) //»ý¼ºÀÚ 
	{
		if(name==null) this.name="";
		if(kor<0) kor=0;
		if(eng<0) eng=0;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null) name="";
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
	   if(kor<0) kor=0;
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng<0) eng=0;
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
}
