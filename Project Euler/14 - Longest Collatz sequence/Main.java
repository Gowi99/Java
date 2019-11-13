class Main
{
	
	static int ileRazy(int x1){
		int x = x1;
		int n=1;
		
		while(x>1){
			
			if(x%2 == 0){
				
				x = x/2;
			}
			else{
				
				x = 3*x+1;
			}
			n += 1;
			
		}
			return n;
		
	}
	
	public static void main(String[] args){

		int max_n = 1;
		int max_x = 1;
		int n = 0;

		for(int i=1; i<1000000; i++){
			
			n = ileRazy(i);
			
			if(n > max_n){
				
				max_n = n;
				max_x = i;
				System.out.println("1.MAX = " + max_x + ", n = " + max_n);
			}
		}
		System.out.println("MAX = " + max_x + ", n = " + max_n);
	}
}