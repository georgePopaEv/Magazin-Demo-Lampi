package ro.ugal.student.magazin.models.db;

import java.util.ArrayList;
import java.util.List;

import ro.ugal.student.magazin.models.Prelungitoare;

public class ListPrelungitoare extends Metode {
	
	private List<Prelungitoare> prelungitoareLista = new ArrayList<Prelungitoare>();
	
	public ListPrelungitoare() {
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));

		prelungitoareLista.add(new Prelungitoare(r.nextInt(100), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomNrPrize(), RandomProtectii(), RandomMaterialPrelungitor(), RandomCuloare(), RandomPutereMaxima()
				, r.nextInt(50), r.nextDouble() ));
		
	
	}
	
	public void add(Prelungitoare entity) {
		prelungitoareLista.add(entity);
	}
	
	public void addAll( List<Prelungitoare> entity) {
	 prelungitoareLista.addAll(entity);
	}

	public List<Prelungitoare> getPrelungitoareLista() {
		return prelungitoareLista;
	}

	public void setPrelungitoareLista(List<Prelungitoare> prelungitoareLista) {
		this.prelungitoareLista = prelungitoareLista;
	}



	

}
