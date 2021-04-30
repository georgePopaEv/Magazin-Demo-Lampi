package ro.ugal.student.magazin.models.db;

import java.util.ArrayList;
import java.util.List;

import ro.ugal.student.magazin.models.LampaSmartInterior;

public class ListLampSmartInterior extends Metode{
	
	private List<LampaSmartInterior> LampaSmartInteriors = new ArrayList<LampaSmartInterior>();
	
	public ListLampSmartInterior () {
		
		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod(), r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(), r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod(), r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(),RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod(), r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(),RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(),RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(),RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() ,r.nextBoolean()  , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean(),RandomMontareInt() , RandomStil() , RandomUtilizare(), RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(),RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));

		LampaSmartInteriors.add(new LampaSmartInterior(r.nextInt(10000) ,RandomGarantie() ,RandomCod() , r.nextBoolean() , 
				RandomTipIntrerupator(), r.nextBoolean() ,RandomMontareInt() , RandomStil() , RandomUtilizare(),RandomForma(),
								RandomMaterial(), RandomCuloare(), RandomFunctii(), RandomClasaEficienta(),r.nextInt(250), RandomTipBec(), r.nextInt(25)));
		
	}
	
	public void add(LampaSmartInterior entity) {
	LampaSmartInteriors.add(entity);
	}
	
	public void addAll(List<LampaSmartInterior> entity) {
		LampaSmartInteriors.addAll(entity);
	}
	
	
	public List<LampaSmartInterior> getLampaSmartInteriors() {
		return LampaSmartInteriors;
	}

	public void setLampaSmartInteriors(List<LampaSmartInterior> lampaSmartInteriors) {
		this.LampaSmartInteriors = lampaSmartInteriors;
	}
	

}
