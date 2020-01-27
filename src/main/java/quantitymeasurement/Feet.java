package quantitymeasurement;

import java.util.Objects;

public class Feet {

    public int feet;

    public Feet(Integer feet) throws QuantityMeasurementException {
        try {
            this.feet = feet;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null_Value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet1 = (Feet) o;
        return feet == feet1.feet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(feet);
    }
}
