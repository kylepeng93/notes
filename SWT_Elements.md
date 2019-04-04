* SWT dont provide its own event loop.This means that the programmer explicitly(显式的) starts and check the event loop to update the user interface.
* the loop execute the readAndDispatch method => reads events from the native OS event queue and dispatches them to SWT event system.
* the loop is executed until the main shell is closed.(循环会一直执行直到主shell被关闭).when the loop is left out, the application(user interface) will be  terminated immediately.(主程序会马上被中止)
if the new custom widget is supposed to contain other widgets ,it should extend **Composite** class.Otherwise it should extend **Canvas** class.
If you want to release an SWT widget ,you have to call its dispose method.system cant release these resource automatically.(系统不会自动释放这些内存资源)
If a container is disposed ,e.g., a **Shell**,this container also release all its children.
If you create a non system colors,you have to call dispose() on them,if they are not needed anymore.(如果你创建了非系统颜色的对象，你必须调用dispose方法来释放它)
* the only case in which you need to call pack() => if a control has no layout.(唯一需要调用pack()方法的前提是没有为容器设置布局)

