1.spring的IOC容器：
IOC容器主要负责实例化，配置并且组装对象。IOC容器从XML文件中取得信息，然后做出相应的处理。IOC容器的主要任务如下：
（1）实例化应用类。
（2）配置对象
（3）组装对象之间的依赖
2.有两种类型的IOC容器，分别是：
（1）BeanFactory
（2）ApplicationContext
这两个都属于接口，而ApplicationContext接口继承了BeanFactory接口。因此属于BeanFactory的超集。ApplicationContext接口追加了AOP,消息资源处理（比如I18N），事件广播，用于WEB应用的应用层指定上下文（比如Web'ApplicationContext）。因此，使用ApplicationContext比BeanFactory更好。
3.Spring的两种注入方式的区别：
（1）构造器注入：一般来说，它适用于一些必须的依赖，对于被依赖的对象必须满足所有的属性都会被用到。
（2）setter方法注入:和构造器注入相反，它适用于一些可选的依赖，不要求被依赖的对象的所有属性全部被满足。而且，我们可以很容易的修改注入的值。不会像构造器注入那样每次使用都会创建一个新的实例，显得更加灵活。
（3）他们之前的关系：在同时使用两者的时候，setter方法注入的优先级更高。
4.