package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the rentalitem database table.
 * 
 */
@Embeddable
public class RentalitemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idrentalitem;

	@Column(name="rental_idrental", insertable=false, updatable=false)
	private int rentalIdrental;

	@Column(name="book_idbook", insertable=false, updatable=false)
	private int bookIdbook;

	public RentalitemPK() {
	}
	public int getIdrentalitem() {
		return this.idrentalitem;
	}
	public void setIdrentalitem(int idrentalitem) {
		this.idrentalitem = idrentalitem;
	}
	public int getRentalIdrental() {
		return this.rentalIdrental;
	}
	public void setRentalIdrental(int rentalIdrental) {
		this.rentalIdrental = rentalIdrental;
	}
	public int getBookIdbook() {
		return this.bookIdbook;
	}
	public void setBookIdbook(int bookIdbook) {
		this.bookIdbook = bookIdbook;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RentalitemPK)) {
			return false;
		}
		RentalitemPK castOther = (RentalitemPK)other;
		return 
			(this.idrentalitem == castOther.idrentalitem)
			&& (this.rentalIdrental == castOther.rentalIdrental)
			&& (this.bookIdbook == castOther.bookIdbook);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idrentalitem;
		hash = hash * prime + this.rentalIdrental;
		hash = hash * prime + this.bookIdbook;
		
		return hash;
	}
}