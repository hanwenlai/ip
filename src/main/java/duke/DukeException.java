package duke;

/**
 * An exception that is specific to duke.Duke.
 *
 * @author Lai Han Wen
 */
public class DukeException extends Exception {

    public DukeException() {}

    public DukeException(String message) {
        super(message);
    }

    /**
     * Returns the String representation of a duke.DukeException.
     *
     * @return the String representation of a duke.DukeException.
     */
    @Override
    public String toString() {
        return getMessage() + "\nEnter command:";
    }

}
