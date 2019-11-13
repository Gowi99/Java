class Program
{ 
    public static void main (String[] args) 
    { 
        
		int x=2;
		boolean ifPrime = true;
		
		for(int i=2; i<x; i++)
			if(x%i!==0 && x%1==0 && x%x==0){
				
				ifPrime = true;
			}
			
			if(ifPrime == false && i==){
				
				
			}
		
		
    } 
}





/*



x == pierwsza:

*x % 1 == 0
*x % x == 0 

x % i == 0 ---> (i!=1 && i!=x)  

if(x%i == 0 && x%1)