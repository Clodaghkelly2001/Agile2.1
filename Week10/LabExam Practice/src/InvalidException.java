public class InvalidException extends Exception {
    String message;

    public InvalidException(String errMessage)
    {
        message = errMessage;
    }
    public String getMessage()
    {
        return message;
    }
}
