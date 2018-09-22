import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
/**
*Creating a Task class which stores all the infomration realted to Task.
*/
class Task {
    /**
    *task title.
    */
    private String taskTitle;
    /**
    *Person Name.
    */
    private String taskPersonName;
    /**
    *Task Time.
    */
    private int taskTime;
    /**
    *Impotance.
    */
    private boolean importance;
    /**
    *Urgent.
    */
    private boolean urgent;
    /**
    *Status.
    */
    private String taskStatus;
    /**
    *Implementing an overloaded constructor.
    *@param title which is the title of the task.
    *@param name which is the name of the Person or task owner.
    *@param time which is the time requried to complete the task.
    *@param imp which is the importance which we give to the task.
    *@param urgent which is the urgency which we give to the task.
    *@param status which is the status of the task.
    @throws Exception which throws exception.
    */
    Task(final String title, final String name, final int time,
        final boolean imp, final boolean urgent,
        final String status) throws Exception {
        if (title.equals("")) {
            throw new Exception("Title not provided");
        }
        if (!(time > 0)) {
            throw new Exception("Invalid timeToComplete " + time);
        }
        if (!(status.equals("done") || status.equals("todo"))) {
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
    *@return boolean value.
    */
    public boolean getTaskImp() {
        return this.importance;
    }
    /**
    *gets boolean value based on the urgency of the task.
    *@return boolean value.
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
        return getTaskTitle() + ", " + getPersonName() + ", "
        + getTaskTime() + ", " + imp + ", " + urg + ", " + gettaskstatus();
    }

}
