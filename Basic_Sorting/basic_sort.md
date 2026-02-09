### Buble sort
- Outer loop - iteration it compare from index 0 to ((n-1)  with next index value
- Inner loop - 0 to ((n - 1) - turn)
- If arr[i] > arr[i+1] then swap (Ascending)
- If arr[i] < arr[i+1] then swap (Descending)

Complexity:
- Time: Worst case: O(n^2)
        Best case: O(n)
- Space: O(n)

---

### Selection sort
- In every iteration select the smallest and put it at front one after another.
- Outer loop 0 to n-1
- Inner loop i+1 to n

Complexity:
- Time: O(n^2)
- Space: O(n)

### Insertion sort
- Start a[0] as sorted part and rest is unsorted part
- select every value and find the right position in sorted part.
- Insert the value.

Complexity:
- Time: O(n^2)
- Space: O(n)
