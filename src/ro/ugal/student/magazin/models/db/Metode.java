package ro.ugal.student.magazin.models.db;


import java.util.Random;

public class Metode {
	
	//Acest "r" reprezinta metoda random atat pentru pret cat si pentru retur si deschidere
	Random r = new Random();
	
	//Metoda pentru a genera un cod de produs random
	//Metodele pentru generarea random la produsele din clasa principala Lampa
	public String RandomCod() {
		
		int n=8;
		// alegem caracterele din care vrem sa se faca extragerea pentru generarea unui cod de produs
					String RandomCod = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
												+ "0123456789";
												
	
					// cream un sir cu n elemente unde se incarca caracterele aleatorii
					StringBuilder sb = new StringBuilder(n);
				
	
					for (int i = 0; i < n; i++) { 
	
						// se genereaza un numar random unde se gaseste un anumit caracter
						// index se incarca cu caracterul random ales din sirul mama RandomCod
						int index = (int)( RandomCod.length()* Math.random()); 
	
						// incarca caracterele unul cate unul la sfarsitul sirului sb
						sb.append( RandomCod.charAt(index)); 
					} 
	
					return sb.toString(); 
		
	}
	
	public int RandomGarantie() {
	
	int[] test = { 3,6,12,18,24,30,36,48,54,60};
	
	
	int random = (int)(Math.random()*test.length);
	
	return test[random];
			
	}
	
	public int RandomNrPrize() {
		
	int[] test = { 3,4,5,6,7,10,11,12,13,14,20};
	
	
	int random = (int)(Math.random()*test.length);
	
	return test[random];
			
	}

	public String RandomTipIntrerupator() {


			//Trebuie scris tipuri de intrerupator
			//TO DO
			String test[] ={"normal", "clasic" , "touch" , "senzor miscare",
					"senzor lumina", "senzor tactic"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
	
	
	
	public String RandomMontareExt() {
		//Trebuie scris mai multe tipuri montare de  pentru lampile de exterior
		//TO DO
		String test[] ={"perete", " tavan" , "agatare" , "sol",
				"treapta", "plutire"} ;
		int random = (int)(Math.random()*test.length);
	
		
		
		return test[random];
	}
		
		public String RandomMontareInt() {




			//Trebuie scris tipuri de montare pentru interior cat mai multe
			//TO DO
			String test[] ={"perete", " tavan" , "agatare" , "sol",
					"treapta", "plutire" , " noptiera"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		
		
		public String RandomStil() {


			//Trebuie scris tipuri de Stil
			//TO DO
			String test[] ={"vechi", "medieval" , "modern" , "antic",
					"colectie", "contemporan"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomForma() {

			//Trebuie scris tipuri de forme
			//TO DO
			String test[] ={"rotunda", " patrat" , "cilindru" , "sticla",
					"floare", "cana" , "ghiveci" , " ghiozdan"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomMaterial() {


			//Trebuie scris tipuri de material
			//TO DO
			String test[] ={"fibra carbon", "metal" , "sticla" , 
					"hartie", "plastic"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomCuloare() {

			//Trebuie scris tipuri de culori
			//TO DO
			String test[] ={"verde", " alb" , "galben" , "negru",
					"rosu", "albastru"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomTipBec() {

			//Trebuie scris tipuri de bec
			//TO DO
			String test[] ={"filament", 
					"halogen", "led"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomTipLumina() {

			//Trebuie scris tipuri de lumina
			//TO DO
			String test[] ={"alb", "alb rece" , "alb calda" , 
					"galbena", "naturala"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomFunctii() {

			//Trebuie scris tipuri de functii
			//TO DO
			String test[] ={"Moduri lumini","felinar solar" , "senzor crepuscular"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomTipAcc() {

			//Trebuie scris tipuri de acumulatori
			//TO DO
			String test[] ={"Li-Ion", "NiCH"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public int RandomTensiuneAll() {
			//Trebuie sa schimbi cu tensiuni de alimentare cu numere de pana la 320 V
			
			int[] test = { 320,220,24,12};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		public int RandomPutere() {

			//Trebuie sa schimbi cu puteri in W cat vrei tu dar nu numere exagerate
			int[] test = { 250,500,600,750,1900,2500,350,400};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		public int RandomTemCuloare() {

			//Asta e ceva de ordinul miilor parca era  in lumeni deci pana la 12k cred...
			int[] test = { 1400,1600,1800,2500,3000,3500,4000,6000,6500};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		public int RandomAutonomie() {

			//cat rezista bateria in ore este 
			int[] test = { 3,4,5,6,8,10,12,24,25,30,31,32,33,35};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		public int RandomDurataIncarcare() {
			//Cat dureaza sa se incarce 100% in ore este 
			int[] test = { 1,2,3,4,5,6,7,8,9,10};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		/// pentru cea de la interior 
		public String RandomUtilizare() {

			//Trebuie scris unde se utilizeaza
			//TO DO
			String test[] ={"perete", " tavan" , "agatare" , "sol",
					"treapta", "plutire"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomClasaEficienta() {

			//Trebuie scris unde cat mai multe clase de eficienta gen A+ , A+++
			//TO DO
			String test[] ={"A+++","A++", " A+" , "A" , "B",
					"C", "D"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		//Pentru prelungitor
		public String RandomProtectii() {

			//Trebuie scris ce fel de protectii poate avea un prelungitor
			//TO DO
			String test[] ={"copii", " supraincalzire" , "supratensiune"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public String RandomMaterialPrelungitor() {




			//Trebuie scris tipuri de material pentru un prelungitor ...
			//TO DO
			String test[] ={   "carbon"
					, "plastic"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public int RandomPutereMaxima() {

			//Trebuie sa schimbi cu puteri in W cat vrei tu dar nu numere exagerate
			int[] test = { 200,300,400,500,600,700,800,900,1000,1100,1200,1300};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}

		// Pentru Sursa metodele necesare
		public String RandomStilSursa() {




			//Trebuie scris tipuri de Stil pentru o sursa de iluminat .., poate fi gen industrial
			//TO DO
			String test[] ={ 
					"casnic", "industrial"} ;
			int random = (int)(Math.random()*test.length);
		
			
			
			return test[random];
	
	}
		
		public int RandomClsProtectie() {



			//Trebuie sa schimbi cu puteri in W 
			int[] test = { 100,250,125,200,150,300,350,400,450,500,550,600,650,700,750,800,900};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		public int RandomPutereSursa() {



			//Trebuie sa schimbi cu puteri in W cat vrei tu dar nu numere exagerate
			int[] test = { 500,600,650,550,450,400,300,900,350};
			
			
			int random = (int)(Math.random()*test.length);
			
			return test[random];
					
			}
		
		
}
