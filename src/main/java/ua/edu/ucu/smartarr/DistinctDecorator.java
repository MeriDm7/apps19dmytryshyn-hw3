package ua.edu.ucu.smartarr;


import java.util.ArrayList;
import java.util.Arrays;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{
    public Object[] res;

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        ArrayList<Object> arr = new ArrayList<>();
        ArrayList<Object> smatrArr = new ArrayList<>(Arrays.asList(smartArray.toArray()));
        for (int i = 0; i < smatrArr.size(); i++) {
            for (int j = i + 1; j < smatrArr.size(); j++) {
                if (!(smatrArr.get(i).equals(smatrArr.get(j))) && (!(arr.contains(smatrArr.get(i))))) {
                    arr.add(smatrArr.get(i));
                }
            }
        }
        this.res = arr.toArray();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.res, this.res.length);
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription() + "DistinctDecorator that removes duplicates from SmartArray";
    }

    @Override
    public int size() {
        return res.length;
    }
}
