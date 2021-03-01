package fr.eql.ai108.projet3.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_utilisateur")
public class TypeUtilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String autorisation;
	
	public TypeUtilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TypeUtilisateur(Integer id, String autorisation) {
		super();
		this.id = id;
		this.autorisation = autorisation;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAutorisation() {
		return autorisation;
	}
	public void setAutorisation(String autorisation) {
		this.autorisation = autorisation;
	}

	
}
