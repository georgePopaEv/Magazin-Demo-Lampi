package ro.ugal.student.magazin.models;

public class LampaSmartInterior extends Lampa{
	
	private String tipmontareint;
	private String stilint;
	private String utilizareint;
	private String formaint;
	private String materialint;
	private String culoareint;
	private String functiiint;
	private String clasaeficienta;
	private int putereW;
	private String tipbecint;
	private int surseiluminatint;
	
	public LampaSmartInterior(){
		
	}

	public LampaSmartInterior(int pret, int garantie, String codProdus, boolean retur, String tipIntrerupator,
			boolean deschidereColet, String tipmontareint, String stilint, String utilizareint, String formaint,
			String materialint, String culoareint, String functiiint, String clasaeficienta, int putereW,
			String tipbecint, int surseiluminatint) {
		super(pret, garantie, codProdus, retur, tipIntrerupator, deschidereColet);
		this.tipmontareint = tipmontareint;
		this.stilint = stilint;
		this.utilizareint = utilizareint;
		this.formaint = formaint;
		this.materialint = materialint;
		this.culoareint = culoareint;
		this.functiiint = functiiint;
		this.clasaeficienta = clasaeficienta;
		this.putereW = putereW;
		this.tipbecint = tipbecint;
		this.surseiluminatint = surseiluminatint;
	}
	
	public LampaSmartInterior(LampaSmartInterior entity) {
		super(entity.getPret(), entity.getGarantie(),entity.getCodProdus(),entity.isRetur(),entity.getTipIntrerupator(),entity.isDeschidereColet());
		this.tipmontareint = entity.tipmontareint;
		this.stilint = entity.stilint;
		this.utilizareint = entity.utilizareint;
		this.formaint = entity.formaint;
		this.materialint = entity.materialint;
		this.culoareint = entity.culoareint;
		this.functiiint = entity.functiiint;
		this.clasaeficienta = entity.clasaeficienta;
		this.putereW = entity.putereW;
		this.tipbecint = entity.tipbecint;
		this.surseiluminatint = entity.surseiluminatint;
	}

	public String getTipmontareint() {
		return tipmontareint;
	}

	public void setTipmontareint(String tipmontareint) {
		this.tipmontareint = tipmontareint;
	}

	public String getStilint() {
		return stilint;
	}

	public void setStilint(String stilint) {
		this.stilint = stilint;
	}

	public String getUtilizareint() {
		return utilizareint;
	}

	public void setUtilizareint(String utilizareint) {
		this.utilizareint = utilizareint;
	}

	public String getFormaint() {
		return formaint;
	}

	public void setFormaint(String formaint) {
		this.formaint = formaint;
	}

	public String getMaterialint() {
		return materialint;
	}

	public void setMaterialint(String materialint) {
		this.materialint = materialint;
	}

	public String getCuloareint() {
		return culoareint;
	}

	public void setCuloareint(String culoareint) {
		this.culoareint = culoareint;
	}

	public String getFunctiiint() {
		return functiiint;
	}

	public void setFunctiiint(String functiiint) {
		this.functiiint = functiiint;
	}

	public String getClasaeficienta() {
		return clasaeficienta;
	}

	public void setClasaeficienta(String clasaeficienta) {
		this.clasaeficienta = clasaeficienta;
	}

	public int getPutereW() {
		return putereW;
	}

	public void setPutereW(int putereW) {
		this.putereW = putereW;
	}

	public String getTipbecint() {
		return tipbecint;
	}

	public void setTipbecint(String tipbecint) {
		this.tipbecint = tipbecint;
	}

	public int getSurseiluminatint() {
		return surseiluminatint;
	}

	public void setSurseiluminatint(int surseiluminatint) {
		this.surseiluminatint = surseiluminatint;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LampaSmartInterior [tipmontareint=");
		builder.append(tipmontareint);
		builder.append(", stilint=");
		builder.append(stilint);
		builder.append(", utilizareint=");
		builder.append(utilizareint);
		builder.append(", formaint=");
		builder.append(formaint);
		builder.append(", materialint=");
		builder.append(materialint);
		builder.append(", culoareint=");
		builder.append(culoareint);
		builder.append(", functiiint=");
		builder.append(functiiint);
		builder.append(", clasaeficienta=");
		builder.append(clasaeficienta);
		builder.append(", putereW=");
		builder.append(putereW);
		builder.append(", tipbecint=");
		builder.append(tipbecint);
		builder.append(", surseiluminatint=");
		builder.append(surseiluminatint);
		builder.append("]");
		return builder.toString();
	}


	
	

}
