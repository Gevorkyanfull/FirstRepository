public class Binary {
    public static void main(String[] args) {
        int result=binarySearch(new int[]{1,4,5,7},4);
        if(result==-1){
            System.out.println("Здесь нет такого числа");
        }else {
            System.out.println(result);
        }
        }
    private static int binarySearch(int[]a,int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
             int middle=low+(high-low)/2;
             if(key<a[middle]){
                 high=middle-1;
             } else if (key > a[middle]){
                 low=middle+1;
             }else{ return middle;
             }
        }
        return -1;
    }

}
