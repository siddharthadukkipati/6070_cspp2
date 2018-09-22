import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
/**
*Creating a Task class which stores all the infomration realted to Task.
*/
class Task {
	private String taskTitle;
	private String taskPersonName;
	private int taskTime;
	private boolean importance;
	private boolean urgent;
	private String taskStatus;
	/**
	*Implementing an overloaded constructor.
	*@param title which is the title of the task.
	*@param name which is the name of the Person or task owner.
	*@param time which is the time requried to complete the task.
	*@param imp which is the importance which we give to the task.
	*@param urgent which is the urgency which we give to the task.
	*@param status which is the status of the task.
	*/
	Task(String title, String name, int time, boolean imp, boolean urgent, String status) throws Exception {
		if(title.equals("")) {
			throw new Exception("Title not provided");
		}
		if(!(time > 0)) {
			throw new Exception("Invalid timeToComplete " + time);
		}
		if(!(status.equals("done") || status.equals("todo"))) {
			throw new Exception("Invalid status " + status);
		}
		this.taskTitle = title;
		this.taskPersonName = name;
		this.taskTime = time;
		this.importance = imp;
		this.urgent = urgent;
		this.taskStatus = status;
	}
	/**
	*Gets the Title of the Task.
	*@return title of the task.
	*/
	public String getTaskTitle() {
		return this.taskTitle;
	}
	/**
	*Gets the name of the Person.
	*@return Person name.
	*/
	public String getPersonName() {
		return this.taskPersonName;
	}
	/**
	*Gets the Time take to complete the task.
	*@return time taken by the task. 
	*/
	public int getTaskTime() {
		return this.taskTime;
	}
	/**
	*gets the boolean value based on the importance of the task.
	*@return boolean value 
	*/
	public boolean getTaskImp() {
		return this.importance;
	}
	/**
	*gets boolean value based on the urgency of the task.
	*@return boolean value 
	*/
	public boolean getTaskUrgent() {
		return this.urgent;
	}
	/**
	*gets the status of the task.
	*@return status of the task.
	*/
	public String gettaskstatus() {
		return this.taskStatus;
	}
	/**
	*returns String formatted output.
	*@return Strimg format.
	*/
	public String toString() {
		String imp = "";
		String urg = "";
		if (getTaskImp()) {
			imp = "Important";
		} else {
			imp = "Not Important";
		}
		if (getTaskUrgent()) {
			urg = "Urgent";
		} else {
			urg = "Not Urgent";
		}
		return getTaskTitle() + ", " + getPersonName() + ", " + getTaskTime() + ", " + imp + ", " + urg + ", " + gettaskstatus();
	}

}
/**
*To do ist class is defined to perofrom various methods on Tasks.
*/
class Todoist {
	private Task[] tasks;
	private int size;
	/**
	*A default constructor in which certain values are initialised.
	*size is the size of the task array.  
	*/
	Todoist() {
		final int a = 10;
		tasks = new Task[a];
		size = 0;
	}
	/**
	*This method resizes the Array when where it is full to double the size.
	*/
	public void resize() {
		tasks = Arrays.copyOf(tasks, 2 * size);
	}
	/**
	*This method basically add the task.
	*And also call the resize method when ever the size is full.
	*/
	public void addTask(Task newtask) {
		if(size == tasks.length) {
			resize();
		}
		tasks[size++] = newtask;
	}
	/**
	*This method  toString converts the array input into String type.
	*/
	public String toString() {
		String arraystring = "";
		for(int i = 0; i < size - 1; i++) {
			arraystring = arraystring + tasks[i].toString() + "\n";
		}
		arraystring = arraystring + tasks[size - 1].toString();
		return arraystring;
	}
	/**
	*
	*/
	public Task getNextTask(String inputname) {
		for(Task eachtask: tasks) {
			if(eachtask.getPersonName().equals(inputname) && eachtask.gettaskstatus().equals("todo") && eachtask.getTaskImp() == true) {
				return eachtask;
			}
		}
		return null;
	}
} 
/**
 * Class for todoist main.
 */
public class TodoistMain {

	/**
	 * Starts a test.
	 */
	public static void startTest() {
		Todoist todo = new Todoist();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
			case "task":
				testTask(tokens);
				break;
			case "add-task":
				testAddTask(todo, tokens);
				break;
			case "print-todoist":
				System.out.println(todo);
				break;
			case "get-next":
				System.out.println(todo.getNextTask(tokens[1]));
				break;
			// case "get-next-n":
			// 	int n = Integer.parseInt(tokens[2]);
			// 	Task[] tasks = todo.getNextTask(tokens[1], n);
			// 	System.out.println(Arrays.deepToString(tasks));
			// 	break;
			// case "total-time":
			// 	System.out.println(todo.totalTime4Completion());
			// 	break;
			default:
				break;
			}
		}
	}

	/**
	 * method to test add task.
	 *
	 * @param      todo    The todo
	 * @param      tokens  The tokens
	 */
	public static void testAddTask(final Todoist todo, final String[] tokens) {
		try {
			todo.addTask(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * method to test the creation of task object.
	 *
	 * @param      tokens  The tokens
	 */
	public static void testTask(final String[] tokens) {
		try {
			System.out.println(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Creates a task object.
	 *
	 * @param      tokens     The tokens
	 *
	 * @return     Task object
	 *
	 * @throws     Exception  if task inputs are invalid
	 */
	public static Task createTask(final String[] tokens) throws Exception {
		String title = tokens[1];
		String assignedTo = tokens[2];
		int timeToComplete = Integer.parseInt(tokens[3]);
		boolean important = tokens[4].equals("y");
		boolean urgent = tokens[5].equals("y");
		String status = tokens[6];
		return new Task(
		           title, assignedTo, timeToComplete, important, urgent, status);
	}

	/**
	 * main method.
	 *
	 * @param      args  The command line arguments
	 */
	public static void main(final String[] args) {
		startTest();
	}
}
