package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the permission database table.
 * 
 */
@Entity
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PermissionPK id;

	private Timestamp whengiven;

	private Timestamp whenrevoked;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_idrole")
	private Role role1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_iduser")
	private User user1;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_idrole")
	private Role role2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="users_iduser")
	private User user2;

	public Permission() {
	}

	public PermissionPK getId() {
		return this.id;
	}

	public void setId(PermissionPK id) {
		this.id = id;
	}

	public Timestamp getWhengiven() {
		return this.whengiven;
	}

	public void setWhengiven(Timestamp whengiven) {
		this.whengiven = whengiven;
	}

	public Timestamp getWhenrevoked() {
		return this.whenrevoked;
	}

	public void setWhenrevoked(Timestamp whenrevoked) {
		this.whenrevoked = whenrevoked;
	}

	public Role getRole1() {
		return this.role1;
	}

	public void setRole1(Role role1) {
		this.role1 = role1;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public Role getRole2() {
		return this.role2;
	}

	public void setRole2(Role role2) {
		this.role2 = role2;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

}