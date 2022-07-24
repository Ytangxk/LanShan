public class Lost{
    /*
失物类Lost
属性：
失物名称
丢失地点
丢失时间（按照浮点数大小排序）

 */
    private String kind;
    private String addr;
    private String time;
    private String back;

    public Lost(String kind,String addr,String time,String back)
    {
        this.kind=kind;
        this.addr=addr;
        this.time=time;
        this.back=back;
    }

    public String getKind(){
        return kind;
    }

    public void setKind(String kind){
        this.kind=kind;
    }

    public String getAddr(){
        return addr;
    }
    public void setAddr(String addr){
        this.addr=addr;
    }
    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time=time;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String t0String()
    {
        return "丢失物品种类：" + kind + "\n丢失物地点："+ addr + "\n拾取时间：" + time + "\n领取地点：" + back;
    }
}