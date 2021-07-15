package th3;

class ProductTh extends Thread{
	ProductConsume procon;
	public ProductTh(ProductConsume procon){
		this.procon = procon;
	}
	public void run(){
		for(int i =1;i<100;i++){
			procon.set(i);
			try{
				sleep(100);
			}catch(Exception e){}
		}
	}
}

