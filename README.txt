Coding problem from a job interview. I initially did this on paper and relayed it over the phone which was challenging. After the interview I went back and implemented the 2 solutions I thought of as well as a small unit test.

Given 2 arrays, order the elements of the second array based on their order in the first array.

Ordering:   {'a', 'j', 'x', 'y', 'q', 'e', 'f'};
Input:      {'a', 'j', 'x', 'y', 'q', 'e', 'f', 'm', 'n', 'j', 'y', 'q', 'a', 'j', 'x', 'y', 'q', 'e', 'f'};
Expected:   {'a', 'a', 'j', 'j', 'j', 'x', 'x', 'y', 'y', 'y', 'q', 'q', 'q', 'e', 'e', 'f', 'f'};

Items not in the ordering are dropped.

First idea was O(N^2) just looping over the ordering and an inner loop over the input array and if the elements are equal then print them out.
Second idea was make a mapping of the ordering Character => Array Index. Then sort the input array using Arrays.sort, passing in a comparator that works off the map for the ordering.
This is roughly (N + M log(M)) where N is size of order array and M is size of input array. This is the one I implemented in the exercise (mostly correctly).
