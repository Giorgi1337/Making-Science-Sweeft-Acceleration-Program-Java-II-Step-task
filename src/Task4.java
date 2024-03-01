import java.util.HashSet;
import java.util.Set;
/*
    4. მოცემულია მთელი რიცხვების ორი მასივი. nums1 და nums2. იპოვეთ ამ მასივების საერთო
    ელემენტთა სიმრავლე, რომელიც შეიცავს უნიკალურ მთელ რიცხვებს. int[] findIntersection(int[]
    nums1, int[] nums2);

    მაგ. nums1 = [1,2,3,3,4,5], nums2 = [3,4,4,5,6,7], result = [3,4,5].
*/
public class Task4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};

        int[] result = findIntersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }
}
