package com.unam.subneteo;

public class ItemListIP {

	String nombre, firsHost, lastHost, broadcast, tipo;

	public ItemListIP(String nombre, String firsHost, String lastHost,
			String broadcast, String tipo) {
		super();
		this.nombre = nombre;
		this.firsHost = firsHost;
		this.lastHost = lastHost;
		this.broadcast = broadcast;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFirsHost() {
		return firsHost;
	}

	public void setFirsHost(String firsHost) {
		this.firsHost = firsHost;
	}

	public String getLastHost() {
		return lastHost;
	}

	public void setLastHost(String lastHost) {
		this.lastHost = lastHost;
	}

	public String getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(String broadcast) {
		this.broadcast = broadcast;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
