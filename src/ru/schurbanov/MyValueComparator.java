package ru.schurbanov;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by schurbanov on 9/27/2016.
 */
class MyValueComparator implements Comparator {
    Map map;

    public MyValueComparator(Map map) {
        this.map = map;
    }

    public int compare(Object keyA, Object keyB) {
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);
        return valueB.compareTo(valueA);
    }
}