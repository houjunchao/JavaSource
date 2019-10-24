/**
 * 以下实例演示了如何使用 remove () 方法来删除数组元素
 */
import java.util.ArrayList;
 
public class RemoveInClass {
    public static void main(String[] args)  {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);
        objArray.remove("第 0 个元素");
        System.out.println("数组删除元素后："+objArray);
    }
}

