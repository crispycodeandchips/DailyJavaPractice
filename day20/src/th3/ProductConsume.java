package th3;

class ProductConsume{
	private boolean flag = false;
	private int goods = 0;

	public int get(){  // 소비
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

	public synchronized  void set(int goods){  //생산
		while(flag == true){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}// wile
		this.goods = goods;
		System.out.println(this.goods+"번째 자원을 생산했습니다");
		notifyAll();
		flag = true;
	}  //set method

} // class 
