package ro.ugal.student.magazin.models;

public class Lampa {
	private int pret;
	private int garantie;
	private String codProdus;
	private boolean retur;
	private boolean deschidereColet;
	private String tipIntrerupator;

	public Lampa() {
	}

	public Lampa(int pret, int garantie, String codProdus, boolean retur,   String tipIntrerupator, boolean deschidereColet) {
		super();
		this.pret = pret;
		this.garantie = garantie;
		this.codProdus = codProdus;
		this.retur = retur;
		this.deschidereColet = deschidereColet;
		this.tipIntrerupator = tipIntrerupator;
	
	}

	public void copy(Lampa entity) {
		this.pret = entity.pret;
		this.garantie = entity.garantie;
		this.codProdus = entity.codProdus;
		this.retur = entity.retur;
		this.deschidereColet = entity.deschidereColet;
		this.tipIntrerupator = entity.tipIntrerupator;
	
	}

	public int getPret() {
		return pret;

	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public int getGarantie() {
		return garantie;
	}

	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}

	public boolean isRetur() {
		return retur;
	}

	public void setRetur(boolean retur) {
		this.retur = retur;
	}

	public boolean isDeschidereColet() {
		return deschidereColet;
	}
	
	public void setDeschidereColet(boolean deschidereColet) {
		this.deschidereColet = deschidereColet;
		
	}
	
	public String getCodProdus() {
		return codProdus;
	}

	public void setCodProdus(String codProdus) {
		this.codProdus = codProdus;
	}

	public String getTipIntrerupator() {
		return tipIntrerupator;
	}

	public void setTipIntrerupator(String tipIntrerupator) {
		this.tipIntrerupator = tipIntrerupator;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(pret);
		builder.append(" | ");
		builder.append(garantie);
		builder.append(" (de) luni ");
		builder.append(" | ");
		builder.append(codProdus);
		builder.append(" | ");
		builder.append(retur);
		builder.append(" | ");
		builder.append(tipIntrerupator);
		builder.append(" | ");
		builder.append(deschidereColet);
		builder.append("\n");
		return builder.toString();
	}

	public String Random(int n) {
		
		// chose a Character random from this String 
					String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
												+ "0123456789"
												+ "abcdefghijklmnopqrstuvxyz"; 
	
					// create StringBuffer size of AlphaNumericString 
					StringBuilder sb = new StringBuilder(n); 
	
					for (int i = 0; i < n; i++) { 
	
						// generate a random number between 
						// 0 to AlphaNumericString variable length 
						int index 
							= (int)(AlphaNumericString.length() 
									* Math.random()); 
	
						// add Character one by one in end of sb 
						sb.append(AlphaNumericString 
									.charAt(index)); 
					} 
	
					return sb.toString(); 
		
	}

}
