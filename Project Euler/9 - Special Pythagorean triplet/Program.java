class Program
{
	
	static boolean spr_tys(int a, int b, int c){
		
		return a+b+c == 1000;
		
	}
	
	static boolean spr_trojkat(int a, int b, int c){
		
		return a*a + b*b == c*c;
		
	}
	
	public static void main(String[] args){
		
		int a = 1;		//liczby poddane sprawdzaniu
		int b = 1;
		int c = 1;
		int a1 = 0;		//liczby ktore otrzymaja wartosc, jezeli spelnia warunki
		int b1 = 0;
		int c1 = 0;
	
		while(a<1000){
			
			if(spr_tys(a,b,c) && spr_trojkat(a,b,c))		//sprawdzanie czy spelniaja warunki
			{
				a1 = a;										//jezeli tak to przypisanie wartosci
				b1 = b;
				c1 = c;
			}
				
			a++;
			
			if(c == 999)		//wykorzystane wszystkie mozliwosci
			{
				a = 1000;		//IF TRUE zakonczenie petli
			}
			if(b == 999)
			{
				c += 1;
				a = 1;
				b = 1;
			}
			else if(a == 999)
			{
				b += 1;
				a = 1;
			}
		}
		
		System.out.println("a1 = "+a1);
		System.out.println("b1 = "+b1);
		System.out.println("c1 = "+c1);
		
		System.out.println("a*b*c = " + a1*b1*c1);
		
	}
}