/**
 * @author Vanessa
 * @version 1.0 27 de Agosto de 2016
 */
package com.sv.udb.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "luga_acce", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LugaAcce.findAll", query = "SELECT l FROM LugaAcce l"),
    @NamedQuery(name = "LugaAcce.findByCodiLugaAcce", query = "SELECT l FROM LugaAcce l WHERE l.codiLugaAcce = :codiLugaAcce"),
    @NamedQuery(name = "LugaAcce.findByNombLugaAcce", query = "SELECT l FROM LugaAcce l WHERE l.nombLugaAcce = :nombLugaAcce"),
    @NamedQuery(name = "LugaAcce.findByFechAlta", query = "SELECT l FROM LugaAcce l WHERE l.fechAlta = :fechAlta"),
    @NamedQuery(name = "LugaAcce.findByFechBaja", query = "SELECT l FROM LugaAcce l WHERE l.fechBaja = :fechBaja"),
    @NamedQuery(name = "LugaAcce.findByEsta", query = "SELECT l FROM LugaAcce l WHERE l.esta = :esta")})
public class LugaAcce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_luga_acce")
    private Long codiLugaAcce;
    @Size(max = 100)
    @Column(name = "nomb_luga_acce")
    private String nombLugaAcce;
    @Column(name = "fech_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "fech_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "esta")
    private Integer esta;

    /**
     * Método constructor
     */
    public LugaAcce() {
    }
 /**
     * Método constructor
     * @param codiLugaAcce codigo del registro
     */
    public LugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }

   /**
     * Método para obtener valor
     * @return Entero código 
     */
    public Long getCodiLugaAcce() {
        return codiLugaAcce;
    }

/**
     * Es el método para fijar valor a una variable del objeto
     * @param codiLugaAcce código
     */
    public void setCodiLugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }
 /**
     * Método para obtener el nombre
     * @return String nombre del lugar
     */
    public String getNombLugaAcce() {
        return nombLugaAcce;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param nombLugaAcce nombre del lugar
     */
    public void setNombLugaAcce(String nombLugaAcce) {
        this.nombLugaAcce = nombLugaAcce;
    }

 /**
     * Método para obtener la fecha alta
     * @return date para a fecha alta
     */
    public Date getFechAlta() {
        return fechAlta;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param fechAlta 
     */
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

 /**
     * Método para obtener la fecha baja
     * @return date para a fecha baja
     */
    public Date getFechBaja() {
        return fechBaja;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param fechBaja la fecha baja
     */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

 /**
     * Método para obtener el estado
     * @return integer para el estado
     */
    public Integer getEsta() {
        return esta;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param esta estado
     */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiLugaAcce != null ? codiLugaAcce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LugaAcce)) {
            return false;
        }
        LugaAcce other = (LugaAcce) object;
        if ((this.codiLugaAcce == null && other.codiLugaAcce != null) || (this.codiLugaAcce != null && !this.codiLugaAcce.equals(other.codiLugaAcce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.LugaAcce[ codiLugaAcce=" + codiLugaAcce + " ]";
    }
    
}
