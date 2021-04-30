package ro.ugal.student.magazin.models;

public class Prelungitoare extends Lampa {
	
	
	private int numarprize; // random cu r.nextInt
	private String protectii;
	private String material;
	private String culoareprelungitor; //aceeasi metoda ca la Lampi
	private int puteremaxima; // random cu r.nextInt
	private int amperaj; // random cu r.nextInt
	private double lungimecablu;  // random cu r.nextDouble() ..
	
	public Prelungitoare() {
		
	}

	public Prelungitoare(int pret, int garantie, String codProdus, boolean retur,   String tipIntrerupator, boolean deschidereColet, int numarprize, String protectii, String material,
			String culoare, int puteremaxima, int amperaj, double lungimecablu) {
		super(pret,garantie,codProdus, retur,   tipIntrerupator, deschidereColet);
		
		this.numarprize = numarprize;
		this.protectii = protectii;
		this.material = material;
		this.culoareprelungitor = culoare;
		this.puteremaxima = puteremaxima;
		this.amperaj = amperaj;
		this.lungimecablu = lungimecablu;
		
		
	}
	
	
	/*public Prelungitoare(Prelungitoare entity) {
		super(entity.getPret(),entity.getGarantie(),entity.getCodProdus(), entity.isRetur(), entity.getTipIntrerupator(), entity.isDeschidereColet());
		
		this.numarprize = entity.numarprize;
		this.protectii = entity.protectii;
		this.material = entity.material;
		this.culoareprelungitor = entity.culoareprelungitor;
		this.puteremaxima = entity.puteremaxima;
		this.amperaj = entity.amperaj;
		this.lungimecablu = entity.lungimecablu;
		
	}*/


	public int getNumarprize() {
		return numarprize;
	}

	public void setNumarprize(int numarprize) {
		this.numarprize = numarprize;
	}

	public String getProtectii() {
		return protectii;
	}

	public void setProtectii(String protectii) {
		this.protectii = protectii;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCuloareprelungitor() {
		return culoareprelungitor;
	}

	public void setCuloareprelungitor(String culoareprelungitor) {
		this.culoareprelungitor = culoareprelungitor;
	}

	public int getPuteremaxima() {
		return puteremaxima;
	}

	public void setPuteremaxima(int puteremaxima) {
		this.puteremaxima = puteremaxima;
	}

	public int getAmperaj() {
		return amperaj;
	}

	public void setAmperaj(int amperaj) {
		this.amperaj = amperaj;
	}

	public double getLungimecablu() {
		return lungimecablu;
	}

	public void setLungimecablu(double lungimecablu) {
		this.lungimecablu = lungimecablu;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prelungitoare [numarprize=");
		builder.append(numarprize);
		builder.append(", protectii=");
		builder.append(protectii);
		builder.append(", material=");
		builder.append(material);
		builder.append(", culoareprelungitor=");
		builder.append(culoareprelungitor);
		builder.append(", puteremaxima=");
		builder.append(puteremaxima);
		builder.append(", amperaj=");
		builder.append(amperaj);
		builder.append(", lungimecablu=");
		builder.append(lungimecablu);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
