class Main{
	
	static int wymiarI(int[][] macierz){		//	wymiar i (liczba wierszy)
		
	 int wymiar = macierz.length;
		
		return wymiar;
	}
	
	static int wymiarJ(int[][] macierz){		//	wymiar j (liczba kolumn) (na podstawie pierwszego wiersza)

		int wymiar = macierz[0].length;
		
		return wymiar;
	}
	
	static int[][] iloczynMacierzy(int[][] macierzX, int[][] macierzY){
		
		int Xi = wymiarI(macierzX);		//	wymiary
		int Xj = wymiarJ(macierzX);		//	i oraz j
		int Yi = wymiarI(macierzY);		//	dla macierzy
		int Yj = wymiarJ(macierzY);		//	X oraz Y
		
		int Wi = Xi;
		int Wj = Yj;
		
		int[][] macierzW = new int[Wi][Wj];		//	macierz Wynikowa o wymiarze Xi x Yj
		
		for(int i=0; i<Wi; i++){
			
			for(int j=0; j<Wj; j++){
				
				for(int n=0; n<Xj; n++){
				
					macierzW[i][j] += macierzX[i][n]*macierzY[n][j];
				
				
				}
			}
		}
		
		return macierzW;
	}
	
	public static void main(String[] args){
	
		int[][] tabX = 	{{1,2},			//	pierwsza macierz (X)
						 {3,4}};
		
		int[][] tabY = 	{{1,2},			//	druga macierz	(Y)
						 {3,4}};
		
// ===============================================================================

		if(wymiarJ(tabX)==wymiarI(tabY)){		//	warunek musi byc spelniony do mnozenia macierzy
		
			int[][] tabW = iloczynMacierzy(tabX, tabY);
			
			for(int i=0; i<wymiarI(tabX); i++){		//	wypisywanie na ekran macierzy Wynikowej (in main: tabW	//	in f(): macierzW)
				
				for(int j=0; j<wymiarJ(tabY); j++){
				
					System.out.print(tabW[i][j]+" ");
				}
				
				System.out.println();
			}
		}
	}
}