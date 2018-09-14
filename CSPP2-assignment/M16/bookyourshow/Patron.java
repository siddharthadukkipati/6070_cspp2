import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Patron {
	private String name;
	private String mobileNumber;

	public Patron(String n, String mn) {
		this.name = n;
		this.mobileNumber = mn;
	}
	public String getName() {
		return this.name;
	}
	public String getMobileNumber() {
		return this.mobileNumber;
	}
}