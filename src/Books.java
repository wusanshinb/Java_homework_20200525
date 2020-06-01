/**
 * @author: 肖瑶
 * @className: Books
 * @description: Books类包含了存放当前图书的变量和main方法
 * @date: 2020年6月1日17:19:54
 **/

public class Books {
    private static int current = 1;  // 用于存放当前图书馆剩余的书的本数

    public static int getCurrent() {  // getter
        return current;
    }

    public static void setCurrent(int current) {
        Books.current = current;
    }

    public static void main(String[] args) {
        Borrow b = new Borrow();
        Return r = new Return();
        new Thread(b).start();
        new Thread(r).start();

    }
}