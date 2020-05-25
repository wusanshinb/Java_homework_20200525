import java.util.Random;
/**
 * @author: 肖瑶
 * @className: Borrow
 * @description: Borrow类包含了借书线程
 * @date: 2020年5月25日20:46:40
 **/
class Borrow extends Thread {
    @Override
    public void run() {
        while (Books.getCurrent() <= 3) {
            Books.Borrow();   // 循环启动还书方法
            // 暂停0-4秒
            try {
                sleep(new Random().nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

