package com.chompySoft.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Rol implements Serializable{

	private static final long serialVersionUID = 5723942505528526265L;
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id_rol;
	
	@Column
	private String rolNomb;
	
	@Column
	private String rolDesc;

	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}

	public String getRolNomb() {
		return rolNomb;
	}

	public void setRolNomb(String rolNomb) {
		this.rolNomb = rolNomb;
	}

	public String getRolDesc() {
		return rolDesc;
	}

	public void setRolDesc(String rolDesc) {
		this.rolDesc = rolDesc;
	}

	@Override
	public String toString() {
		return "Rol [id_rol=" + id_rol + ", rolNomb=" + rolNomb + ", rolDesc=" + rolDesc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_rol == null) ? 0 : id_rol.hashCode());
		result = prime * result + ((rolDesc == null) ? 0 : rolDesc.hashCode());
		result = prime * result + ((rolNomb == null) ? 0 : rolNomb.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rol other = (Rol) obj;
		if (id_rol == null) {
			if (other.id_rol != null)
				return false;
		} else if (!id_rol.equals(other.id_rol))
			return false;
		if (rolDesc == null) {
			if (other.rolDesc != null)
				return false;
		} else if (!rolDesc.equals(other.rolDesc))
			return false;
		if (rolNomb == null) {
			if (other.rolNomb != null)
				return false;
		} else if (!rolNomb.equals(other.rolNomb))
			return false;
		return true;
	}
	       	
	

}
