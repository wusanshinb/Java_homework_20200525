import java.util.Random;

/**
 * @author: 肖瑶
 * @className: Return
 * @description: Return类包含了还书线程（main线程）与主函数，用于启动程序
 * @date: 2020年5月25日20:46:36
 **/
public class Return {
    public static void main(String[] args) throws InterruptedException {
        // 启动借书线程
        new Borrow().start();
        // 启动还书线程（main线程）
        while (Books.getCurrent() <= 3) {
            Books.Return();
            // 暂停0-4秒
            Thread.sleep(new Random().nextInt(4000));
        }
    }
}
