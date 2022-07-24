package cn.Ytangxk.javase.collection.List;

public class removeException extends Exception{

    @Override
    public String getMessage() {
        return "删除不存在元素！";
    }
}
