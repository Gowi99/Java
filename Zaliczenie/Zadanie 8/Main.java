class Main{
	
	static void powerSet(String[] Set){			//fukcja wypisująca wszystkie podzbiory
		
		int n = Set.length;		//ilosc elementow w zbiorze
		int ilosc = (int) Math.pow(2, n);	//ilosc podzbiorow (okreslana wzorem 2^n)
		String[] powerSet = new String[ilosc];		//tablica z podzbiorami
		
		int i = 1;
		int l;		//pomocnicza zmienna 
		
		powerSet[0] = "";	//pierwszy podzbior jest zawsze pusty
		
		for(int a=0; a<n; a++){			//petla zewnetrzna
			
			l = i;		//wykorzystanie pomocniczej zmiennej, aby petla wewnetrzna dzialala poprawnie
			
			for(int j=0; j<l; j++){		//petla wewnetrzna
				
				powerSet[i] = powerSet[j] + Set[a];		//tworzenie podzbiorow na podstawie juz istniejacych
				
				i++;
			}
			
		}
		
		for(int k=0; k<ilosc; k++){			//petla wypisujaca podzbiory na ekran
			
			System.out.print("["+powerSet[k]+"] ");
		}
	
	}
	
	public static void main(String[] args){
	
		String[] Set = {"0","1","2","3","4"};		//zbior, z ktorego wyznaczamy podzbiory
		
		powerSet(Set);
		
	}
}