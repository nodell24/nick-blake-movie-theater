/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
@ManagedBean(name = "tBean", eager = true)
@SessionScoped
public class theaterBean implements Serializable{
    
    private ArrayList<Theater> theaterList;
    private String name;
    private String address;
    @PersistenceContext(unitName = "theaterPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    private int zip;
    
    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }
    
    public void printT(){
        System.out.println(this.id);
    }
    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }
   
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of theaterList
     *
     * @return the value of theaterList
     */
    public Collection<Theater> getTheaterList() {
        Query query = em.createQuery("SELECT t FROM Theater t", Theater.class);
        return (Collection<Theater>) query.getResultList();
    }

    /**
     * Set the value of theaterList
     *
     * @param theaterList new value of theaterList
     */
    public void setTheaterList(ArrayList<Theater> theaterList) {
        this.theaterList = theaterList;
    }

    /**
     * Get the value of zip
     *
     * @return the value of zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * Set the value of zip
     *
     * @param zip new value of zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }


}