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
				System.out.println(good+"��° �ڿ��� �Һ��߽��ϴ�.");
			}

			try{
				sleep(100);
			}catch(Exception e){}
		}
	}
}