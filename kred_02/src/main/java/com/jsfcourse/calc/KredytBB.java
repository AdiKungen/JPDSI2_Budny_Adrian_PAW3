package com.jsfcourse.calc;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class KredytBB {
	private String kwo;
	private String lat;
	private String opr;
	private Double rata;
	
	@Inject
	FacesContext ctx;

	
	public String getKwo() {
		return kwo;
	}

	public void setKwo(String kwo) {
		this.kwo = kwo;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}

	public Double getRata() {
		return rata;
	}

	public boolean doTheMath() {
		try {
			double kwo = Double.parseDouble(this.kwo);
			double lat = Double.parseDouble(this.lat);
			double opr = Double.parseDouble(this.opr);
			
			rata = (kwo*(opr*0.01)+kwo)/(lat*12);
			
			rata = Math.round(rata*100.0)/100.0;

			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacja wykonana poprawnie", null));
			return true;
		} catch (Exception e) {
			ctx.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Błąd podczas przetwarzania parametrów", null));
			return false;
		}
	}
	

	public String oblicz() {
		if (doTheMath()) {
			return "showresult";
		}
		return null;
	}
	
	public String oblicz_AJAX() {
		if (doTheMath()) {
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rata miesięczna: " + rata, null));
		}
		return null;
	}

}
