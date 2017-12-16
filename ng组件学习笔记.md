#1.@Input用来定义子父组件中的属性在父组件中进行渲染。
#2.@ViewChild可以用来让我们访问一个组件和它的方法。@ViewChild(param):其中param可以是一个组件class，也可以是字符串，如果是字符串，则在模板中使用#param来标记该模板所对应的组件类。
#3.Observable框架用来检测http响应中可能发生的任何改变，并随后将其发送回主应用程序。
#4.依赖注入是指在程序运行时实现动态添加组件功能。
#5.联合类型：指使用有限的类型组合作为某个参数的期望传值类型。例如：
##   public typeDemo(private param : string|number){}//;其中param的类型只能是string或者number中的一种，而不能是其他类型，相比于any，传值类型更加安全。
#6.交叉类型：交叉类型将多个类型合成为一个类型。例如：
##    function extend<T, U>(first: T, second: U): T & U {}    //其中T和U在使用的时候可以设置为任意你需要的类型。
