class Main{
	
	static double Product(double[] s1,double[] s2){
		
		double wynik = 0;
		
		for(int i=0;i<s1.length;i++){
			
			wynik += s1[i]*s2[i];
			
		}
			
		return wynik;
	}
	
	public static void main(String[] args){
		
		double[] skalar1 = {1,2,3,4,5}; 
		double[] skalar2 = {1,2,3,4,5};
		
		System.out.println(Product(skalar1, skalar2));
		
	}
}