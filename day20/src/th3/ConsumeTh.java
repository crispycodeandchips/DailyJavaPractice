package th3;

class ConsumeTh extends Thread{
	ProductConsume procon;
	public ConsumeTh(ProductConsume procon){
		this.procon =procon ;
	}
	public void run(){
		for(int i = 1;i<100;i++){
			synchronized (procon) {
				int good= procon.get();
				System.out.println(good+"번째 자원을 소비했습니다.");
			}

			try{
				sleep(100);
			}catch(Exception e){}
		}
	}
}