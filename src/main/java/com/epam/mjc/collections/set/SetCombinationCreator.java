package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> fourSet = new HashSet<>();
        Set<String> fiveSet = new HashSet<>();
        fiveSet.addAll(firstSet);
        fiveSet.addAll(secondSet);
        for (String str1 : firstSet) {
            for (String str2 : secondSet) {
                if (str1.equals(str2)) {
                    fourSet.add(str1);
                }
            }
        }
        fourSet.addAll(thirdSet);
        for (String str5 : fiveSet) {
            for (String str3 : thirdSet) {
                if (str5.equals(str3)) {
                    fourSet.remove(str5);
                }
            }
        }
        return fourSet;
    }

}
