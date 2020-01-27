package quantitymeasurement;

public class QuantityMeasurementException extends Throwable {

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType{
        NULL_VALUE
    }
}
