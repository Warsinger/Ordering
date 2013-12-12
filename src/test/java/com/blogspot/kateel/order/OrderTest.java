package com.blogspot.kateel.order;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA. User: mlee Date: 12/11/13 Time: 9:00 PM
 */
public class OrderTest {
    Order order;

    @Before
    public void setUp() throws Exception {
        order = new Order();
    }

    @Test
    public void testOrderArray() throws Exception {
        Character[] ordering = {'a', 'j', 'x', 'y', 'q', 'e', 'f'};
        Character[] input1 = {'a', 'j', 'x', 'y', 'q', 'e', 'f', 'm', 'n', 'j', 'y', 'q', 'a', 'j', 'x', 'y', 'q', 'e', 'f'};
        Character[] input2 = Arrays.copyOf(input1, input1.length);
        Character[] expected = {'a', 'a', 'j', 'j', 'j', 'x', 'x', 'y', 'y', 'y', 'q', 'q', 'q', 'e', 'e', 'f', 'f'};
        System.out.print("input1: ");
        System.out.println(Arrays.toString(input1));
        Character[] results = order.orderArray1(ordering, input1);
        System.out.print("sorted1: ");
        System.out.println(Arrays.toString(results));
        assertTrue("array 1 should be sorted correctly", Arrays.equals(expected, results));
        System.out.print("input2: ");
        System.out.println(Arrays.toString(input2));
        results = order.orderArray2(ordering, input2);
        System.out.print("sorted2: ");
        System.out.println(Arrays.toString(results));
        assertTrue("array 2 should be sorted correctly", Arrays.equals(expected, results));
    }
}
