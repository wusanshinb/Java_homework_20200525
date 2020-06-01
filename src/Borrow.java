import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 肖瑶
 * @className: Borrow
 * @description: Borrow类包含了借书线程
 * @date: 2020年6月1日17:19:59
 **/

class Borrow implements Runnable {

    @Override
    public void run() {
        ReentrantLock l = new ReentrantLock();
        l.lock();
        while (Books.getCurrent() <= 3) {
            // 循环启动借书
            if (Books.getCurrent() <= 0) {
                System.out.println("暂时无书本可以借出，请等待书本的归还。");
            } else {
                Books.setCurrent(Books.getCurrent() - 1);
                System.out.println("图书馆剩余书本库存：" + Books.getCurrent() + "本。");
            }
            // 随机暂停0-4秒
            try {
                Thread.sleep(new Random().nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        l.unlock();
    }
}
