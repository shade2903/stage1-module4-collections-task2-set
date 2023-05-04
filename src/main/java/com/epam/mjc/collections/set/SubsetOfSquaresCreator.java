package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();
        for(Integer number : sourceList){
            int sqNumber = number*number;
            if(sqNumber >= lowerBound && sqNumber <= upperBound) set.add(sqNumber);
        }
        return set;
    }
}
