package com.blogspot.kateel.order;

import java.util.*;

/**
 * Created with IntelliJ IDEA. User: mlee Date: 12/11/13 Time: 8:55 PM
 */
public class Order {
    Character[] orderArray1(Character[] ordering, Character[] input) {
        Collection<Character> results = new ArrayList<>();
        for (Character c1 : ordering) {
            for (Character c2 : input) {
                if (c2.equals(c1)) {
                    results.add(c1);
                }
            }
        }
        return results.toArray(new Character[results.size()]);
    }

    public Character[] orderArray2(Character[] ordering, Character[] input) {
        Map<Character, Integer> map = new HashMap<>(ordering.length);
        for (int i = 0; i < ordering.length; i++) {
            map.put(ordering[i], i);
        }
        System.out.print("map: ");
        System.out.println(map);

        Arrays.sort(input, new OrderComparator(map));
        int newLength = 0;
        for (Character c : input) {
            if (map.containsKey(c)) {
                newLength++;
            } else {
                break;
            }
        }
        return Arrays.copyOf(input, newLength);
    }

    private class OrderComparator implements Comparator<Character> {
        private final Map<Character, Integer> map;

        public OrderComparator(Map<Character, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(Character c1, Character c2) {
            Integer i1 = map.get(c1);
            Integer i2 = map.get(c2);
            if (i1 != null & i2 != null) {
                return i1 - i2;
            }
            if (i1 == null) {
                return 1;
            }
            // i2 == null
            return -1;
        }
    }
}
