
import java.util.ArrayList;

public class Solution {
    /**
     * 失物排序方法
     * @param lostArray 待排序的失物数组
     */
    public void sortLost(Lost[] lostArray){
        for (int i = 0; i < lostArray.length - 1; i++) {
            for (int j = i + 1; j < lostArray.length; j++) {
                if (Float.parseFloat(lostArray[j - 1].getTime()) < Float.parseFloat(lostArray[j].getTime())) {
                    Lost temp = lostArray[j - 1];
                    lostArray[j - 1] = lostArray[j];
                    lostArray[j] = temp;
                }
            }
        }
    }


    /**
     * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
     * @param lostArray 失物数组
     * @param keyword 用户输入的关键字
     * @return 返回查找到的失物
     */
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        ArrayList<Lost> foundedArray = new ArrayList<>();
        for(Lost i: lostArray )
        {
            if(i.getAddr().contains(keyword)) {
                foundedArray.add(i);
            }
            //else if(i.getKind().contains(keyword)){
              //  foundedArray.add(i);
            //}
        }
        Lost[] result = new Lost[foundedArray.size()];
        for( int i=0 ; i<foundedArray.size() ; i++)
        {
            result[i]=foundedArray.get(i);
        }
        return result;
    }

}
