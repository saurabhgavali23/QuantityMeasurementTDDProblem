package quantitymeasurement;

import java.util.Objects;

public class Inch {

    public int inch;

    public Inch(Integer inch) throws QuantityMeasurementException {
        try {
            this.inch = inch;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null_Value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch feet1 = (Inch) o;
        return inch == feet1.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inch);
    }
}
