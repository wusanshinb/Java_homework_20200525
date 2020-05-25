第三周作业

任务题目：图书馆借书与还书模拟

一、功能要求：

\1.    需要通过多线程的手段模拟图书馆的借书与还书过程，为此需要设计两个线程：借书线程与还书线程；在日常生活中，借书与还书存在因果逻辑关系，但是在此题目中，借书线程与还书线程是否产生是相互独立的，互不影响的

\2.    借书线程功能：每执行一个借书线程，图书馆内书本库存数目减1，并且借书完成后在控制台打印图书馆剩余书本库存；如果发现图书馆书本库存为0，则会在控制台提示暂时无书本可以借出，并且**等待**一个还书线程正常执行完成后再**继续执行**借书过程

\3.    还书线程功能：每执行一个还书线程，图书馆内书本库存数目加1，并且还书完成后在控制台打印图书馆剩余书本库存；如果发现图书馆书本库存已满，则会在控制台提示无需还书，并且提前**终止**线程

\4.    假定程序初始化时图书馆书本库存为1，库存上限为3（即有2本处于已经借出的状态）

二、其他要求：

\1.   在与要求不冲突的前提下，借书线程与还书线程的产生方式可自定义（可以随机产生，也可以固定产生），但是每个线程至少独立产生5次

\2.   要求使用面向对象、多线程、生产者与消费者的思想实现此程序

\3.   每一个类独立使用一个java文件编写，不同的类写在不同的java文件里

\4.   所有的java文件放在同一个package下

\5.   除了需要或将要在控制台的打印的字符外，尽可能避免使用中文或者拼音（注释除外）

\6.   要求编写readme文档，描述各个java文件的功能，并与java文件放在同一个目录下

\7.   代码要求写注释，要求有缩进

\8.   提交至github上，并将链接邮件到各位导师的邮箱