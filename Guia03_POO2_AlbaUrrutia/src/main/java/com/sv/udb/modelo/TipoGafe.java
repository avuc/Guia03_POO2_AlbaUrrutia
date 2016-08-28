
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
@Table(name = "tipo_gafe", catalog = "rceron_poo", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGafe.findAll", query = "SELECT t FROM TipoGafe t"),
    @NamedQuery(name = "TipoGafe.findByCodiTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.codiTipoGafe = :codiTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByNombTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.nombTipoGafe = :nombTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByFechAlta", query = "SELECT t FROM TipoGafe t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoGafe.findByFechBaja", query = "SELECT t FROM TipoGafe t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoGafe.findByEsta", query = "SELECT t FROM TipoGafe t WHERE t.esta = :esta")})
public class TipoGafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codi_tipo_gafe")
    private Long codiTipoGafe;
    @Size(max = 200)
    @Column(name = "nomb_tipo_gafe")
    private String nombTipoGafe;
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
    public TipoGafe() {
    }
  /**
     * Método constructor
     * @param codiTipoGafe codigo del registro
     */
    public TipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
   /**
     * Método para obtener valor
     * @return Entero código del tipo gafe
     */
    public Long getCodiTipoGafe() {
        return codiTipoGafe;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param codiTipoGafe código tipo gafe
     */
    public void setCodiTipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
   /**
     * Método para obtener el nombre
     * @return String nombre del tipo gafe
     */
    public String getNombTipoGafe() {
        return nombTipoGafe;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param nombTipoGafe nombre tipo gafe
     */
    public void setNombTipoGafe(String nombTipoGafe) {
        this.nombTipoGafe = nombTipoGafe;
    }
   /**
     * Método para obtener la fecha alta
     * @return date la fecha alta del tipo gafe
     */
    public Date getFechAlta() {
        return fechAlta;
    }
/**
     * Es el método para fijar valor a una variable del objeto
     * @param fechAlta parametro de la fecha alta de tipo gafe
     */
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }
   /**
     * Método para obtener la fecha baja
     * @return date la fecha baja del tipo gafe
     */
    public Date getFechBaja() {
        return fechBaja;
    }

/**
     * Es el método para fijar valor a una variable del objeto
     * @param fechBaja parametro de la fecha baja de tipo gafe
     */
    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }
   /**
     * Método para obtener el estado
     * @return Integer estado del tipo gafe
     */
    public Integer getEsta() {
        return esta;
    }

/**
     * Es el método para fijar valor a una variable del objeto
     * @param esta parametro del estado de tipo gafe
     */
    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiTipoGafe != null ? codiTipoGafe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGafe)) {
            return false;
        }
        TipoGafe other = (TipoGafe) object;
        if ((this.codiTipoGafe == null && other.codiTipoGafe != null) || (this.codiTipoGafe != null && !this.codiTipoGafe.equals(other.codiTipoGafe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoGafe[ codiTipoGafe=" + codiTipoGafe + " ]";
    }
    
}
