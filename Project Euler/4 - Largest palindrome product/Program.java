class Program
{
	
	static boolean palindrom(int x1){

		int x = x1;
		int n, r;		//n - okresla wielkosc liczby //r - reszta
		int y = 0;		//y - liczba odwrotna
		int m = 1;		//m - mnoznik
		
		int[] t = new int[6]; 
		
		if(x > 99999){n = 5;} 
		else if(x > 9999){n = 4;} 
		else if(x > 999){n = 3;} 
		else if(x > 99){n = 2;} 
		else if(x > 9){n = 1;} 
		else if(x > 0){n = 0;}
		else {n = -1;}
		
		
		for(int i=0; i < n+1; i++)			//tworzenie tablicy z czesciami dziesietnymi
		{
			r = x % 10;
			t[i] = r;
			x = x / 10;
			
		}
		
		while(n >= 0)						//tworzenie liczby odwrotnej poprzez dodawanie
		{
			
			y = y + (t[n]*m);
			m *= 10;
			n -= 1;
		}		

			return x1 == y;					//sprawdzanie czy palindrom

	}
	
	public static void main(String[] args){
		
		
		int max = 0;		//najwiekszy znaleziony palindrom
		int a = 100;
		int b = 100;
		int c;
		
		while(a<1000)
		{
			c = a*b;
			a +=1;
			
			if(palindrom(c))
			{
				if(c > max)
				{
					max = c;
					
				}
			}
			
			if(b == 999){
				
				System.out.println(max);
			}
			else if(a==999){
				
				b += 1;
				a = b;
			}
		}
	
	}	
}