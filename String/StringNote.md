### Palindrome
- If any string or number's reverse is same as main it is Palindrome
- Loop from index 0 to string/2
- If string.chatAt(i) != string.charAt(string.length() - i - 1) then not a palindrome
- Otherwise Palindrome

### Shortest displacement
- Given a string of directions ("w, e, n, s")
- Calculate shortest path from final place
- Initial position x = 0, y = 0
- Now, n: y++, s: y--, e: x++, w: x--
- sqrt((x*x)+(y*y))