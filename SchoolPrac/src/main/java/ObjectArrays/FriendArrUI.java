
package ObjectArrays;


public class FriendArrUI {
    public static void main(String[] args) {
        
       
        FriendArray fa = new FriendArray();
        fa.sort();
        System.out.println(fa.binarySearch("Norman"));
        System.out.println(fa);
    }
}
