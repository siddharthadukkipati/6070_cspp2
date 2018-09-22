import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
/**
*To do ist class is defined to perofrom various methods on Tasks.
*/
class Todoist {
    /**
    *Tasks is an array of Tasks.
    */
    private Task[] tasks;
    /**
    *size of the Task Array.
    */
    private int size;
    /**
    *A default constructor in which certain values are initialised.
    *size is the size of the task array.
    */
    Todoist() {
        final int ten = 10;
        tasks = new Task[ten];
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
    *@param newTask .
    */
    public void addTask(final Task newTask) {
        if (size == tasks.length) {
            resize();
        }
        tasks[size++] = newTask;
    }
    /**
    *This method  toString converts the array input into String type.
    *@return return String formatted output.
    */
    public String toString() {
        String arraystring = "";
        for (int i = 0; i < size - 1; i++) {
            arraystring = arraystring + tasks[i].toString() + "\n";
        }
        arraystring = arraystring + tasks[size - 1].toString();
        return arraystring;
    }
    /**
    *get the next task.
    *@param inputName .
    *@return return the next task.
    */
    public Task getNextTask(final String inputName) {
        for (Task eachtask: tasks) {
    if (eachtask.getPersonName().equals(inputName) && eachtask.gettaskstatus()
        .equals("todo") && eachtask.getTaskImp() == true) {
                return eachtask;
            }
        }
        return null;
    }
}
