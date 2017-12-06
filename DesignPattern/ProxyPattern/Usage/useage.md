[代理模式](http://www.jianshu.com/p/a8aa6851e09e)
#代理模式
1. 代理类与委托类实现同一接口
2. 委托类实现功能，在代理类的方法中引用委托类的同名方法
3. 外部类调用委托某个方法，直接以接口指向代理类的实例

#场景描述
1. 当我们想要隐藏某个类时，可以为其提供代理类
2. 当一个雷需要对不同的调用者提供不同的调用权限是，可以使用代理类
3. 当我们要扩展某个类的某个功能时，可以使用代理模式，在代理类中进行简单扩展