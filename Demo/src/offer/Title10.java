package offer;
/*
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Title10 {
	public int RectCover(int target) {
		if(target<=0){
            return -1;
        }
        int one = 1;
        int two = 2;
        int temp = 0;
        for(int i=3; i<= target; i++){
            temp = one + two;
            one = two;
            two = temp;
        }
		return temp;
    }
}
