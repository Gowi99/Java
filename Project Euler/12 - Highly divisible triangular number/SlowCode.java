class Main{
	
	static int liczba_dzielnikow(int x){
		
		int n = 0;						// index tabeli
		int[] tab = new int[1000000];
		
		for(int i=1; i<=x; i++){
			
			if(x%i == 0){
				
				tab[n] = i;
				n += 1;
			}
		}
		return n;
	}
	
	public static void main(String[] args){

		int x = 0;
		int n = 1;
		while(n>0){
			System.out.println(x);
			x += n;
			n += 1;
			
			if(liczba_dzielnikow(x)>500){
				
				System.out.println(x);
				n = 0;
			}
			
		}
	}
}