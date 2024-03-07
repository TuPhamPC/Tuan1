public class Main {

    public static int[] findFirstAndLastPosition(int[] nums, int target) {
        int[] result = new int[]{-1, -1};

        // Tìm vị trí đầu tiên
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                // Tìm vị trí đầu tiên bên trái mid
                int firstIndex = mid;
                while (firstIndex >= 0 && nums[firstIndex] == target) {
                    firstIndex--;
                }
                result[0] = firstIndex + 1;

                // Tìm vị trí cuối cùng bên phải mid
                int lastIndex = mid;
                while (lastIndex < nums.length && nums[lastIndex] == target) {
                    lastIndex++;
                }
                result[1] = lastIndex - 1;

                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7,8, 15};
        int target = 8;
        int[] result = findFirstAndLastPosition(nums, target);
        if (result[0]==result[1]){
            result[1]=-1;
        }

        System.out.println("Vị trí đầu tiên: " + result[0]);
        System.out.println("Vị trí cuối cùng: " + result[1]);
    }
}
