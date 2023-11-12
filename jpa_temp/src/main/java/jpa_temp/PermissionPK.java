package jpa_temp;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the permission database table.
 * 
 */
@Embeddable
public class PermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idpermission;

	@Column(name="users_iduser", insertable=false, updatable=false)
	private int usersIduser;

	@Column(name="role_idrole", insertable=false, updatable=false)
	private int roleIdrole;

	public PermissionPK() {
	}
	public int getIdpermission() {
		return this.idpermission;
	}
	public void setIdpermission(int idpermission) {
		this.idpermission = idpermission;
	}
	public int getUsersIduser() {
		return this.usersIduser;
	}
	public void setUsersIduser(int usersIduser) {
		this.usersIduser = usersIduser;
	}
	public int getRoleIdrole() {
		return this.roleIdrole;
	}
	public void setRoleIdrole(int roleIdrole) {
		this.roleIdrole = roleIdrole;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PermissionPK)) {
			return false;
		}
		PermissionPK castOther = (PermissionPK)other;
		return 
			(this.idpermission == castOther.idpermission)
			&& (this.usersIduser == castOther.usersIduser)
			&& (this.roleIdrole == castOther.roleIdrole);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idpermission;
		hash = hash * prime + this.usersIduser;
		hash = hash * prime + this.roleIdrole;
		
		return hash;
	}
}