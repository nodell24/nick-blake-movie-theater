/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BLAKE
 */

@Entity
@Table(name = "TIMES")
@XmlRootElement
public class Times implements Serializable {

     private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIME_ID")
    private Integer timeId;
    @Size(max = 8)
    @Column(name = "TIME_TIME")
    private String timeTime;

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public String getTimeTime() {
        return timeTime;
    }

    public void setTimeTime(String timeTime) {
        this.timeTime = timeTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeId != null ? timeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Times)) {
            return false;
        }
        Times other = (Times) object;
        if ((this.timeId == null && other.timeId != null) || (this.timeId != null && !this.timeId.equals(other.timeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Times[ id=" + timeId + " ]";
    }
    
}
