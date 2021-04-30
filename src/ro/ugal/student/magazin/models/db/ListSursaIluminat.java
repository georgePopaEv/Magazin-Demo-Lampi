package ro.ugal.student.magazin.models.db;

import java.util.ArrayList;
import java.util.List;

import ro.ugal.student.magazin.models.SursaIluminat;

public class ListSursaIluminat extends Metode{
	
	private List<SursaIluminat> sursaLista = new ArrayList<SursaIluminat>();
	
	public ListSursaIluminat() {
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
		sursaLista.add(new SursaIluminat( r.nextInt(1500), RandomGarantie(), RandomCod(), r.nextBoolean(),RandomTipIntrerupator() , r.nextBoolean()
				,RandomStilSursa() ,RandomMaterial(), RandomCuloare() , RandomClsProtectie(), RandomPutereSursa()));
		
	
		
		
		
		
	}
	
		public void add(SursaIluminat entity) {
		sursaLista.add(entity);
		}
		
		public void addAll(List<SursaIluminat> entity) {
			sursaLista.addAll(entity);
		}

	public List<SursaIluminat> getSursaLista() {
		return sursaLista;
	}

	public void setSursaLista(List<SursaIluminat> sursaLista) {
		this.sursaLista = sursaLista;
	}
	
	
	

}
