import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

// class BookYourShow {
// 	List<Show>showDeatils;
// 	List<String>bookedTickets;
// 	public BookYourShow() {
// 		showDeatils = new List<Show>();
// 		bookedTickets = new List<String>();
// 	}

// 	public void addAShow(Show obj) {
// 		showDeatils.add(obj);
// 	}

// 	public Show getAShow(String movieName, String dateTime) {
// 		for(int i = 0; i < showDeatils.size(); i++) {
// 			if(showDeatils.get(i).getMovieName().equals(movieName) &&
// 				showDeatils.get(i).getDateTime().equals(dateTime)) {
// 				return showDeatils.get(i);
// 			}
// 		}
// 		return null;
// 	}

// 	public void bookAShow(String movieName, String dateTime, Patron obj, String[] seats) {
// 		Show movieData = getAShow(movieName, dateTime);
// 		if(movieData != null) {
// 			for(int i = 0; i < movieData.getSeats().length; i++) {
// 				for(int j = 0; j < seats.length; j++) {
// 					if(seats[j].equals(movieData.getSeats()[i])) {
// 						movieData.setSeat(i, "N/A");
// 						bookedTickets.add(obj.getMobileNumber()+""+movieName+dateTime);
// 					}
// 				}
// 			}
// 		}
// 	}
// 	public void printTicket(String movieName, String dateTime, String mobileNumber) {
// 		for(int i = 0; i < bookedTickets.size(); i++) {
// 			if(mobileNumber+""+movieName+""+dateTime.equals(bookedTickets.get(i))) {
// 				System.out.println(mobileNumber+""+movieName+""+dateTime);
// 			}
// 		}
// 		System.out.println("No tickets booked");
// 	}

// 	public void showAll() {
// 		for(int i = 0; i < showDeatils.size(); i++) {
// 			System.out.println(showDeatils.get(i));
// 		}	
// 	}
// }

/**
 * Class for book your show.
 */
class BookYourShow {
    /**
     * creating variable type object.
     */
    private List<Show> showDetails;
    /**
     * creating variable type object.
     */
    private List<String> bookedTickets;
    /**
     * Constructs the object.
     */
    BookYourShow() {
        /**
         *creating variable type object.
         */
        showDetails = new List<Show>();
        /**
         *creating variable type object.
         */
        bookedTickets = new List<String>();
    }
    /**
     * Adds a show.
     *
     * @param obj   The object
     */
    public void addAShow(final Show obj) {
        showDetails.add(obj);

    }
    /**
     * Users should be able to ​getAShow() by
     * specifying the movie name ​,date and time.
     * This method should return all the
     * shows that matches the given details.
     * @param      movie  The movie
     * @param      time   The time
     * @return     A show.
     */
    public Show getAShow(final String movie, final String time) {
        for (int i = 0; i < showDetails.size(); i++) {
            if (showDetails.get(i).getMovieName().equals(movie)
                && showDetails.get(i).getDateTime().equals(time)) {
                return showDetails.get(i);
            }
        }
        return null;
    }
    /**
     * Users should be able to bookAShow() by
     * specifying his name,movie name, Mobile
     * Number, Date-Time and Seat numbers. If the
     * seats are not available then the booking
     *  should not be possible.
     * @param      movie  The movie
     * @param      time   The time
     * @param      obj    The object
     * @param      seats  The seats
     *
     */
    public void bookAShow(final String movie, final String
     time, final Patron obj, final String[] seats) {
        Show movieData = getAShow(movie, time);
        if (movieData != null) {
            for (int i = 0; i < movieData.getSeats().length; i++) {
                for (int j = 0; j < seats.length; j++) {
                    if (seats[j].equals(movieData.getSeats()[i])) {
                        movieData.setSeat(i, "N/A");
                        bookedTickets.add(obj.getMobileNumber()
                            + " " + movie + " " + time);
                    }
                }
            }
        } else {
            System.out.println("No show");
        }
    }
    /**
     *
     * @param movie The movie
     * @param time The time
     * @param mobileNumber  The mobile number
     */
    public void printTicket(final String movie, final
     String time, final String mobileNumber) {
        for (int i = 0; i < bookedTickets.size(); i++) {
            if ((mobileNumber + " " + movie + " "
                + time).equals(bookedTickets.get(i))) {
                System.out.println(mobileNumber + " " + movie + " " + time);
                return;
            }
        }
        System.out.println("Invalid");
    }
    /**
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < showDetails.size(); i++) {
            System.out.println(showDetails.get(i).toString() + ","
                + Arrays.toString(showDetails.get(i)
                    .getSeats()).replace(" ", ""));
        }
    }

}
