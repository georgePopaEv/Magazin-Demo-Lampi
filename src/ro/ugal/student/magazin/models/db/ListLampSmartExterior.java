package ro.ugal.student.magazin.models.db;

import java.util.ArrayList;
import java.util.List;

import ro.ugal.student.magazin.models.LampaSmartExterior;

public class ListLampSmartExterior extends Metode{
	
	private List<LampaSmartExterior> lampaSmartExteriors = new ArrayList<LampaSmartExterior>();
  
	
	public ListLampSmartExterior() {
		

		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(2500), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(), RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(),  RandomTensiuneAll(),
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(),r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		lampaSmartExteriors.add(new LampaSmartExterior(
				r.nextInt(RandomPutere()), RandomGarantie() , RandomCod(), r.nextBoolean(), RandomTipIntrerupator(), 
				r.nextBoolean(), RandomMontareExt(),RandomStil(), RandomForma(), RandomMaterial(), RandomCuloare(), 
				RandomFunctii(), RandomTipBec(), RandomTipLumina(), RandomTipAcc(), RandomTensiuneAll() ,
				RandomPutere(), RandomTemCuloare(), r.nextInt(25), RandomAutonomie(), RandomDurataIncarcare()
				));
		
	}
	
	public void add(LampaSmartExterior entity) {
		lampaSmartExteriors.add(entity);
	}

	public void addAll(List<LampaSmartExterior> entity) {
		lampaSmartExteriors.addAll(entity);
	}
	
	public List<LampaSmartExterior> getLampaSmartExteriors() {
		return lampaSmartExteriors;
	}

	public void setLampaSmartExteriors(List<LampaSmartExterior> lampaSmartExteriors) {
		this.lampaSmartExteriors = lampaSmartExteriors;
	}
	
}
