package jsf.course.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rental database table.
 * 
 */
@Entity
@NamedQuery(name="Rental.findAll", query="SELECT r FROM Rental r")
public class Rental implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrental;

	private int cost;

	private int duration;

	private String isaccepted;

	private String issent;

	private Timestamp whenends;

	private Timestamp whenrented;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_iduser")
	private User user;

	//bi-directional many-to-one association to Rentalitem
	@OneToMany(mappedBy="rental")
	private List<Rentalitem> rentalitems;

	public Rental() {
	}

	public int getIdrental() {
		return this.idrental;
	}

	public void setIdrental(int idrental) {
		this.idrental = idrental;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getIsaccepted() {
		return this.isaccepted;
	}

	public void setIsaccepted(String isaccepted) {
		this.isaccepted = isaccepted;
	}

	public String getIssent() {
		return this.issent;
	}

	public void setIssent(String issent) {
		this.issent = issent;
	}

	public Timestamp getWhenends() {
		return this.whenends;
	}

	public void setWhenends(Timestamp whenends) {
		this.whenends = whenends;
	}

	public Timestamp getWhenrented() {
		return this.whenrented;
	}

	public void setWhenrented(Timestamp whenrented) {
		this.whenrented = whenrented;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Rentalitem> getRentalitems() {
		return this.rentalitems;
	}

	public void setRentalitems(List<Rentalitem> rentalitems) {
		this.rentalitems = rentalitems;
	}

	public Rentalitem addRentalitem(Rentalitem rentalitem) {
		getRentalitems().add(rentalitem);
		rentalitem.setRental(this);

		return rentalitem;
	}

	public Rentalitem removeRentalitem(Rentalitem rentalitem) {
		getRentalitems().remove(rentalitem);
		rentalitem.setRental(null);

		return rentalitem;
	}

}