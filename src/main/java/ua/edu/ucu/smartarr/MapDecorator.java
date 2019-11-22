package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    private MyFunction func;
    private Object[] result;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.func = func;
        this.result = Arrays.stream(smartArray.toArray()).map(func :: apply).toArray();
    }

    @Override
    public Object[] toArray() {
        return result;
    }

    @Override
    public String operationDescription() {
        return "Map Decorator that map every element to another object using MyFunction"
                + smartArray.operationDescription();
    }

    @Override
    public int size() {
        return smartArray.size();
    }



}
