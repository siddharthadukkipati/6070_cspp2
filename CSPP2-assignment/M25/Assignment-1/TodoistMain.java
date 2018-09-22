import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
	private String taskTitle;
	private String taskPersonName;
	private int taskTime;
	private boolean importance;
	private boolean urjent;
	private String taskStatus;
	Task(String title, String name, int time, boolean imp, boolean urgent, String status) {
		this.taskTitle = title;
		this.taskPersonName = name;
		this.taskTime = time;
		this.importance = imp;
		this.urjent = urgent;
		this.taskStatus = status;
	}
	public String getTaskTile() {
		return this.taskTitle;
	}
	public String getPersonName() {
		return this.taskPersonName;
	}
	public int getTaskTime() {
		return this.taskTime;
	}
	public boolean getTaskImp() {
		return this.importance;
	}
	public boolean getTaskUrgent() {
		return this.urjent;
	}
	public String getTaskStatus() {
		return this.taskStatus;
	}
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
		return getTaskTile() + "" + getPersonName() + "" + getTaskTime() + "" + imp + "" + urg + "" + getTaskStatus();
	}

}
// class 
/**
 * Class for todoist main.
 */
class TodoistMain {

	/**
	 * Starts a test.
	 */
	public static void startTest() {
		// Todoist todo = new Todoist();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
			case "task":
				testTask(tokens);
				break;
			// case "add-task":
			// 	testAddTask(todo, tokens);
			// 	break;
			// case "print-todoist":
			// 	System.out.println(todo);
			// 	break;
			// case "get-next":
			// 	System.out.println(todo.getNextTask(tokens[1]));
			// 	break;
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

	// /**
	//  * method to test add task.
	//  *
	//  * @param      todo    The todo
	//  * @param      tokens  The tokens
	//  */
	// public static void testAddTask(final Todoist todo, final String[] tokens) {
	// 	try {
	// 		todo.addTask(createTask(tokens));
	// 	} catch (Exception e) {
	// 		System.out.println(e.getMessage());
	// 	}
	// }

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
