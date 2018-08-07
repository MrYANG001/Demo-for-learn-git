package offer;
/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
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
