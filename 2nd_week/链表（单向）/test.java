package cn.Ytangxk.javase.collection.List;

public class test {
    public static void main(String[] args){
        Link link=new Link();
        //增
        link.add(100);
        link.add(200);
        link.add(300);
        link.add("S");
        link.add(1235);
        link.add(100);
        link.add(new Object());
        link.add(897);
        //遍历
        link.it();
        //删除不存在元素
        try {
            link.remove("txk");
        } catch (removeException e) {
            e.printStackTrace();
        }
        //删除（第一次出现该元素）
        try {
            link.remove(100);
        } catch (removeException e) {
            e.printStackTrace();
        }
        System.out.println("删除元素后遍历：");
        link.it();
        //改（修改第一次出现的元素）
        System.out.println("修改元素。");
        try {
            link.modify(1,100);
        } catch (modifyException e) {
            e.printStackTrace();
        }

        //修改不存在的元素
        try {
            link.modify(12,"txk");
        } catch (modifyException e) {
            e.printStackTrace();
        }
        System.out.println("修改后的链表遍历。");
        link.it();
        //查（返回元素的下标位置）

        System.out.println("元素1所在的下标位置："+link.findIndex(1));

    }
}
