# 1.@Input用来定义子父组件中的属性在父组件中进行渲染。
# 2.@ViewChild可以用来让我们访问一个组件和它的方法。@ViewChild(param):其中param可以是一个组件class，也可以是字符串，如果是字符串，则在模板中使用#param来标记该模板所对应的组件类。
# 3.Observable框架用来检测http响应中可能发生的任何改变，并随后将其发送回主应用程序。
# 4.依赖注入是指在程序运行时实现动态添加组件功能。
# 5.联合类型：指使用有限的类型组合作为某个参数的期望传值类型。例如：
##   public typeDemo(private param : string|number){}//;其中param的类型只能是string或者number中的一种，而不能是其他类型，相比于any，传值类型更加安全。
# 6.交叉类型：交叉类型将多个类型合成为一个类型。例如：
##    function extend<T, U>(first: T, second: U): T & U {}    //其中T和U在使用的时候可以设置为任意你需要的类型，除了基本类型之外，也可以是用户自定义类型
## 7.对于联合类型的使用，由于我们不知道最后返回的是哪种类型，所以如果返回的死string类型，可是我们使用了number类型的函数，这时候就会报错。这时，我们可以使用typescript中的类型预测断言法。比如：
```javascript
interface Bird {
    fly();
    layEggs();
}
interface Fish {
    swim();
    layEggs();
}
function getSmallPet(): Fish | Bird {
    // ...
}
let pet = getSmallPet();
pet.layEggs();
pet.swim(); 
## 当我们调用getSmallPet方法时，为了确定我们总是能使用正确的方法，我们可以定义一个函数来做类型预测。
```javascript
function isFish(pet: Fish | Bird): pet is Fish {   
    return (<Fish>pet).swim !== undefined;  // 如果pet is Fish是正确的，那么pet.swim !== undefined就是true
}
## 其中pet is Fish就是我们的预测类型。注意，pet必须和括号中定义的参数名保持一致。
## 这样，我们使用下面的代码就不会有问题了。
```javascript
if (isFish(pet)) {
    pet.swim();
}
else {
    pet.fly();
}
8.当我们定义参数时，为了提高函数的可复用性，设置可变的参数个数是很有必要的，typescript中使用?来表示可变参数，即可有可无。
function(param1 : string, param2?: number){};
上面的函数表示param2是可以缺省的。
9.函数类型：它包含两个部分：参数类型和返回值类型。注意，=>前面是参数类型定义，后面是返回值类型。
let myAdd: (x: number, y:number) => number = function(x: number,y: number): number{return x + y;}
10.默认初始化参数：当用户定义了一个undefined作为参数传递给函数时，为了让代码更加容易理解，我们可以给被调用的函数参数提前设置默认值，这样，在函数体中就不用再对参数是否被定义为undefined作出判断了。
例如： function buildName(firstName: string, lastName: string = "Smith") {
    return firstName + " " + lastName;
}
这里我们给参数lastName设置了一个默认值。
所以当我们调用该函数时，可以这样写：buildName("peng",undefined);
