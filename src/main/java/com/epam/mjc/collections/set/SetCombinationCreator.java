package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> fourSet = new HashSet<>();
        Set<String> fiveSet = new HashSet<>();
        Set<String> sixSet = new HashSet<>();
        sixSet.addAll(thirdSet);
        fiveSet.addAll(firstSet);
        fiveSet.addAll(secondSet);
        for (String str1 : firstSet) {
            for (String str2 : secondSet) {
                if (str1.equals(str2)) {
                    fourSet.add(str1);
                }
            }
        }
        for (String str5 : fiveSet) {
            for (String str3 : thirdSet) {
                if (str5.equals(str3)) {
                    sixSet.remove(str5);
                    fourSet.remove(str5);
                }
            }
        }
        fourSet.addAll(sixSet);
        return fourSet;

    }

}
