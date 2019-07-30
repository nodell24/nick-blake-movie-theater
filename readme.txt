Movie.java - Entity class for Movie's that contains the ID, name, type, duration
for any movie from the database.

Theater.java - Entity class for Theater's that contains the ID, name, zip
and address for any theater in the database.

Times.java - Entity class for the Time's that a movie can occur at, contains
the id and time of any time in the database.

Movie_Times.java - join table entity class that links the Movies's with their
respectives times contained in the database.

TheaterEJB.java - the enterprise java bean that manages the entities by querying the
database and returning necessary information for the web app to function.

TheaterBean.java - the session bean that holds entity information and client
data to be used in the web app, can be called by jsf to access the EJB for
database data. handles client requests.

Index.xhtml - homepage for the web app. allows user to enter zip code to
retrieve a list of theaters.

theaters.xhtml - screen that displays list of theaters base on the zip code
provided in the homepage

movies.xhtml - screen that provides a list of movies showing at the selected
theater.

times.xhtml - screen that displays a movie poster and times that the slected
movie is playing at.

tickets.xhtml - screen that asks how many tickets are needed for the slected movie
time.

purchase.xhtml - screen that asks for payment information to pay for the movie tickets
. also shows total cost of tickets.

purchased.xhtml - screen that show successful purchase and allows user to
return to the homepage.