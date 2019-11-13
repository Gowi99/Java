class Program
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

			System.out.println(ileRazy(3));
		
	}
}