## java 内建的观察者模式

Observable不推荐使用：

Observable是一个类，不是接口，不可多重继承。其自带的notifyObservers方法的顺序不可控。