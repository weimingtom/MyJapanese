package pri.weiqiang.myjapanese;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author  54wall 
 * @date 创建时间：2016-4-14 下午5:12:03
 * @version 1.0 
 * 为了排列输出
 * http://blog.csdn.net/arsenic/article/details/44967009
 */
public class RandomList {

//	public static <V> List<V> randomList(List<V> sourceList) {
	public  <V> List<V> randomList(List<V> sourceList) { 
	    if (sourceList == null || sourceList.size() == 0) {  
	        return sourceList;  
	    }  
	    List<V> random = new ArrayList<V>(sourceList.size());  
	    do {  
	        int index = Math.abs(new Random().nextInt(sourceList.size()));  
	        random.add(sourceList.remove(index));  
	  
	    } while (sourceList.size() > 0);  
	  
	    return random;  
	  
	}  
}
