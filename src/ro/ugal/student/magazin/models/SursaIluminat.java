package ro.ugal.student.magazin.models;

public class SursaIluminat extends Lampa {

	private String stilsursa;
	private String  materialsursa; //Folosim aceeasi ca si la Lampi 
	private String  culoaresursa; // Aceeasi metoda ca la lampi
	private int clsprotectie; 
	private int puteresursamax;
	
	public SursaIluminat () {
		
	}

	public SursaIluminat(int pret, int garantie, String codProdus, boolean retur, String tipIntrerupator,
			boolean deschidereColet ,String stilsursa, String materialsursa, String culoaresursa, int clsprotectie,
			int puteresursamax) {
		super(pret, garantie, codProdus, retur, tipIntrerupator, deschidereColet);
		this.stilsursa = stilsursa;
		this.materialsursa = materialsursa;
		this.culoaresursa = culoaresursa;
		this.clsprotectie = clsprotectie;
		this.puteresursamax = puteresursamax;
	}

	public SursaIluminat(SursaIluminat entity) {
		super(entity.getPret(), entity.getGarantie(),entity.getCodProdus(),entity.isRetur(),entity.getTipIntrerupator(),entity.isDeschidereColet());
		this.stilsursa = entity.stilsursa;
		this.materialsursa = entity.materialsursa;
		this.culoaresursa = entity.culoaresursa;
		this.clsprotectie = entity.clsprotectie;
		this.puteresursamax = entity.puteresursamax;
	}

	public String getStilsursa() {
		return stilsursa;
	}

	public void setStilsursa(String stilsursa) {
		this.stilsursa = stilsursa;
	}

	public String getMaterialsursa() {
		return materialsursa;
	}

	public void setMaterialsursa(String materialsursa) {
		this.materialsursa = materialsursa;
	}

	public String getCuloaresursa() {
		return culoaresursa;
	}

	public void setCuloaresursa(String culoaresursa) {
		this.culoaresursa = culoaresursa;
	}

	public int getClsprotectie() {
		return clsprotectie;
	}

	public void setClsprotectie(int clsprotectie) {
		this.clsprotectie = clsprotectie;
	}

	public int getPuteresursamax() {
		return puteresursamax;
	}

	public void setPuteresursamax(int puteresursamax) {
		this.puteresursamax = puteresursamax;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SursaIluminat [stilsursa=");
		builder.append(stilsursa);
		builder.append(", materialsursa=");
		builder.append(materialsursa);
		builder.append(", culoaresursa=");
		builder.append(culoaresursa);
		builder.append(", clsprotectie=");
		builder.append(clsprotectie);
		builder.append(", puteresursamax=");
		builder.append(puteresursamax);
		builder.append("]");
		return builder.toString();
	}
	
	


	
	
}
