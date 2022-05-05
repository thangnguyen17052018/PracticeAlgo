package hackerank.stringTopic;

public class TwoCharacters {

    public static int alternate(String s) {
        int[][] matrixFlag = new int[27][27];
        int[][] matrixCount = new int[27][27];

        if (s.length() <= 1) return 0;

        for (int k = 0; k < s.length(); k++) {
            int character = (int) s.charAt(k) - 96;

            for (int row = 1; row < matrixFlag.length; row++) {
                if (character == matrixFlag[row][character]) {
                    matrixCount[row][character] = -1;
                } else if (matrixCount[row][character] != -1) {
                    matrixFlag[row][character] = character;
                    matrixCount[row][character]++;
                }
            }

            for (int col = 1; col < matrixFlag[character].length; col++) {
                if (character == matrixFlag[character][col]) {
                    matrixCount[character][col] = -1;
                } else if (matrixCount[character][col] != -1) {
                    matrixFlag[character][col] = character;
                    matrixCount[character][col]++;
                }
            }
        }

        return findMax(matrixCount);
    }

    private static int findMax(int[][] matrixCount) {
        int max = 0;

        for (int row = 1; row < matrixCount.length; row++) {
            for (int col = 1; col < matrixCount[row].length; col++) {
                max = Math.max(matrixCount[row][col], max);
            }
        }

        return max;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(alternate(""));
        System.out.println(alternate("a"));
        System.out.println(alternate("beabeefeab"));
        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
    }

}
