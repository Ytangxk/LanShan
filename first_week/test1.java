
import java.util.Scanner;
import  java.util.Arrays;

public class test1 {


    public static void main(String[] args) {

        Solution test = new Solution();
        Scanner scan= new Scanner(System.in);

        Lost[] lostArray=new Lost[6];
        lostArray[0] = new BookLost("Book","知行苑7舍（15栋）","7.15", "15栋值班室" ,"《Java核心技术卷1》");
        lostArray[1] = new CardLost("Card","莘莘食堂","1.1","莘莘食堂学生值班处","2021211211","小蓝");
        lostArray[2] = new CardLost("Card","2115","11.11","二教侧门值班处","2020212118","张飞");
        lostArray[3] = new CardLost("Card","太极操场主席台","3.21","原位自取","2021211964","唐祥凯");
        lostArray[4] = new BookLost("Book","3304","5.20","原位自取","《情书》");
        lostArray[5] = new BookLost("Book","实验楼","7.17","实验楼值班处","《算法竞赛入门经典》");
        System.out.println("失物大厅：\n");
        for(Lost i :lostArray)
        {
            System.out.println(i.t0String());
            System.out.println("\n");
        }

        System.out.println("请输入丢失物品的丢失地点：");
        String key= scan.next();
        Lost[] ans=test.selectByKeyword(lostArray,key);
        if(ans.length<=0){
            System.out.println("未查询到相关结果，请尝试重新输入。");
        }
        else{
            int k=0;
            System.out.println("查询到以下结果：\n");
            for(Lost i: ans) {
                System.out.println("结果" + (k + 1) + "\n");
                System.out.println(i.t0String() + "\n");
                k++;
            }
        }

        test.sortLost(lostArray);
        System.out.println("\n按照时间排序后：\n");
        for(int i=0;i<lostArray.length;i++)
        {
            System.out.println(lostArray[i].t0String());
            System.out.println("\n");
        }
    }

}




