import java.util.Scanner;
/**
*creating a food class to keep track of food.
*/
class Food {
	private String itemName;
	private String quantity;
	private String time;
	private String date;
	/**
	*Empty contructor
	*/
	Food() {

	}
	/**
	*Creating a constructor with the default values.
	*@param fooditem food item which is a String.
	*@param quant quantity of food consumption.
	*@param d which is date.
	*@param t which is time. 
	*/
	Food(String fooditem, String quant, String d, String t) {
		this.itemName = fooditem;
		this.quantity = quant;
		this.date = d;
		this.time = t;
	}
	/**
	*this is a getter method which is used to get the Item name.
	*/
	public String getItemName() {
		return this.itemName;
	}
	/**
	*This is used to get the quantity of the item.
	*/
	public String getQuantity() {
		return this.quantity;
	}
	/**
	*This is used to get the Time.
	*/
	public String getTime() {
		return this.time;
	}
	/**
	*This is used to get the date.
	*/
	public String getFoodDate() {
		return this.date;
	}
	/**
	*This method is used to covert the output to String from LIST.
	*/
	public String toString() {
		return "Date:"+ getFoodDate() +"\n"+ "Time:" + getTime()+"\n" + "Name:" +getItemName() +"\n" + "Quantity" + getQuantity();
	}
}
/**
*This class is used to store the water details.
*/
class Water {
	private String quantity;
	private String date;
	private String time;
	/**
	*This is a deafult constructor.
	*/
	Water() {

	}
	/**
	*This constructor takes the arguments such as quantity date and time.
	*@param quant which is quantity of consumption.
	*@param d which is date.
	*@param t which is time.
	*/
	Water(String quant, String d, String t) {
		this.quantity = quant;
		this.date = d;
		this.time = t;
	}
	/**
	*Which is used to get the quantity of water conusmption.
	*/
	public String getQuantity() {
		return this.quantity;
	}
	/**
	*which is used to get the water date.
	*/
	public String getWaterDate() {
		return this.date;
	}
	/**
	*This is used to get the time.
	*/
	public String getTime() {
		return this.time;
	}
	/**
	*This is used to set the quantity of consumption.
	*@param change where the user can change the quantity.
	*/
	public void setQuantity(String change) {
		this.quantity += change;
	}
	/**
	*This method is used to to convert from List to String.
	*/
	public String toString() {
		return "Date:" + getWaterDate() +"\n"+ "Quantity" + getQuantity();
	}
}
/**
*Physical activity class is used to keep track of all the physical activites.
*/
class PhysicalActivity {
	private String activityName;
	private String startTime;
	private String endTime;
	private String notes;
	private String date;
	/**
	*constructor in which parameters are passed.
	*@param act which is activity name.
	*@param note which is notes of string type.
	*@param d date.
	*@param st which is start time.
	*@param et which is end time.
	*/
	PhysicalActivity(String act,  String note, String d, String st, String et) {
		this.activityName = act;
		this.startTime = st;
		this.endTime = et;
		this.notes = note;
		this.date = d;
	}
	/**
	*gets the activity name
	*/
	public String getActivityName() {
		return this.activityName;
	}
	/**
	*gets the start time.
	*/
	public String getStartTime() {
		return this.startTime;
	}
	/**
	*get the end time.
	*/
	public String getEndTime() {
		return this.endTime;
	}
	/**
	*get the notes respective to the activity.
	*/
	public String getNotes() {
		return this.notes;
	}
	/**
	*get the acitivty date.
	*/
	public String getActivityDate() {
		return this.date;
	}
	/**
	*set the notes if it has to be changed.
	*@param change changes the notes depending on the user.
	*/
	public void setNotes(String change) {
		this.notes += change;
	}
	/*
	*changes from LIST type to string type.
	*/
	public String toString() {
		return "Name:"+getActivityName()+"\n"+"Notes:"+getNotes()+"\n"+"Date:"+getActivityDate()+"\n"+"Starttime:"+getStartTime()+"\n"+"Endtime:"+getEndTime();
	}
}
/**
*Weight class whihch is used to keep track of weight compenents.
*/
class Weight {
	private String kilograms;
	private String fatpercent;
	private String date;
	private String time;
	Weight() {

	}
	Weight(String d,  String t, String kg, String fat) {
		this.kilograms = kg;
		this.fatpercent = fat;
		this.date = d;
		this.time = t;
	}
	public String getKiloGrams() {
		return this.kilograms;
	}
	public String getFatPercent() {
		return this.fatpercent;
	}
	public String getWeightDate() {
		return this.date;
	}
	public String getTime() {
		return this.time;
	}
	public String toString() {
		return "Date:"+getWeightDate()+"\n" + "Time:" +getTime()+"\n" + "Weight:" +getKiloGrams()+"\n" + "Fat:" + getFatPercent();
	}
}

class Sleep {
	private String startTime;
	private String endTime;
	private String date;
	Sleep() {

	}
	Sleep(String d, String sTime, String eTime) {
		this.startTime = sTime;
		this.endTime = eTime;
		this.date = d;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	public String getSleepDate() {
		return this.date;
	}
	public String toString() {
		return "Date:"+getSleepDate()+"\n" + "Starttime:" + getStartTime()+"\n" + "Endtime:" + getEndTime();
	}
}
/**
*This class keeps tarck of daily routen. 
*/
class DailyTracker {
	List <Food> fooddetails;
	List <Water> waterdetails;
	List <PhysicalActivity> activitydetails;
	List <Sleep> sleepdetails;
	List <Weight> weightdetails;
	DailyTracker() {
		fooddetails = new List<Food>();
		waterdetails = new List<Water>();
		activitydetails = new List<PhysicalActivity>();
		sleepdetails = new List<Sleep>();
		weightdetails = new List<Weight>();
	}
	/**
	*This is used to add food.
	*@param fobj food.
	*/
	public void addFood(Food fobj) {
		fooddetails.add(fobj);
	}
	/**
	*@param wonj water.
	*This is used ti add water.
	*/
	public void addWater(Water wobj) {
		waterdetails.add(wobj);
	}
	/**
	*This is used to add the activity.
	*@param aboj activity object.
	*/
	public void addActivity(PhysicalActivity aobj) {
		activitydetails.add(aobj);
	}
	/**
	*This method is used to add sleep.
	*@param sobj sleep obj.
	*/
	public void addSleep(Sleep sobj) {
		sleepdetails.add(sobj);
	}
	/**
	*This is used to add the weight when the used wants to.
	*@param weobj weight
	*/
	public void addWeight(Weight weobj) {
		weightdetails.add(weobj);
	}
	/**
	*This is used to show all the deatils such as food, water etc.
	
	*/
	public void showAll() {
		//System.out.println("hello");
		getFooddetails();
		getWaterdetails();
		getPhysicalActivitydetails();
		getSleepdetails();
		getWeightdetails();
	}
	/**
	*This is used to get the food deatils.
	*/
	public void getFooddetails() {
		if (fooddetails.size() > 0) {
			for (int i = 0; i < fooddetails.size(); i++) {
				System.out.println(fooddetails.get(i).toString());
			}
		} else {
			System.out.println("Food"+"\n"+"None");
		}

	}
	/**
	*This is used to get the water details.
	*/
	public void getWaterdetails() {
		if (waterdetails.size() > 0) {
			for (int i = 0; i < waterdetails.size(); i++) {
				System.out.println(waterdetails.get(i).toString());
			}
		} else {
			System.out.println("Water"+"\n"+"None");
		}
	}
	/**
	*This is used to get the physical activity.
	*/
	public void getPhysicalActivitydetails() {
		if (activitydetails.size() > 0) {
			for (int i = 0; i < activitydetails.size(); i++) {
				System.out.println(activitydetails.get(i).toString());
			}
		} else {
			System.out.println("PhysicalActivity"+"\n"+"None");
		}

	}
	/**
	*This is ued to get the sleep deatils of the person.
	*/
	public void getSleepdetails() {
		if (sleepdetails.size() > 0) {
			for (int i = 0; i < sleepdetails.size(); i++) {
				System.out.println(sleepdetails.get(i).toString());
			}
		} else {
			System.out.println("Sleep"+"\n"+"None");
		}

	}
	/**
	*This is used to get the weight details.
	*/
	public void getWeightdetails() {
		if (weightdetails.size() > 0) {
			for (int i = 0; i < weightdetails.size(); i++) {
				System.out.println(weightdetails.get(i).toString());
			}
		} else {
			System.out.println("Weight"+"\n"+"None");
		}

	}
	/**
	*This is used to show all the activity.
	*/
	public void showAll(String summary) {
		for (int i = 0; i < fooddetails.size(); i++) {
			if (summary.equals(fooddetails.get(i).getFoodDate())) {
				System.out.println(fooddetails.get(i).toString());
			}

		}
		for (int i = 0; i < waterdetails.size(); i++) {
			if (summary.equals(waterdetails.get(i).getWaterDate())) {
				System.out.println(waterdetails.get(i).toString());
			}

		}
		for (int i = 0; i < activitydetails.size(); i++) {
			if (summary.equals(activitydetails.get(i).getActivityDate())) {
				System.out.println(activitydetails.get(i).toString());
			}

		}
		for (int i = 0; i < sleepdetails.size(); i++) {
			if (summary.equals(sleepdetails.get(i).getSleepDate())) {
				System.out.println(sleepdetails.get(i).toString());
			}

		}
		for (int i = 0; i < weightdetails.size(); i++) {
			if (summary.equals(weightdetails.get(i).getWeightDate())) {
				System.out.println(weightdetails.get(i).toString());
			}
		}

	}
}
/**
*This class is based on the input test cases.
*/
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DailyTracker daily = new DailyTracker();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(" ");
			switch(tokens[0]) {
				case "Food":
				String[] item = tokens[1].split(",");
				Food fobj = new Food(item[0], item[1], item[2], item[3]);
				daily.addFood(fobj);
				break;
				case "PhysicalActivity":
				item = tokens[1].split(",");
				PhysicalActivity actobj = new PhysicalActivity(item[0], item[1], item[2], item[3], item[4]);
				daily.addActivity(actobj);
				break;
				case "Water":
				item = tokens[1].split(",");
				Water wobj = new Water(item[0], item[1], item[2]);
				daily.addWater(wobj);
				break;
				case "Sleep":
				item = tokens[1].split(",");
				Sleep sobj = new Sleep(item[0], item[1], item[2]);
				daily.addSleep(sobj);
				break;
				case "Weight":
				item = tokens[1].split(",");
				Weight weigh = new Weight(item[0], item[1], item[2], item[3]);
				daily.addWeight(weigh);
				break;
				case "Foodlog":
				System.out.println("Food");
				daily.getFooddetails();
				System.out.println();
				break;
				case "Waterlog":
				System.out.println("Water");
				daily.getWaterdetails();
				System.out.println();
				break;
				case "PhysicalActivitylog":
				System.out.println("PhysicalActivity");
				daily.getPhysicalActivitydetails();
				System.out.println();
				break;
				case "Weightlog":
				System.out.println("Weight");
				daily.getWeightdetails();
				System.out.println();
				break;
				case "Sleeplog":
				System.out.println("Sleep");
				daily.getSleepdetails();
				System.out.println();
				break;
				case "Summary":
				//item = tokens[1].split(",");
				if (tokens.length == 1) {
					daily.showAll();
				} else {
					daily.showAll(tokens[1]);
				}

				break;

			}
 		}
	}
}