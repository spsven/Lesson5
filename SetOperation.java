package com.homework._2015_03_13.part2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alexandr Kozlov on 14.03.2015.
 */
public class SetOperation {

    /**
     * Union of sets - set containing all the elements of the original sets.
     *
     * @param a the name of the first set
     * @param b the name of the second set
     * @return set (the result of the union of sets)
     */
    public static Set unionSet(Set a, Set b) {
        Set result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /**
     * Intersection of sets - this set, which owns those and only those elements that belong
     * at the same time to all the data sets.
     *
     * @param a the name of the first set
     * @param b the name of the second set
     * @return set (the result of the intersection of sets)
     */
    public static Set intersectionSet(Set a, Set b) {
        Set result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    /**
     * The difference of two sets - a set that includes all the elements of the first set
     * that is not included in the second set.
     *
     * @param a   the name of the first set
     * @param b   the name of the second set
     * @param <A> the type of data of the first set a
     * @param <B> the type of data of the second set b
     * @return set (the result of the difference of sets)
     */
    public static <A, B> Set differenceSet(Set<A> a, Set<B> b) {
        Set result = new HashSet<>();
        for (A i : a) {
            if (!b.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Symmetric difference of two sets - set containing all elements of the original sets
     * that do not belong simultaneously to both the original set.
     *
     * @param a the name of the first set
     * @param b the name of the second set
     * @return set (the result of the symmetric difference of sets)
     */
    public static Set symmetricDifferenceSet(Set a, Set b) {
        return unionSet(differenceSet(a, b), differenceSet(b, a));
    }
}
