package com.myspace.proyectogestioncredito.modelo.bo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ObjetoFecha implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "datetime")
	private java.lang.String datetime;
	@org.kie.api.definition.type.Label(value = "timezone")
	private java.lang.String timezone;
	@org.kie.api.definition.type.Label(value = "unixtime")
	private java.lang.String unixtime;

	public ObjetoFecha() {
	}

	public java.lang.String getDatetime() {
		return this.datetime;
	}

	public void setDatetime(java.lang.String datetime) {
		this.datetime = datetime;
	}

	public java.lang.String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(java.lang.String timezone) {
		this.timezone = timezone;
	}

	public java.lang.String getUnixtime() {
		return this.unixtime;
	}

	public void setUnixtime(java.lang.String unixtime) {
		this.unixtime = unixtime;
	}

	public ObjetoFecha(java.lang.String datetime, java.lang.String timezone,
			java.lang.String unixtime) {
		this.datetime = datetime;
		this.timezone = timezone;
		this.unixtime = unixtime;
	}

}