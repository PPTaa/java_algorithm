

public class MinMax {
    // a,b최솟값
    public static int min(int a, int b) {
        return a < b ? a : b; 
    }
    // abc최솟값
    public static int min(int a, int b,int c) {
        int min = a;
        if (min>b) {
            min = b;
        }
        if (min>c) {
            min = c;
        }
        return min; 
    }
    // 배열 a의 최솟값
    public static int min(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
    // 배열 a의 최솟값을 가지는 모든 요소의 인덱스를 저장한 배열
    public static int[] minIndexArray (int[] a){
        int min = min(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (min == a[i]) {
                count += 1;
            }
        }
        int idx = 0;
        int[] minArray = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (min == a[i]) {
                minArray[idx++] = i ; 
            }
        }
        return minArray;
    }
    // ab최댓값
    public static int max (int a, int b) {
        return a>b? a:b;
    }
    // abc최댓값
    public static int max (int a, int b, int c) {
        int max = a;
        if (max<b) {
            max = b;
        }
        if (max<c) {
            max = c;
        }
        return max;
    }
    // 배열 a의 최댓값
    public static int max (int[] a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    // 배열a의 최댓 값을 가지는 모든 요소의 인덱스를 배열로 반환
    public static int[] maxIndexArray(int[] a){
        int max = max(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                count += 1;
            }
        }
        int tmp_idx = 0;
        int[] tmp = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                tmp[tmp_idx++] = i;
            }
        }

        return tmp;
    }

}