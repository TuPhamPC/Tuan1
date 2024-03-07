import java.util.ArrayList;
import java.util.List;

public class Main {

    // Phương thức để tìm vị trí của một số trong mảng sắp xếp tăng dần
    public static int findNumberInArray(int[] arr, int number){
        int left=0, right= arr.length-1;
        while (left<=right){
            int mid=left + (right-left)/2;
            if(arr[mid]==number){
                return mid; // Trả về vị trí nếu số được tìm thấy trong mảng
            } else if (arr[mid]<number) {
                left=mid+1; // Di chuyển left tới vị trí mid + 1 nếu số ở giữa nhỏ hơn số cần tìm
            }else {
                right=mid-1; // Di chuyển right tới vị trí mid - 1 nếu số ở giữa lớn hơn số cần tìm
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy số trong mảng
    }

    // Phương thức để tìm giao của hai mảng số nguyên
    public static List<Integer> findIntersection(int[] arr1, int[] arr2){
        List<Integer> arr=new ArrayList<>(); // Khởi tạo danh sách kết quả
        for (int i=0;i<arr1.length;i++){
            // Kiểm tra xem số từ mảng arr1 có tồn tại trong mảng arr2 không
            if (findNumberInArray(arr2,arr1[i])!=-1){
                arr.add(arr1[i]); // Nếu có, thêm số đó vào danh sách kết quả
            }
        }
        return arr; // Trả về danh sách chứa các số giao của hai mảng
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4,5, 6, 7};
        int[] arr2 = {2, 3, 5, 6};

        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println(intersection); // In danh sách số giao ra màn hình
    }
}
