package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrole;

	private String isactive;

	private String name;

	private Timestamp whencreated;

	private Timestamp whendisabled;

	//bi-directional many-to-one association to Permission
	@OneToMany(mappedBy="role1")
	private List<Permission> permissions1;

	//bi-directional many-to-one association to Permission
	@OneToMany(mappedBy="role2")
	private List<Permission> permissions2;

	public Role() {
	}

	public int getIdrole() {
		return this.idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getWhencreated() {
		return this.whencreated;
	}

	public void setWhencreated(Timestamp whencreated) {
		this.whencreated = whencreated;
	}

	public Timestamp getWhendisabled() {
		return this.whendisabled;
	}

	public void setWhendisabled(Timestamp whendisabled) {
		this.whendisabled = whendisabled;
	}

	public List<Permission> getPermissions1() {
		return this.permissions1;
	}

	public void setPermissions1(List<Permission> permissions1) {
		this.permissions1 = permissions1;
	}

	public Permission addPermissions1(Permission permissions1) {
		getPermissions1().add(permissions1);
		permissions1.setRole1(this);

		return permissions1;
	}

	public Permission removePermissions1(Permission permissions1) {
		getPermissions1().remove(permissions1);
		permissions1.setRole1(null);

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
		permissions2.setRole2(this);

		return permissions2;
	}

	public Permission removePermissions2(Permission permissions2) {
		getPermissions2().remove(permissions2);
		permissions2.setRole2(null);

		return permissions2;
	}

}