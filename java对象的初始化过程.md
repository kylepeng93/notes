# 构造器的使用：
  通过为类提供多个不同参数的构造器，然后在其中调用其他构造器，来达到高可维护性的目的。
  当我们需要更改这个类的初始化行为时，只需要更改最后被带调用的那个构造方法就可以了，降低了复杂性。
* new ArrayList() gives you an array list with default initial capacity (how much memory is initially allocated from the ArrayList). new ArrayList(0) gives you an array list with zero initial capacity. As soon as an element is added to the list, capacity is allocated.
* 对象是与操作内存的代码捆绑在一起的一块内存。
* 要使新创建的对象恢复良好状态，必须将其新分配的内存初始化为正确的初始状态
* Java语言有三种机制专用于确保对象的正确初始化：实例初始化器（也称为实例初始化块），实例变量初始化器和构造器。
* You cannot call this() from methods, only from constructors. If you do call this()in a constructor, you must call it first, ___before any other code in the constructor, and you can only call it once___.
* Also, the this reference passed as the first parameter to <init> is inserted by the Java compiler into the parameter list of every instance method。
* __When the compiler generates an instance initialization method, it bases it on a constructor. It gives the method the same parameter list as the constructor, and it puts the code contained in the constructor's body into the method's body. But the instance initialization method does not necessarily represent a mere compilation of the constructor with the name changed to <init> and a return value of void added. Often, the code of an instance initialization method does more than the code defined in the body of its corresponding constructor. The compiler also potentially adds code for any initializers and an invocation of the superclass's constructor.__
* When you compile a class, the Java compiler creates an instance initialization method for each constructor you declare in the source code of the class. Although the constructor is not a method, the instance initialization method is. It has a name, <init>, a return type, void, and a set of parameters that match the parameters of the constructor from which it was generated