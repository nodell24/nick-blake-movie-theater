/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Theater;
import entity.Movie;
import entity.Times;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BLAKE
 */
@Stateless
public class TheaterEJB {
    @PersistenceContext(unitName = "theaterPU")
    private EntityManager em;
    
    public List<Theater> findTheaters(String theaterZip)
    {
        return em.createNamedQuery("Theater.findByZipcode", Theater.class).setParameter("theaterZip", theaterZip).getResultList(); 
    }
    
    public List<Times> findTimes(int id)
    {
        return em.createNamedQuery("Movie.getTimes", Times.class).setParameter("movieId", id).getResultList(); 
    }
    
    public List<Movie> findMovies(){
        return em.createNamedQuery("Movie.findAll", Movie.class).getResultList();
    }
}
