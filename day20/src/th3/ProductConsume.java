package th3;

class ProductConsume{
	private boolean flag = false;
	private int goods = 0;

	public int get(){  // �Һ�
		while(flag == false){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}// while

		notifyAll();
		flag = false;
		return goods;
	}// get 

	public synchronized  void set(int goods){  //����
		while(flag == true){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}// wile
		this.goods = goods;
		System.out.println(this.goods+"��° �ڿ��� �����߽��ϴ�");
		notifyAll();
		flag = true;
	}  //set method

} // class 
