import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

// class Show {
// 	private String movieName;
// 	private String dateTime;
// 	private String[] seats;

// 	public Show(String mn, String dt, string[] s) {
// 		this.movieName = mn;
// 		this.dateTime = dt;
// 		this.seats = s;
// 	}
// 	public String getMovieName() {
// 		return this.movieName;
// 	}
// 	public String getDateTime() {
// 		return this.dateTime;
// 	}
// 	public String[] getSeats() {
// 		return this.seats;
// 	}
// 	public void setSeat(int index, String set) {
// 		seats[index] = set;
// 	}
// 	public String toString() {
// 		return movieName+","+dateTime+","+Arrays.toString(seats).replace(" ","");
// 	}
// }
/**
 * Class for show.
 */
class Show {
    /**
     * variable that can be accessed within the class.
     */
    private String movieName;
    /**
     *variable that can be accessed within the class.
     */
    private String dateTime;
    /**
     *string array that can be accessed within the class.
     */
    private String[] seats;
    /**
     * Constructs the object.
     *
     * @param name  The name
     * @param t     date and time
     * @param seat  The seat
     */
    Show(final String name, final String t, final String[] seat) {
        this.movieName = name;
        this.dateTime = t;
        this.seats = seat;
    }
    /**
     * Gets the movie name.
     * @return The movie name.
     */
    public String getMovieName() {
        return this.movieName;
    }
    /**
     * Gets the date time.
     * @return The date time.
     */
    public String getDateTime() {
        return this.dateTime;
    }
    /**
     * Gets the seats.
     * @return The seats.
     */
    public String[] getSeats() {
        return this.seats;
    }
    /**
     * Sets the seat.
     * @param index The index
     * @param set The et
     */
    public void setSeat(final int index, final String set) {
        seats[index] = set;
    }
    /**
     * Returns a string representation of the object.
     * @return String representation of the object.
     */
    public String toString() {
        return this.movieName + "," + this.dateTime;
    }
}
