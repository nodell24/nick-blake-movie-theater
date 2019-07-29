/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.TheaterEJB;
import entity.Movie;
import entity.Theater;
import entity.Times;
import java.io.Serializable;

import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


/**
 *
 * @author BLAKE
 */
@Named(value = "tBean")
@SessionScoped
public class TheaterBean implements Serializable{
    @EJB
    private TheaterEJB theaterEJB;
    int zip;
    Theater theater;
    Movie movie;
    int tickets;
    int cost = 10;
    String card;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
    
    public int cost(){
        return cost*tickets;
    }
    
    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Times getTimes() {
        return times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }
    Times times;

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public List<Movie> getMovies(){
       return theaterEJB.findMovies();
    }
    
    public List<Theater> getTheaterList() {
        return theaterEJB.findTheaters(Integer.toString(zip));
    }
    
    public List<Times> getTimeList() {
        return theaterEJB.findTimes(movie.getMovieId());
    }
    
    public String goTheater(){
        if(Integer.toString(zip).length() == 5) return "theaters.xhtml";
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
            FacesMessage.SEVERITY_ERROR, "Zip entered not 5 digits.", null));
            return null;
        }
    }
    
    public String goTimes(Movie movie){
        this.movie = movie;
        return "times.xhtml";
    }
    
    public String goMovies(Theater theater){
        this.theater = theater;
        return "movies.xhtml";
    }
    
    public String goTickets(Times times){
        this.times = times;
        return "tickets.xhtml";
    }
    
    public String purchase(){
        if(card.length() == 16) return "purchased.xhtml";
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
            FacesMessage.SEVERITY_ERROR, "Invalid Card.", null));
            return null;
        }
    }
   
}
