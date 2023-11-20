package jsf.course.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the permission database table.
 * 
 */
@Entity
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpermission;

	private int whengiven;

	private int whenrevoked;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_iduser")
	private User user;

	public Permission() {
	}

	public int getIdpermission() {
		return this.idpermission;
	}

	public void setIdpermission(int idpermission) {
		this.idpermission = idpermission;
	}

	public int getWhengiven() {
		return this.whengiven;
	}

	public void setWhengiven(int whengiven) {
		this.whengiven = whengiven;
	}

	public int getWhenrevoked() {
		return this.whenrevoked;
	}

	public void setWhenrevoked(int whenrevoked) {
		this.whenrevoked = whenrevoked;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}