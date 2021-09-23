package LeetCode_09_23;

/**
 * @author jtl
 * @date 2021/9/23 18:38
 * 题目：165. 比较版本号
 * 网址：https://leetcode-cn.com/problems/compare-version-numbers/
 * 思路：将版本号分别放入两个一样长的int[]中。分别将int[]中的每个元素进行比较。注意分割时符号需要加两个"\\"
 * 状态：完成
 */

class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int max = Math.max(v1.length, v2.length);

        int[] intV1 = new int[max];
        int[] intV2 = new int[max];

        for (int i = 0; i < v1.length; i++) {
            intV1[i] = Integer.valueOf(v1[i]);
        }

        for (int i = 0; i < v2.length; i++) {
            intV2[i] = Integer.valueOf(v2[i]);
        }

        for (int i = 0; i < max; i++) {
            if (intV1[i]>intV2[i]){
                return 1;
            }else if (intV1[i]<intV2[i]){
                return -1;
            }
        }


        return 0;
    }
}
