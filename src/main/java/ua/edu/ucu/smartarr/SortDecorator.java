package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    private MyComparator cmp;
    private Object[] result;

    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        this.cmp = cmp;
        this.result = Arrays.stream(smartArray.toArray()).sorted(cmp).toArray();
    }

    @Override
    public Object[] toArray() {
        return result;
    }

    @Override
    public String operationDescription() {
        return "Sort Decorator that sorts elements using MyComparator to compare them" +
                smartArray.operationDescription();
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    
}
