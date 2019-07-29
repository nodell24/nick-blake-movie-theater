/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BLAKE
 */
@Entity
@Table(name = "THEATER")
@XmlRootElement
@NamedQueries({
@NamedQuery(name = "Theater.findByZipcode", query = "SELECT t FROM Theater t WHERE t.theaterZip = :theaterZip")
})
public class Theater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name="THEATER_ID")
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

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
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
        return "entity.Theater[ id=" + theaterId + " ]";
    }
    
}
