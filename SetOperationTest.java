package com.homework._2015_03_13.part2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * SetOperation Tester.
 *
 * @author <Alexandr Kozlov>
 * @version 1.0
 */
public class SetOperationTest {

    /**
     * Method: unionSet(Set a, Set b)
     */
    @Test
    public void testUnionSet() throws Exception {

        Set a = new HashSet();
        Set b = new HashSet();

        //init set a with 7 elements: 1, 2, a, 3, b, 4, d.
        a.add(1);a.add(2);a.add("a");a.add(3);a.add("b");a.add(4);a.add("d");
        //init set b with 7 elements: 1,  4, a, 2, e, c, 5.
        b.add(1);b.add(4);b.add("a");b.add(2);b.add("e");b.add("c");b.add(5);

        //Union
        Set cUnion = SetOperation.unionSet(a, b);

        // wait elements: 1, a, 2, b, 3, c, 4, d, e, 5.
        System.out.println("Union Set");
        System.out.println(cUnion);
    }


    /**
     * Method: intersectionSet(Set a, Set b)
     */
    @Test
    public void testIntersectionSet() throws Exception {
        Set a = new HashSet();
        Set b = new HashSet();

        //init set a with 7 elements: 1, 2, a, 3, b, 4, d.
        a.add(1);a.add(2);a.add("a");a.add(3);a.add("b");a.add(4);a.add("d");
        //init set b with 7 elements: 1,  4, a, 2, e, c, 5.
        b.add(1);b.add(4);b.add("a");b.add(2);b.add("e");b.add("c");b.add(5);

        // Intersection
        Set cIntersection = SetOperation.intersectionSet(a, b);

        // wait elements: 1, a, 2, 4.
        System.out.println("Intersection Set");
        System.out.println(cIntersection);
    }

    /**
     * Method: differenceSet(Set<A> a, Set<B> b)
     */
    @Test
    public void testDifferenceSet() throws Exception {
        Set a = new HashSet();
        Set b = new HashSet();

        //init set a with 7 elements: 1, 2, a, 3, b, 4, d.
        a.add(1);a.add(2);a.add("a");a.add(3);a.add("b");a.add(4);a.add("d");
        //init set b with 7 elements: 1,  4, a, 2, e, c, 5.
        b.add(1);b.add(4);b.add("a");b.add(2);b.add("e");b.add("c");b.add(5);

        // Difference
        Set cDifference = SetOperation.differenceSet(a, b);

        // wait elements: b, 3, d.
        System.out.println("Difference Set");
        System.out.println(cDifference);
    }

    /**
     * Method: symmetricDifferenceSet(Set<A> a, Set<B> b)
     */
    @Test
    public void testSymmetricDifferenceSet() throws Exception {
        Set a = new HashSet();
        Set b = new HashSet();

        //init set a with 7 elements: 1, 2, a, 3, b, 4, d.
        a.add(1);a.add(2);a.add("a");a.add(3);a.add("b");a.add(4);a.add("d");
        //init set b with 7 elements: 1,  4, a, 2, e, c, 5.
        b.add(1);b.add(4);b.add("a");b.add(2);b.add("e");b.add("c");b.add(5);

        // Difference
        Set cSymmetricDifference = SetOperation.symmetricDifferenceSet(a, b);

        // wait elements: b, 3, c, d, e, 5.
        System.out.println("SymmetricDifference Set");
        System.out.println(cSymmetricDifference);
    }

    /**
     * All methods. Set a and Set b are empty.
     */
    @Test
    public void testSetOperationWithEmptySet() throws Exception {
        Set a = new HashSet();
        System.out.println("Set a.");
        System.out.println(a);

        Set b = new HashSet();
        System.out.println("Set b");
        System.out.println(b);

        System.out.println("Union");
        System.out.println(SetOperation.unionSet(a,b));
        System.out.println("Intersection");
        System.out.println(SetOperation.intersectionSet(a,b));
        System.out.println("Difference");
        System.out.println(SetOperation.differenceSet(a,b));
        System.out.println("Symmetric difference");
        System.out.println(SetOperation.symmetricDifferenceSet(a,b));

    }

} 
