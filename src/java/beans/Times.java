/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nick
 */
@Entity
@Table(name = "TIMES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Times.findAll", query = "SELECT t FROM Times t"),
    @NamedQuery(name = "Times.findByTimeId", query = "SELECT t FROM Times t WHERE t.timeId = :timeId"),
    @NamedQuery(name = "Times.findByTimeTime", query = "SELECT t FROM Times t WHERE t.timeTime = :timeTime")})
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
    @JoinTable(name = "MOVIE_TIMES", joinColumns = {
        @JoinColumn(name = "TIME_ID", referencedColumnName = "TIME_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "MOVIE_ID", referencedColumnName = "MOVIE_ID")})
    @ManyToMany
    private Collection<Movie> movieCollection;

    public Times() {
    }

    public Times(Integer timeId) {
        this.timeId = timeId;
    }

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

    @XmlTransient
    public Collection<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(Collection<Movie> movieCollection) {
        this.movieCollection = movieCollection;
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
        return "beans.Times[ timeId=" + timeId + " ]";
    }
    
}
