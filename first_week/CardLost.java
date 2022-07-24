public class CardLost extends Lost{
    private String stuId;
    private String stuName;
    public CardLost(String kind,String addr,String time , String back , String stuId,String stuName){
        super(kind, addr, time,back);
        this.stuId=stuId;
        this.stuName=stuName;
    }
    public String getStuId(){
        return stuId;
    }
    public void setStuId(){
        this.stuId=stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String t0String(){
        return "学生姓名：" + stuName + "\n一卡通号："+ stuId
                + "\n丢失地点：" + super.getAddr() + "\n拾取时间：" + super.getTime() +"\n领取地点" +super.getBack();

    }

}