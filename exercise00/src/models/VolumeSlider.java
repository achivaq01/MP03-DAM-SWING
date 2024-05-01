package models;

public class VolumeSlider {
    private final int maxValue;
    private final int minValue;
    private int value;

    public VolumeSlider(int minValue, int maxValue, int value) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
         this.value = value;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

}
