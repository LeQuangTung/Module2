package thuchanh2;

import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){
    }

    public ComparableCircle(double radius){
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }
}
