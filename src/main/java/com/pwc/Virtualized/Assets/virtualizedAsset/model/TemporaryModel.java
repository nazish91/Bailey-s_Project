
package com.pwc.Virtualized.Assets.virtualizedAsset.model;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.google.gson.JsonObject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sap_json")
public class TemporaryModel {

	private static final long serialVersionUID = 1L;

	public TemporaryModel() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@Column(name = "sapxml")
	@NotBlank
	@Column(name = "sapxml", columnDefinition = "json")
	@JsonRawValue
	private String  sapxml;

	@Column(name = "documentid" , unique=true)
	@NotBlank
	private String documentid;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getSapxml() {
		return sapxml;
	}

	public void setSapxml(String sapxml) {
		this.sapxml = sapxml;
	}

	public String getDocumentid() {
		return documentid;
	}

	public void setDocumentid(String documentid) {
		this.documentid = documentid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sapxml);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemporaryModel other = (TemporaryModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(sapxml, other.sapxml);
	}

	@Override
	public String toString() {
		return "TemporaryModel [id=" + id + ", sapxml=" + sapxml + ", getId()=" + getId() + ", getSapxml()="
				+ getSapxml() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
