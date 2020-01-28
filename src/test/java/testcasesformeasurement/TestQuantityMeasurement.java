package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.LengthConversion;
import quantitymeasurement.QuantityMeasurementException;

public class TestQuantityMeasurement {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet() throws QuantityMeasurementException {
        LengthConversion length = new LengthConversion(LengthConversion.Unit.FEET, 0);
        int value = length.getConversionValue();
        Assert.assertEquals(0, value);
    }

    @Test
    public void whenGivenNullFeet_shouldReturnNull() {
        try {
            LengthConversion length = new LengthConversion(null, 0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenFeet_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion lengthConversion1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        LengthConversion lengthConversion2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        Assert.assertTrue(lengthConversion1.equals(lengthConversion2));
    }

    @Test
    public void whenGivenFeet_checkType_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        Assert.assertTrue(length1.getClass().equals(length2.getClass()));
    }

    @Test
    public void whenGivenFeet_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
        Assert.assertTrue(length1.equals(length2));
    }

    // Test Cases For Inch
    @Test
    public void whenGivenNullInch_shouldReturnNull() {
        try {
            LengthConversion length = new LengthConversion(null, 0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenInch_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void whenGivenInch_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void whenGivenInch_checkType_shouldReturnEqual() throws QuantityMeasurementException {
        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
        Assert.assertTrue(length1.getClass().equals(length2.getClass()));
    }
}
