## Equals and hashcode
1. 2 object equals -> hashcode phai bang nhau
2. 2 object !equals -> khong co rang buoc hashcode
3. hashcode = -> khong biet object equals hay khong
4. hashcode != -> object khong the equals
***
## Inner class
1. Member inner class
   > A: outer, B: inner  
        A a = new A();  
        B b = a.new B();
2. Local inner class
3. Anonymous inner class
4. Static nested class -> Not a inner class.
Cannot access class member.

***
1. ### Enum: contructor must be private  
(if not default is private when compile)
***
###Overload
- exact match
- super class
- larger primitive type
- autobox
- varargs
###Override
- access modifier must be same | more accessible
- same or more restricted type
- checked exception (sub type or same)
- Method must not be static
- return type must be same or coverant type

