package cn.Ytangxk.javase.collection.List;

public class modifyException extends Exception{
    @Override
    public String getMessage() {
        return "修改失败，需要修改的元素不存在！";
    }
}
