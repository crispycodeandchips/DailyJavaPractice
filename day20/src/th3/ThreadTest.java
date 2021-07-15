package th3;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductConsume a = new ProductConsume();
		  ProductTh pro = new ProductTh(a);
		  ConsumeTh con = new ConsumeTh(a);
		  pro.start();
		  con.start();
	}

}