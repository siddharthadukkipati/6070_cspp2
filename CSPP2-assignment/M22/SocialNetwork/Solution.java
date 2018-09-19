import java.util.Scanner;
import java.util.Arrays;
/**
*Implementing a class User where in we declare some variables.
*/
class UserName {
	private String userName;
	List<String> followers;
	/**
	*Defined a user constructor
	*@param username where in we send the username as a attribute.
	*/
	UserName(String usename) {
		this.userName = usename;
		followers = new List<String>();
	}
	/**
	*getter method to get the User name.
	*/
	public String getUserName() {
		return this.userName;
	}
	/**
	*taking a generic ListADT and developing the method. 
	*/
	public List<String> getFollowers() {
		return this.followers;
	}
	/**
	*Using this we add the followers.
	*@param fn which is the follower name.
	*/
	public void addFollower(String fn) {
		followers.add(fn);
	}
	/**
	*developing a toString method to convert from List type to String type.
	*/
	public String toString() {
		String s = this.userName + ":" +followers.toString();
		return s;
	}
}
/**
*Developing Socail Networking class.
*where in we take the help of generic ListADT and develop the User details.
*/
class SocialNetwork {
	List<UserName> userdetails;
	/**
	*default constructor.
	*/
	SocialNetwork() {
		userdetails = new List<UserName>();

	}
	public void addUsers(UserName name) {
		userdetails.add(name);
	}
	/**
	*adding users to the user deatils method and storing the details.
	*@param name sending the name as an argument and storing them in
	* userdetails. 
	*/
	public String getConnections(String username) {

		for (int i = 0; i < userdetails.size(); i++) {

			if (username.equals(userdetails.get(i).getUserName())) {
				//System.out.println(username);
				return userdetails.get(i).toString();
			}
		}
		return "Not a user in Network";
	}
	/**
	*With the help of this method we get the followers(connections)
	*which the user has.
	*@param username sending the argument username.
	*@param follower sending the follower.
	*/
	public void addConnections(String username, String follower) {
		for (int i = 0; i < userdetails.size(); i++) {
			if (username.equals(userdetails.get(i).getUserName())) {
				if(!userdetails.get(i).getFollowers().contains(follower)) {
					userdetails.get(i).addFollower(follower);
				}
			}
		}
	}
	/**
	*this method is used to get the common connections between.
	*two user names.
	*@param username1 sending the username1 as an argument.
	*@param username2 sending the username2 to compare with username2 as an
	*argument.
	*/
	public void getCommonConnections(String username1, String username2) {
		List<String> clearList1 = new List<String>();
		List<String> clearList2 = new List<String>();
		List<String> resultList = new List<String>();
		for (int i = 0; i < userdetails.size(); i++) {
			if (username1.equals(userdetails.get(i).getUserName())) {
				clearList1 = userdetails.get(i).getFollowers();
				break;
			}
		}
		//System.out.println(clearList1);
		for (int i = 0; i < userdetails.size(); i++) {
			if (username2.equals(userdetails.get(i).getUserName())) {
				clearList2 = userdetails.get(i).getFollowers();
				break;
			}
		}
		//System.out.println(clearList2);
		for (int i = 0; i < clearList1.size(); i++) {
			//System.out.println(clearList1.get(i));
			if (clearList2.contains(clearList1.get(i))) {

				resultList.add(clearList1.get(i));
			}
		}
		System.out.println(resultList);
 	}
 	/**
 	*this method is used to get the entire data which is stored in th =e user details.
 	*/
 	public void Network() {
 		String[] users = new String[userdetails.size()];
 		for (int i = 0; i < userdetails.size(); i++) {
 			users[i] = userdetails.get(i).toString();
 		}
 		Arrays.sort(users);
 		String s = Arrays.toString(users);
 		System.out.println(s.substring(1,s.length()-1));
 	}

}
/**
*Solution classs is used to Run the code according to the given test cases.
*/
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SocialNetwork sN = new SocialNetwork();
		while(scan.hasNext()) {
			String line = scan.nextLine();
			if (line.contains(" is connected to ")) {
				String[] tokens = line.split(" is connected to ");
				String[] items = tokens[1].replace(".", "").split(", ");
				UserName uobj = new UserName(tokens[0]);
				for (int i = 0; i < items.length; i++) {
					uobj.addFollower(items[i]);
				}
				sN.addUsers(uobj);
			} else {
				}
				String[] tokens = line.split(" ", 2);
				switch (tokens[0]) {
				case "getConnections":
				System.out.println(sN.getConnections(tokens[1]));
				break;
				case "addConnections":
				String[] list = tokens[1].split(" ");
				sN.addConnections(list[0], list[1]);
				break;
				case "CommonConnections":
				list = tokens[1].split(" ");
				sN.getCommonConnections(list[0], list[1]);
				break;
				case "Network":
				sN.Network();
				default:
				}
			}
	}
}
