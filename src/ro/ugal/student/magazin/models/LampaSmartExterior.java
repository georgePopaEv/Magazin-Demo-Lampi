package ro.ugal.student.magazin.models;

public class LampaSmartExterior extends Lampa {

	private String tipmontare;
	private String stil;
	private String forma;
	private String material;
	private String culoare;
	private String functii;
	private String tipbec;
	private String tiplumina;
	private String tipaacumulator;
	private int tensiunealimentare, putere, temperaturaculoare, nrsurseiluminat, autonomie, durataincarcare;

	/*
	 * constructor fara parametri
	 */
	public LampaSmartExterior() {
		// this.tipaacumulator = "";
	}

	/*
	 * constructor cu parametri
	 */
	public LampaSmartExterior(int pret, int garantie, String codProdus, boolean retur, String tipIntrerupator,
			boolean deschidereColet, String tipmontare, String stil, String forma, String material, String culoare,
			String functii, String tipbec, String tiplumina, String tipaacumulator, int tensiunealimentare, int putere,
			int temperaturaculoare, int nrsurseiluminat, int autonomie, int durataincarcare) {
		super(pret, garantie, codProdus, retur, tipIntrerupator, deschidereColet);
		this.tipmontare = tipmontare;
		this.stil = stil;
		this.forma = forma;
		this.material = material;
		this.culoare = culoare;
		this.functii = functii;
		this.tipbec = tipbec;
		this.tiplumina = tiplumina;
		this.tipaacumulator = tipaacumulator;
		this.tensiunealimentare = tensiunealimentare;
		this.putere = putere;
		this.temperaturaculoare = temperaturaculoare;
		this.nrsurseiluminat = nrsurseiluminat;
		this.autonomie = autonomie;
		this.durataincarcare = durataincarcare;
	}

	/*
	 * constructor copiere
	 */
	/*public LampaSmartExterior(LampaSmartExterior entity) {
		super(entity.getPret(), entity.getGarantie(), entity.getCodProdus(), entity.isRetur(),
				entity.getTipIntrerupator(), entity.isDeschidereColet());
		this.tipmontare = entity.tipmontare;
		this.stil = entity.stil;
		this.forma = entity.forma;
		this.material = entity.material;
		this.culoare = entity.culoare;
		this.functii = entity.functii;
		this.tipbec = entity.tipbec;
		this.tiplumina = entity.tiplumina;
		this.tipaacumulator = entity.tipaacumulator;
		this.tensiunealimentare = entity.tensiunealimentare;
		this.putere = entity.putere;
		this.temperaturaculoare = entity.temperaturaculoare;
		this.nrsurseiluminat = entity.nrsurseiluminat;
		this.autonomie = entity.autonomie;
		this.durataincarcare = entity.durataincarcare;
	}*/

	public String getTipmontare() {
		return tipmontare;
	}

	public void setTipmontare(String tipmontare) {
		this.tipmontare = tipmontare;
	}

	public String getStil() {
		return stil;
	}

	public void setStil(String stil) {
		this.stil = stil;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public String getFunctii() {
		return functii;
	}

	public void setFunctii(String functii) {
		this.functii = functii;
	}

	public String getTipbec() {
		return tipbec;
	}

	public void setTipbec(String tipbec) {
		this.tipbec = tipbec;
	}

	public String getTiplumina() {
		return tiplumina;
	}

	public void setTiplumina(String tiplumina) {
		this.tiplumina = tiplumina;
	}

	public String getTipaacumulator() {
		return tipaacumulator;
	}

	public void setTipaacumulator(String tipaacumulator) {
		this.tipaacumulator = tipaacumulator;
	}

	public int getTensiunealimentare() {
		return tensiunealimentare;
	}

	public void setTensiunealimentare(int tensiunealimentare) {
		this.tensiunealimentare = tensiunealimentare;
	}

	public int getPutere() {
		return putere;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}

	public int getTemperaturaculoare() {
		return temperaturaculoare;
	}

	public void setTemperaturaculoare(int temperaturaculoare) {
		this.temperaturaculoare = temperaturaculoare;
	}

	public int getNrsurseiluminat() {
		return nrsurseiluminat;
	}

	public void setNrsurseiluminat(int nrsurseiluminat) {
		this.nrsurseiluminat = nrsurseiluminat;
	}

	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	public int getDurataincarcare() {
		return durataincarcare;
	}

	public void setDurataincarcare(int durataincarcare) {
		this.durataincarcare = durataincarcare;
	}



}
