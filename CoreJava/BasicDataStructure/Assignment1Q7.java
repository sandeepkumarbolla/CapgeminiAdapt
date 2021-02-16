class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                return true;
            }
        }
    return false;
    }
}
public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        SearchArray check = new SearchArray();
        if(check.searchArray(arr,valueToCheck)){
            System.out.println("yes it's present");
        }
        else {
            System.out.println("No it is not present");
        }
    }}
