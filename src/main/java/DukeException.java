//Implement a class DukeException that extends the Exception class. 
//This class should be able to handle the different exceptions that may occur in your program.

public class DukeException extends Exception {
    //CommandException
    // Constructor that accepts a message
    public DukeException(String message)
    {
       super(message);
    }


}