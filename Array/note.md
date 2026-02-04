### Day - 01
Creating an Array.
- Array as argument.
  - It works as like pass by reference.
  - Any changes in the array inside method will affaect the main Array.

### Day - 02
1. Linear Search
- Go through every element in the array. if found it returns the index. otherwise returns -1.

Complexity
- Time complexity: O(n)
- Space complexity: O(n)
---
2. Largest Number
- set a variable with the value -infinite.
- go through the array and compare if the value of the index is greater or not.
- if greater then change the largest value with the index value.
- compare with every index of the array.
- finally return the largest value.

### Day - 03
1. Binary Search
- Define start and end index
- loop when start <= end
- define mid in every iteration
- if the mid == key, return mid
- if mid < key, then start = mid + 1
- if mid > key, then end = mid - 1
- if key doenst exist, return -1 

  Complexity
- Time complexity: O(log n) log 2 base n
- Space complexity: O(n)

  Note
- Array should be sorted
------
2. Reverse in Array
- Reverse an array without 2nd array(space complexity will be O(n))
- Define left = 0, right = n-1
- while left <= right
- swap indexed values
- left++, right--

  Complexity
- Time complexity: O(n)
- Space complexity: O(1) // 2 variables needed only instead of new array

### Day 04
1. Sub Array
- define start index - outer loop
- define end index - inner loop
- print the values from start to end

Complexity:
- Time: O(n^3)

------
2. Sub Array Sum
- define start index - outer loop
- define end index - inner loop
- sum the values from start to end

Complexity:
- Time: O(n^3)

### Day 05
1. Max subarray sum
- define start index - outer loop
- define end index - inner loop
- sum the values from start to end
- compare max sum with current sum

Complexity:
- Time: O(n^3)
------------------
2. Max subarray sum - Prefix sum
- Calculate prefex sum
- current sum = prefix[end] - prefix[start-1]
- compare current sum and max sum

Complexity:
- Time: O(n^2)

----------
3. Max subarray sum - kadane's algorithm
- if current sum is less than 0 current sum = 0
- if current sum > 0 then compare with max sum

Complexity:
- Time: O(n)