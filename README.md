# DSA Leet Code 2026

In this repository, I have solved/solving `Data Structures & Algorithms` problems from Leet Code. The goal is to understand the concepts of DSA and upskill my knowledge with regards to DSA. Also, I commit this myself to solve a problem daily and commit to this repository.

### Programming Language

`JAVA`

I decided to use JAVA because this language is flexible to use and my preferred language for solving data structures problems. As I want something that is simple and easy to write, compile. I focused mainly on not to use libraries, packages for solving equations as I wanted to write methods on my own. Also, I do not want to be much simpler like Python which is one of the main reason I am going with Java.

### Problems

#### 1. Merge Sorted Array

Given two integer arrays `num1` and `num2`, and these arrays are sorted in non-descending order, and two integers `m` and `n` represents the number of elements in `num1` and `num2` respectively.

Merge both `num1` and `num2` into a single array sorted in non-descending order **`(ascending order)`**.

The final sorted array should not be returned by/from a function but instead be stored inside the array `num1`. To accommodate this, `num1` has a length of `m + n`, where the first m elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `num2` has a length of `n`.

**EXAMPLE:**

*Input:* num1 = [1, 2, 3, 0, 0, 0], m = 3, num2 = [2, 5, 6], n = 3

*Output:* [1,2,2,3,5,6]

*Explanation:* The array we merged are num1 and num2. `0` are ignored as given in the question.

**SUMMARY:**

- Two given integer array and sorted in ascending order (smallest to largest).
- Two numbers given are the length of the two integer array.
- The end result must be stored in array `num1` meaning we are merging `num2` into `num1`.
- If the array has `0` then it is ignored meaning it is not counted as an element.
- The length of the final output is simply `m + n`.

**APPROACH:**


