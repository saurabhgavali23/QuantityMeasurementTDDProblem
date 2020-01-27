package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    public int value;
    public Unit unit;

    public enum Unit {
        FEET, INCH;
    }

    public QuantityMeasurement(Unit unit, int value) throws QuantityMeasurementException {
        try {
            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null_Value");
        }
    }

    public int getConversionValue() {
        if (Unit.FEET.equals(unit))
            return this.value;
        if (Unit.INCH.equals(unit))
            return this.value;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return value == that.value &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
