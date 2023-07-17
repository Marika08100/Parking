public class IsFullException extends Exception{
    public IsFullException(String message){
        super("The parking lot is full! ");
    }
}
