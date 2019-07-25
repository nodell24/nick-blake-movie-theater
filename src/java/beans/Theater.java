/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nick
 */
@Entity
@Table(name = "THEATER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Theater.findAll", query = "SELECT t FROM Theater t"),
    @NamedQuery(name = "Theater.findByTheaterId", query = "SELECT t FROM Theater t WHERE t.theaterId = :theaterId"),
    @NamedQuery(name = "Theater.findByTheaterName", query = "SELECT t FROM Theater t WHERE t.theaterName = :theaterName"),
    @NamedQuery(name = "Theater.findByTheaterAddress", query = "SELECT t FROM Theater t WHERE t.theaterAddress = :theaterAddress"),
    @NamedQuery(name = "Theater.findByTheaterZip", query = "SELECT t FROM Theater t WHERE t.theaterZip = :theaterZip")})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "THEATER_ID")
    private Integer theaterId;
    @Size(max = 64)
    @Column(name = "THEATER_NAME")
    private String theaterName;
    @Size(max = 64)
    @Column(name = "THEATER_ADDRESS")
    private String theaterAddress;
    @Size(max = 5)
    @Column(name = "THEATER_ZIP")
    private String theaterZip;

    public Theater() {
    }

    public Theater(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterAddress() {
        return theaterAddress;
    }

    public void setTheaterAddress(String theaterAddress) {
        this.theaterAddress = theaterAddress;
    }

    public String getTheaterZip() {
        return theaterZip;
    }

    public void setTheaterZip(String theaterZip) {
        this.theaterZip = theaterZip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterId != null ? theaterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if ((this.theaterId == null && other.theaterId != null) || (this.theaterId != null && !this.theaterId.equals(other.theaterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Theater[ theaterId=" + theaterId + " ]";
    }
    
}
