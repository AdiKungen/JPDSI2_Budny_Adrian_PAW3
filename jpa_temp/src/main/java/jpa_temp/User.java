package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iduser;

	private String login;

	private String password;

	private Timestamp whencreated;

	private Timestamp whenlastmodified;

	//bi-directional many-to-one association to Permission
	@OneToMany(mappedBy="user1")
	private List<Permission> permissions1;

	//bi-directional many-to-one association to Permission
	@OneToMany(mappedBy="user2")
	private List<Permission> permissions2;

	//bi-directional many-to-one association to Rental
	@OneToMany(mappedBy="user")
	private List<Rental> rentals;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="whocreated")
	private User user1;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user1")
	private List<User> users1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="wholastmodified")
	private User user2;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user2")
	private List<User> users2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="whocreated")
	private User user3;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user3")
	private List<User> users3;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="wholastmodified")
	private User user4;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="user4")
	private List<User> users4;

	public User() {
	}

	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getWhencreated() {
		return this.whencreated;
	}

	public void setWhencreated(Timestamp whencreated) {
		this.whencreated = whencreated;
	}

	public Timestamp getWhenlastmodified() {
		return this.whenlastmodified;
	}

	public void setWhenlastmodified(Timestamp whenlastmodified) {
		this.whenlastmodified = whenlastmodified;
	}

	public List<Permission> getPermissions1() {
		return this.permissions1;
	}

	public void setPermissions1(List<Permission> permissions1) {
		this.permissions1 = permissions1;
	}

	public Permission addPermissions1(Permission permissions1) {
		getPermissions1().add(permissions1);
		permissions1.setUser1(this);

		return permissions1;
	}

	public Permission removePermissions1(Permission permissions1) {
		getPermissions1().remove(permissions1);
		permissions1.setUser1(null);

		return permissions1;
	}

	public List<Permission> getPermissions2() {
		return this.permissions2;
	}

	public void setPermissions2(List<Permission> permissions2) {
		this.permissions2 = permissions2;
	}

	public Permission addPermissions2(Permission permissions2) {
		getPermissions2().add(permissions2);
		permissions2.setUser2(this);

		return permissions2;
	}

	public Permission removePermissions2(Permission permissions2) {
		getPermissions2().remove(permissions2);
		permissions2.setUser2(null);

		return permissions2;
	}

	public List<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public Rental addRental(Rental rental) {
		getRentals().add(rental);
		rental.setUser(this);

		return rental;
	}

	public Rental removeRental(Rental rental) {
		getRentals().remove(rental);
		rental.setUser(null);

		return rental;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public List<User> getUsers1() {
		return this.users1;
	}

	public void setUsers1(List<User> users1) {
		this.users1 = users1;
	}

	public User addUsers1(User users1) {
		getUsers1().add(users1);
		users1.setUser1(this);

		return users1;
	}

	public User removeUsers1(User users1) {
		getUsers1().remove(users1);
		users1.setUser1(null);

		return users1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public List<User> getUsers2() {
		return this.users2;
	}

	public void setUsers2(List<User> users2) {
		this.users2 = users2;
	}

	public User addUsers2(User users2) {
		getUsers2().add(users2);
		users2.setUser2(this);

		return users2;
	}

	public User removeUsers2(User users2) {
		getUsers2().remove(users2);
		users2.setUser2(null);

		return users2;
	}

	public User getUser3() {
		return this.user3;
	}

	public void setUser3(User user3) {
		this.user3 = user3;
	}

	public List<User> getUsers3() {
		return this.users3;
	}

	public void setUsers3(List<User> users3) {
		this.users3 = users3;
	}

	public User addUsers3(User users3) {
		getUsers3().add(users3);
		users3.setUser3(this);

		return users3;
	}

	public User removeUsers3(User users3) {
		getUsers3().remove(users3);
		users3.setUser3(null);

		return users3;
	}

	public User getUser4() {
		return this.user4;
	}

	public void setUser4(User user4) {
		this.user4 = user4;
	}

	public List<User> getUsers4() {
		return this.users4;
	}

	public void setUsers4(List<User> users4) {
		this.users4 = users4;
	}

	public User addUsers4(User users4) {
		getUsers4().add(users4);
		users4.setUser4(this);

		return users4;
	}

	public User removeUsers4(User users4) {
		getUsers4().remove(users4);
		users4.setUser4(null);

		return users4;
	}

}