import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 肖瑶
 * @className: Return
 * @description: Return类包含了还书线程
 * @date: 2020年6月1日17:20:03
 **/

class Return implements Runnable {

    @Override
    public void run() {
        ReentrantLock l2 = new ReentrantLock();

        l2.lock();

        while (Books.getCurrent() <= 3) {

            // 循环启动还书
            if (Books.getCurrent() >= 3) {
                System.out.println("图书馆爆满，无需还书！");
                Books.setCurrent(Books.getCurrent() + 1);

            } else {
                Books.setCurrent(Books.getCurrent() + 1);
                System.out.println("图书馆剩余书本库存：" + Books.getCurrent() + "本。");
            }
            // 随机暂停0-4秒
            try {
                Thread.sleep(new Random().nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        l2.unlock();
    }
}
