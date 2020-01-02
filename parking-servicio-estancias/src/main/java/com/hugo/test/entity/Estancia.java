package com.hugo.test.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estancia")
public class Estancia implements Serializable {

	public Estancia(Date fechaEntrada, Date fechaSalida, String vehiculo, String tipovehiculo, Double precioMin, Double precioTotal,
			long difHoras, long difMin) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.vehiculo = vehiculo;
		this.tipovehiculo=tipovehiculo;
		this.precioMin = precioMin;
		this.precioTotal = precioTotal;
		this.difHoras = difHoras;
		this.difMin = difMin;
	}

	public Estancia() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEntrada;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaSalida;
	private String vehiculo;
	private String tipovehiculo;
	public String getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	private Double precioMin;
	private Double precioTotal;
	private long difHoras;
	private long difMin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Double getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(Double precioMin) {
		this.precioMin = precioMin;
	}

	public Double getPrecioTotal() {

		difHoras = getFechaSalida().getTime() - getFechaEntrada().getTime();
		difMin = TimeUnit.MILLISECONDS.toMinutes(difHoras);
		precioTotal = getPrecioMin() * difMin;
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}



	public long getDifHoras() {
		return difHoras;
	}

	public void setDifHoras(long difHoras) {
		this.difHoras = difHoras;
	}

	public long getDifMin() {
		return difMin;
	}

	public void setDifMin(long difMin) {
		this.difMin = difMin;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
