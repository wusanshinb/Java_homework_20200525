# Java_homework_20200525
 图书馆系统

任务描述：[TaskDescription](/TaskDescription.md)

文件描述：src包中：

1.Books类包含了存放当前图书的变量和main方法

2.Borrow类包含了借书线程

3.Return类包含了还书线程

​		星期天晚上收到的作业，看了一眼描述是关于多线程的。

​		星期一下午没课就刷了一下午的Java课程，把上周面向对象剩余的知识看完了，看了一些关于线程相关的，晚上花了半个小时把程序写好了QAQ。

​		这道题我就用了最简单的重写Thread类的run方法构造了借书线程要做的事，而还书线程直接写在了main方法里面，这样运行main方法的时候就刚好有2个线程（Borrow线程和main线程）。



-------------------

​		一周之后，感觉作业太简陋了，加上了线程安全相关（lock锁机制）2020年6月1日17:24:17

-----------



​		学到了不少，继续加油！

完成时间：2020年5月25日22:38:28

完成人：肖瑶

