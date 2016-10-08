1. Other languages implement strings as Character arrays, but Java implements strings as objects of type String.

2. In Java once a String object is created, we cannot change the characters that comprise that string. But, we can still perform all types of string operations on it. The difference is that each time you need an altered version of an existing string, a new String object is created that contains the modifications. The original string is left unchanged. The reason for using this approach is that, fixed and immutable strings can be implemented more efficiently than changeable ones.

3. In Java 2, version 1.4, both String and StringBuffer implement the CharSequence interface.
