package com.fokkenrood.drools;

public class Aangifte {
	//		input:
	String	goederen_omschrijving		= null;
	String	land_van_herkomst			= null;	
	int		factuurwaarde				= -1;
	int		percentage_invoerrecht		= -1;
	//		output:
	int		bedrag_aan_invoerrecht		= -1;
	String	certificaat					= null;
	String	regel_naam					= null;
	
	public String getGoederen_omschrijving() {
		return goederen_omschrijving;
	}
	public void setGoederen_omschrijving(String goederen_omschrijving) {
		this.goederen_omschrijving = goederen_omschrijving;
	}
	
	public String getLand_van_herkomst() {
		return land_van_herkomst;
	}
	public void setLand_van_herkomst(String land_van_herkomst) {
		this.land_van_herkomst = land_van_herkomst;
	}
	
	public int getFactuurwaarde() {
		return factuurwaarde;
	}
	public void setFactuurwaarde(int factuurwaarde) {
		this.factuurwaarde = factuurwaarde;
	}
	
	public int getPercentage_invoerrecht() {
		return percentage_invoerrecht;
	}
	public void setPercentage_invoerrecht(int percentage_invoerrecht) {
		this.percentage_invoerrecht = percentage_invoerrecht;
	}
	
	public int getBedrag_aan_invoerrecht() {
		return bedrag_aan_invoerrecht;
	}
	public void setBedrag_aan_invoerrecht(int bedrag_aan_invoerrecht) {
		this.bedrag_aan_invoerrecht = bedrag_aan_invoerrecht;
	}
	
	public String getCertificaat() {
		return certificaat;
	}
	public void setCertificaat(String certificaat) {
		this.certificaat = certificaat;
	}
	
	public String getRegel_naam() {
		return regel_naam;
	}
	public void setRegel_naam(String regel_naam) {
		this.regel_naam = regel_naam;
	}

}	// end class
