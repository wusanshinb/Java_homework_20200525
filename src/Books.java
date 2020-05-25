/**
 * @author: 肖瑶
 * @className: Books
 * @description: Books类包含了借书与还书的方法
 * @date: 2020年5月25日20:46:40
 **/

public class Books {
    private static int current = 1;  // 用于存放当前图书馆剩余的书的本数

    public static int getCurrent() {  // getter
        return current;
    }

    public static void Borrow() {  // 借书方法
        if (current <= 0) {
            System.out.println("暂时无书本可以借出，请等待书本的归还。");
        } else {
            current--;
            System.out.println("图书馆剩余书本库存：" + current + "本。");
        }
    }

    public static void Return() {   // 还书方法
        if (current == 3) {
            current++;
            System.out.println("图书馆库存已满，无需还书。");
        } else {
            current++;
            System.out.println("图书馆剩余书本库存：" + current + "本。");
        }
    }
}