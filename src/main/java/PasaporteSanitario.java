package Aeropuerto;

public class PasaporteSanitario {

	private Date fechaPCR;
	private boolean resultadoPCR;

	public Date getFechaPCR() {
		return this.fechaPCR;
	}

	/**
	 * 
	 * @param fechaPCR
	 */
	public void setFechaPCR(Date fechaPCR) {
		this.fechaPCR = fechaPCR;
	}

	public boolean getResultadoPCR() {
		return this.resultadoPCR;
	}

	/**
	 * 
	 * @param resultadoPCR
	 */
	public void setResultadoPCR(boolean resultadoPCR) {
		this.resultadoPCR = resultadoPCR;
	}

}