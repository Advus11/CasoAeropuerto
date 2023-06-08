package Aeropuerto;

import java.util.*;

public class Vuelo {

	private Avion avion;
	private Piloto piloto;
	private Collection<Pasajero> pasajeros;
	private String ciudadOrigen;
	private String ciudadDestino;
	private Date fechaInicio;
	private Date fechaDestino;

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	/**
	 * 
	 * @param ciudadOrigen
	 */
	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	/**
	 * 
	 * @param ciudadDestino
	 */
	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaDestino() {
		return this.fechaDestino;
	}

	/**
	 * 
	 * @param fechaDestino
	 */
	public void setFechaDestino(Date fechaDestino) {
		this.fechaDestino = fechaDestino;
	}

}