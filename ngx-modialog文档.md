1.主要api接口：
location：ngx-modialog/providers/modal.ts    //接口类，样式模板类将继承该接口
（1）alert()；用来表示弹出框。
代码：alert(): ModalControllingContextBuilder<any> {
    throw unsupportedDropInError('alert');
  }
（2）prompt()；用来表示消息提示框。
代码：prompt(): ModalControllingContextBuilder<any> {
    throw unsupportedDropInError('prompt');
  }
（3）：comfirm()：用来表示确认框。
（4）open()： 用来在已经存在的组件中打开一个对话框。
代码：open(content: ContainerContent, config?: OverlayConfig): DialogRef<any> {}

2.bootstrap实现：
location：ngx-modialog/plugins/bootstrap
modalButton定义类：

（1）modal实现类：
    alert()：OneButtonPresetBuilder {
    return new OneButtonPresetBuilder(this, <any>{isBlocking: false});
  }
