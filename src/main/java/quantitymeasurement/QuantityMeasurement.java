package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    private final int value;

    public QuantityMeasurement(int value) {
            this.value = value;
    }

    public int getFeetValue() {

        return value * 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
