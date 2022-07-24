public class BookLost extends Lost{

    private String bookName;

    public BookLost(String kind , String addr , String time , String back , String bookName){
        super(kind, addr, time, back);
        this.bookName=bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String t0String(){
        return "书籍名称：" + bookName +  "\n丢失地点："
                + super.getAddr() + "\n丢失时间：" + super.getTime() + "\n领取地点 "+super.getBack();
    }
}