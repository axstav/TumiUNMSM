package com.tumi.dto;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Lob;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VisionPersonaQuec {
//@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
//private Integer id;
	
	private int grupoEdad;
	private String sexo;
	private String idioma;
	private String departamento;
	@Id
	private String provincia;
	private String distrito;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String file_vision;
	private String file_concepto;
	private String file_categoria;
 /*   @Lob
    private byte[] file_vision;
    
    @Lob
    private byte[] file_concepto;
    
    @Lob
    private byte[] file_categoria;
*/
	public VisionPersonaQuec() {
		super();
	}
/*
	public VisionPersonaQuec(int grupoEdad, String sexo, String idioma, String departamento, String provincia, String distrito,
			BigDecimal latitud, BigDecimal longitud, byte[] file_vision, byte[] file_concepto, byte[] file_categoria) {
		super();
		this.grupoEdad = grupoEdad;
		this.sexo = sexo;
		this.idioma = idioma;
		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
		this.latitud = latitud;
		this.longitud = longitud;
		this.file_vision = file_vision;
		this.file_concepto = file_concepto;
		this.file_categoria = file_categoria;
	}
*/

	public VisionPersonaQuec(int grupoEdad, String sexo, String idioma, String departamento, String provincia,
		String distrito, BigDecimal latitud, BigDecimal longitud, String file_vision, String file_concepto,
		String file_categoria) {
	super();
	this.grupoEdad = grupoEdad;
	this.sexo = sexo;
	this.idioma = idioma;
	this.departamento = departamento;
	this.provincia = provincia;
	this.distrito = distrito;
	this.latitud = latitud;
	this.longitud = longitud;
	this.file_vision = file_vision;
	this.file_concepto = file_concepto;
	this.file_categoria = file_categoria;
}
	
	public int getGrupoEdad() {
		return grupoEdad;
	}	
	public void setGrupoEdad(int grupoEdad) {
		this.grupoEdad = grupoEdad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public String getFile_vision() {
		return file_vision;
	}

	public void setFile_vision(String file_vision) {
		this.file_vision = file_vision;
	}

	public String getFile_concepto() {
		return file_concepto;
	}

	public void setFile_concepto(String file_concepto) {
		this.file_concepto = file_concepto;
	}

	public String getFile_categoria() {
		return file_categoria;
	}

	public void setFile_categoria(String file_categoria) {
		this.file_categoria = file_categoria;
	}

	@Override
	public String toString() {
		return "VisionPersonaQuec [grupoEdad=" + grupoEdad + ", sexo=" + sexo + ", idioma=" + idioma + ", departamento="
				+ departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", file_vision=" + file_vision + ", file_concepto=" + file_concepto
				+ ", file_categoria=" + file_categoria + "]";
	}
	
	
	
/*
	public byte[] getFile_vision() {
		return file_vision;
	}

	public void setFile_vision(byte[] file_vision) {
		this.file_vision = file_vision;
	}

	public byte[] getFile_concepto() {
		return file_concepto;
	}

	public void setFile_concepto(byte[] file_concepto) {
		this.file_concepto = file_concepto;
	}

	public byte[] getFile_categoria() {
		return file_categoria;
	}

	public void setFile_categoria(byte[] file_categoria) {
		this.file_categoria = file_categoria;
	}

	@Override
	public String toString() {
		return "VisionPersonaQuec [grupoEdad=" + grupoEdad + ", sexo=" + sexo + ", idioma=" + idioma + ", departamento="
				+ departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", file_vision=" + Arrays.toString(file_vision) + ", file_concepto="
				+ Arrays.toString(file_concepto) + ", file_categoria=" + Arrays.toString(file_categoria) + "]";
	}

*/
    

}
