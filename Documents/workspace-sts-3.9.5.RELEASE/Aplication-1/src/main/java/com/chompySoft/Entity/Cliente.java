package com.chompySoft.Entity;


import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 5738371535644341097L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id_cliente;
	
	@Column
	private String clieNomb;
	@Column
	private Integer clieDni;
	@Column
	private Integer clieTel;
	@Column
	private String clieDomi;
	@Column
	private Date clieFNac;
	@Column
	private Date clieFIng;
	@Column
	private Float clieMont;
	@Column
	private Integer id_sexo;
	@Column
	private Integer clieEstado;
	@Column
	private Integer id_localidad;
	@Column
	private String clieApel;
	@Column
	private String clieEmail;
	@Column
	private String cliePass;
	@Column
	private String clieFace;
	@Column
	private String clieTwit;
	@Column
	private String clieYout;
	@Column
	private String clieFoto;
	
	@Transient 
	private String confirmPass;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="cliente_roles"
		,joinColumns=@JoinColumn(name="id_cliente")
		,inverseJoinColumns=@JoinColumn(name="id_rol"))
	private Set<Rol> roles;

	public Cliente(Long id_cliente) {
		super();
		this.id_cliente = id_cliente;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getClieNomb() {
		return clieNomb;
	}

	public void setClieNomb(String clieNomb) {
		this.clieNomb = clieNomb;
	}

	public Integer getClieDni() {
		return clieDni;
	}

	public void setClieDni(Integer clieDni) {
		this.clieDni = clieDni;
	}

	public Integer getClieTel() {
		return clieTel;
	}

	public void setClieTel(Integer clieTel) {
		this.clieTel = clieTel;
	}

	public String getClieDomi() {
		return clieDomi;
	}

	public void setClieDomi(String clieDomi) {
		this.clieDomi = clieDomi;
	}

	public Date getClieFNac() {
		return clieFNac;
	}

	public void setClieFNac(Date clieFNac) {
		this.clieFNac = clieFNac;
	}

	public Date getClieFIng() {
		return clieFIng;
	}

	public void setClieFIng(Date clieFIng) {
		this.clieFIng = clieFIng;
	}

	public Float getClieMont() {
		return clieMont;
	}

	public void setClieMont(Float clieMont) {
		this.clieMont = clieMont;
	}

	public Integer getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(Integer id_sexo) {
		this.id_sexo = id_sexo;
	}

	public Integer getClieEstado() {
		return clieEstado;
	}

	public void setClieEstado(Integer clieEstado) {
		this.clieEstado = clieEstado;
	}

	public Integer getId_localidad() {
		return id_localidad;
	}

	public void setId_localidad(Integer id_localidad) {
		this.id_localidad = id_localidad;
	}

	public String getClieApel() {
		return clieApel;
	}

	public void setClieApel(String clieApel) {
		this.clieApel = clieApel;
	}

	public String getClieEmail() {
		return clieEmail;
	}

	public void setClieEmail(String clieEmail) {
		this.clieEmail = clieEmail;
	}

	public String getCliePass() {
		return cliePass;
	}

	public void setCliePass(String cliePass) {
		this.cliePass = cliePass;
	}

	public String getClieFace() {
		return clieFace;
	}

	public void setClieFace(String clieFace) {
		this.clieFace = clieFace;
	}

	public String getClieTwit() {
		return clieTwit;
	}

	public void setClieTwit(String clieTwit) {
		this.clieTwit = clieTwit;
	}

	public String getClieYout() {
		return clieYout;
	}

	public void setClieYout(String clieYout) {
		this.clieYout = clieYout;
	}

	public String getClieFoto() {
		return clieFoto;
	}

	public void setClieFoto(String clieFoto) {
		this.clieFoto = clieFoto;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", clieNomb=" + clieNomb + ", clieDni=" + clieDni + ", clieTel="
				+ clieTel + ", clieDomi=" + clieDomi + ", clieFNac=" + clieFNac + ", clieFIng=" + clieFIng
				+ ", clieMont=" + clieMont + ", id_sexo=" + id_sexo + ", clieEstado=" + clieEstado + ", id_localidad="
				+ id_localidad + ", clieApel=" + clieApel + ", clieEmail=" + clieEmail + ", cliePass=" + cliePass
				+ ", clieFace=" + clieFace + ", clieTwit=" + clieTwit + ", clieYout=" + clieYout + ", clieFoto="
				+ clieFoto + ", confirmPass=" + confirmPass + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clieApel == null) ? 0 : clieApel.hashCode());
		result = prime * result + ((clieDni == null) ? 0 : clieDni.hashCode());
		result = prime * result + ((clieDomi == null) ? 0 : clieDomi.hashCode());
		result = prime * result + ((clieEmail == null) ? 0 : clieEmail.hashCode());
		result = prime * result + ((clieEstado == null) ? 0 : clieEstado.hashCode());
		result = prime * result + ((clieFIng == null) ? 0 : clieFIng.hashCode());
		result = prime * result + ((clieFNac == null) ? 0 : clieFNac.hashCode());
		result = prime * result + ((clieFace == null) ? 0 : clieFace.hashCode());
		result = prime * result + ((clieFoto == null) ? 0 : clieFoto.hashCode());
		result = prime * result + ((clieMont == null) ? 0 : clieMont.hashCode());
		result = prime * result + ((clieNomb == null) ? 0 : clieNomb.hashCode());
		result = prime * result + ((cliePass == null) ? 0 : cliePass.hashCode());
		result = prime * result + ((clieTel == null) ? 0 : clieTel.hashCode());
		result = prime * result + ((clieTwit == null) ? 0 : clieTwit.hashCode());
		result = prime * result + ((clieYout == null) ? 0 : clieYout.hashCode());
		result = prime * result + ((confirmPass == null) ? 0 : confirmPass.hashCode());
		result = prime * result + ((id_cliente == null) ? 0 : id_cliente.hashCode());
		result = prime * result + ((id_localidad == null) ? 0 : id_localidad.hashCode());
		result = prime * result + ((id_sexo == null) ? 0 : id_sexo.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		Cliente other = (Cliente) obj;
		if (clieApel == null) {
			if (other.clieApel != null)
				return false;
		} else if (!clieApel.equals(other.clieApel))
			return false;
		if (clieDni == null) {
			if (other.clieDni != null)
				return false;
		} else if (!clieDni.equals(other.clieDni))
			return false;
		if (clieDomi == null) {
			if (other.clieDomi != null)
				return false;
		} else if (!clieDomi.equals(other.clieDomi))
			return false;
		if (clieEmail == null) {
			if (other.clieEmail != null)
				return false;
		} else if (!clieEmail.equals(other.clieEmail))
			return false;
		if (clieEstado == null) {
			if (other.clieEstado != null)
				return false;
		} else if (!clieEstado.equals(other.clieEstado))
			return false;
		if (clieFIng == null) {
			if (other.clieFIng != null)
				return false;
		} else if (!clieFIng.equals(other.clieFIng))
			return false;
		if (clieFNac == null) {
			if (other.clieFNac != null)
				return false;
		} else if (!clieFNac.equals(other.clieFNac))
			return false;
		if (clieFace == null) {
			if (other.clieFace != null)
				return false;
		} else if (!clieFace.equals(other.clieFace))
			return false;
		if (clieFoto == null) {
			if (other.clieFoto != null)
				return false;
		} else if (!clieFoto.equals(other.clieFoto))
			return false;
		if (clieMont == null) {
			if (other.clieMont != null)
				return false;
		} else if (!clieMont.equals(other.clieMont))
			return false;
		if (clieNomb == null) {
			if (other.clieNomb != null)
				return false;
		} else if (!clieNomb.equals(other.clieNomb))
			return false;
		if (cliePass == null) {
			if (other.cliePass != null)
				return false;
		} else if (!cliePass.equals(other.cliePass))
			return false;
		if (clieTel == null) {
			if (other.clieTel != null)
				return false;
		} else if (!clieTel.equals(other.clieTel))
			return false;
		if (clieTwit == null) {
			if (other.clieTwit != null)
				return false;
		} else if (!clieTwit.equals(other.clieTwit))
			return false;
		if (clieYout == null) {
			if (other.clieYout != null)
				return false;
		} else if (!clieYout.equals(other.clieYout))
			return false;
		if (confirmPass == null) {
			if (other.confirmPass != null)
				return false;
		} else if (!confirmPass.equals(other.confirmPass))
			return false;
		if (id_cliente == null) {
			if (other.id_cliente != null)
				return false;
		} else if (!id_cliente.equals(other.id_cliente))
			return false;
		if (id_localidad == null) {
			if (other.id_localidad != null)
				return false;
		} else if (!id_localidad.equals(other.id_localidad))
			return false;
		if (id_sexo == null) {
			if (other.id_sexo != null)
				return false;
		} else if (!id_sexo.equals(other.id_sexo))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		return true;
	}
	
	
}
