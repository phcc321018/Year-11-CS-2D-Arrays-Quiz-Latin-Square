public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {
        int sum=0;
        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum1(int rowSize) {
        return (rowSize * (rowSize + 1)) / 2;
    }


    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every row's sum in array2d is equal to checkSum1,
     *         AND that every row's product in array2d is equal to checkSum2
     */
    public static boolean isLatinRows(int[][] array2d, int checkSum1, int checkSum2) {
        int numRows = array2d.length;
        int numCols = array2d[0].length;

        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            int rowProduct = 1;

            for (int j = 0; j < numCols; j++) {
                rowSum += array2d[i][j];
                rowProduct *= array2d[i][j];
            }

            if (rowSum != checkSum1 || rowProduct != checkSum2) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every column's sum in array2d is equal to checkSum1,
     *         AND that every column's product in array2d is equal to checkSum2
     */
    public static boolean isLatinColumns(int[][] array2d, int checkSum1, int checkSum2) {
        int numRows = array2d.length;
        int numCols = array2d[0].length;

        for (int j = 0; j < numCols; j++) {
            int colSum = 0;
            int colProduct = 1;

            for (int i = 0; i < numRows; i++) {
                colSum += array2d[i][j];
                colProduct *= array2d[i][j];
            }

            if (colSum != checkSum1 || colProduct != checkSum2) {
                return false;

            }
        }

        return true;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d) {
        int checkSum1 = targetCheckSum1(array2d.length);
        int checkSum2 = targetCheckSum2(array2d.length);

        return isLatinRows(array2d, checkSum1, checkSum2) && isLatinColumns(array2d, checkSum1, checkSum2);
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
