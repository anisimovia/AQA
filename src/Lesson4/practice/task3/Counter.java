package Lesson4.practice.task3;

public class Counter {
    private static final int DEFAULT_VALUE = 10;
    private int currentValue;

    public Counter() {
        this.currentValue = DEFAULT_VALUE;
    }

    public Counter(int currentValue) {
        this.currentValue = currentValue;
    }

    public void increaseValue() {
        this.currentValue++;
    }

    public void decreaseValue() {
        this.currentValue--;
    }

    public void setCurrentValue(int newCurrentValue) {
        this.currentValue = newCurrentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
