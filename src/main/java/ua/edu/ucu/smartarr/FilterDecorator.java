package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private MyPredicate pr;
    private Object[] result;

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);
        this.pr = pr;
        this.result = Arrays.stream(smartArray.toArray()).filter(pr :: test).toArray();
    }

    @Override
    public Object[] toArray() {
        return result;
    }

    @Override
    public String operationDescription() {
        return "Filter Decorator that tests every element and removes it if it doesn't satisfy MyPredicate"
                + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return result.length;
    }
}
