class Program
{ 
    public static void main (String[] args) 
    { 
		
		int sum_kw = 0;
		int sum = 0;
		int kw_sum = 0;
		int r;
		int n = 100;
		
		for(int i=1; i<=n; i++){
			
			sum_kw += i*i;		//liczenie sumy kwadratow
			
		}
		//System.out.println("suma kwadratu = " + sum_kw);
		
		for(int i=1; i<=n; i++){
			
			sum += i;			//liczenie sumy
			
		}
		
		kw_sum = sum*sum;
		
		r = kw_sum - sum_kw;
		
		System.out.println("suma kwadratow = " + sum_kw);
		System.out.println("suma = " + sum);
		System.out.println("kwadrat sumy = " + kw_sum);
		System.out.println("roznica = " + r);
		
    } 
}