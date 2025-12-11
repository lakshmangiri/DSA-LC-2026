# DSA Leet Code 2026

In this repository, I have solved/solving `Data Structures & Algorithms` problems from Leet Code. The goal is to understand the concepts of DSA and upskill my knowledge with regards to DSA. Also, I commit this myself to solve a problem daily and commit to this repository.

### Programming Language

`JAVA`

I chose JAVA because it offers flexibility and is my preferred language for tackling data structures problems. My approach emphasizes writing custom methods rather than relying on external libraries or packages, allowing for a deeper understanding of the underlying algorithms. Additionally, I opted for Java over simpler languages like Python to challenge myself and reinforce core programming concepts.

### Problems

<details>
    <summary>
        1. Merge Sorted Array
    </summary>

### Given Problem:

Given two integer arrays `num1` and `num2`, both sorted in non-descending order, and two integers `m` and `n` representing the number of elements in `num1` and `num2` respectively.

Merge `num1` and `num2` into a single array sorted in non-descending (ascending) order.

The merged result should be stored in `num1`. To facilitate this, `num1` has a length of `m + n`, where the first `m` elements are valid and the last `n` elements are set to `0` and should be ignored. `num2` has a length of `n`.

**EXAMPLE:**

    Input: num1 = [1, 2, 3, 0, 0, 0], m = 3, num2 = [2, 5, 6], n = 3

    Output: [1,2,2,3,5,6]

    Explanation: The array we merged are num1 and num2. 0 are ignored as given in the question.

    SUMMARY:

    - Two given integer array and sorted in ascending order (smallest to largest).
    - Two numbers given are the length of the two integer array.
    - The end result must be stored in array `num1` meaning we are merging `num2` into `num1`.
    - If the array has `0` then it is ignored meaning it is not counted as an element.
    - The length of the final output is simply `m + n`.

**Problem and Solution in a story:**

- Imagine there are two parallel long roads `Road_1` and `Road_2`. The cars are arranged in small to bigger cars on both the roads. `m` in the number of cars present in `Road_1` and `n` is the number of cars present in `Road_2`.

- The bicycles are ignored in both the roads.

- The goal is to move the cars from `Road_2` to `Road_1` in ascending order (small car to big car).

- Three inspectors (pointers) `p1`, `p2` and `p` where:

```
# Inspector p1 stands at last car in Road_1
    p1 = m - 1

# Inspector p2 stands at last car in Road_2
    p2 = n - 1

# Inspector p stands at last car in merged Road_1 and Road_2
    p = m + n - 1
```
 - Merge the cars from small to large in `Road_1` as long as both the roads has cars.

```
# Inspectors p1 and p2 checks if there are cars in both the roads
    while (p1 >=0 && p2 >= 0) {
# Now inspector checks if the car in road_1 at a given p1 is bigger than the car in road_2 at a given p2
    If(num1[p1] > num2[p2]) {
# If yes, then assigns the num1[p] to num1[p1]
    num1[p] = num1[p1]
# Also, reduces the number of cars in p1 to -1 so that the inspector can check the next car to compare with.
    p1--       
    }
# If no, then assigns the num1[p] to num2[p2]
    else {
        num1[p] = num2[p2]
# Also, reduces the number if cars in p2 to -1 so that the inspector can check the next car to compare with.
    }
# After performing the check, reduces the slot (p) by -1 as we have filled 1 slot in Road_1
    p--
}
```
 - Merge the cars from small to large in `Road_1` only when `Road_1` has `0` cars and `Road_2` has cars.

```
# Inspectors p2 checks if there are cars in Road_2
    while(p2 >=0) {
# And assigns the num1[p] to the cars in num2[p2]
        num1[p] = num2[p2]
# Then, reduces the p2 by -1 as we have moved one car to Road_1
        p2--
# Also, reduces the slot (p) by -1 as we have filled 1 slot in Road_1
        p--
    }
```
         
