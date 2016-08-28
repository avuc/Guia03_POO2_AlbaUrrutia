
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

/**
 * @author Vanessa
 * @version 1.0 27 de Agosto de 2016
 */
@Entity
@Table(name = "tipo_docu", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocu.findAll", query = "SELECT t FROM TipoDocu t"),
    @NamedQuery(name = "TipoDocu.findByCodiTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.codiTipoDocu = :codiTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByNombTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.nombTipoDocu = :nombTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByFechAlta", query = "SELECT t FROM TipoDocu t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoDocu.findByFechBaja", query = "SELECT t FROM TipoDocu t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoDocu.findByEsta", query = "SELECT t FROM TipoDocu t WHERE t.esta = :esta")})
public class TipoDocu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_docu")
    private Long codiTipoDocu;
    @Size(max = 50)
    @Column(name = "nomb_tipo_docu")
    private String nombTipoDocu;
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
    public TipoDocu() {
    }
/**
     * Método constructor
     * @param codiTipoDocu codigo del registro
     */
    public TipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }
   /**
     * Método para obtener valor
     * @return Entero código 
     */
    public Long getCodiTipoDocu() {
        return codiTipoDocu;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param codiTipoDocu código
     */
    public void setCodiTipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }

 /**
     * Método para obtener el nombre
     * @return String nombre del documennto
     */
    public String getNombTipoDocu() {
        return nombTipoDocu;
    }

/**
     * Es el método para fijar valor a una variable del objeto
     * @param nombTipoDocu nombre del tipo documento
     */
    public void setNombTipoDocu(String nombTipoDocu) {
        this.nombTipoDocu = nombTipoDocu;
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
        hash += (codiTipoDocu != null ? codiTipoDocu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocu)) {
            return false;
        }
        TipoDocu other = (TipoDocu) object;
        if ((this.codiTipoDocu == null && other.codiTipoDocu != null) || (this.codiTipoDocu != null && !this.codiTipoDocu.equals(other.codiTipoDocu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoDocu[ codiTipoDocu=" + codiTipoDocu + " ]";
    }
    
}
