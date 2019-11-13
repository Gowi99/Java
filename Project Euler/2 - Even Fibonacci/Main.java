class Main
{
	
	public static void main(String[] args){
	
		
		int x3 = 0;
		int x2 = 0;
		int x1 = 1;
		int sum = 0;
		while(x1<=4000000){
			
			if(x1%2 == 0){
			
				sum += x1;
			}
		
			x3 = x2;
			x2 = x1;
			x1 = x2 + x3;
		
		}
		
		System.out.println("suma = " + sum);
	}
}

