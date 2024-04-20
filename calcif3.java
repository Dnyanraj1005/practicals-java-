// Import necessary libraries for matrix operations

class Calci {

    static double firstNo = 3;
    static double secondNo = 2;
    static double thirdNo = 4;
    // Sample matrices
    static double[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static double[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};


    // main method

    public static void main(String... args) {

        // created object to access all functions (non-static)
        Calci obj = new Calci();
        double result_1 = obj.mixedFracToNum(firstNo, secondNo, thirdNo);
        double result_2 = obj.division(firstNo, secondNo);
        String result_3 = obj.divToMixedFrac(firstNo, secondNo);
        String result_4 = obj.squareOfNumber(firstNo);
        String result_5 = obj.cubeOfNumber(firstNo);
        String result_6 = obj.logBase10(firstNo);
        String result_7 = obj.expFunction(firstNo);
        String result_8 = obj.squareRoot(firstNo);
        String result_9 = obj.cubeRoot(firstNo);
        double result_10 = obj.factorialOfNum(firstNo);
        double result_11 = obj.add(firstNo, secondNo);
        double result_12 = obj.sub(firstNo, secondNo);
        double result_13 = obj.mul(firstNo, secondNo);
        long result_14 = obj.permutation((long) firstNo, (long) secondNo);
        long result_15 = obj.combination((long) firstNo, (long) secondNo);
        double result_16 = obj.dmsToDecimalDegrees(45, 30, 0); // Example: 45° 30' 0" to decimal degrees
        String result_17 = obj.complexAddition(2, 3, 4, 5); // Example complex addition
        String result_18 = obj.complexSubtraction(2, 3, 4, 5); // Example complex subtraction
        String result_19 = obj.complexMultiplication(2, 3, 4, 5); // Example complex multiplication
        String result_20 = obj.complexDivision(2, 3, 4, 5); // Example complex division
        // Matrix operations
        double[][] resultMatrixAddition = obj.matrixAddition(matrixA, matrixB);
        double[][] resultMatrixSubtraction = obj.matrixSubtraction(matrixA, matrixB);
        double[][] resultMatrixMultiplication = obj.matrixMultiplication(matrixA, matrixB);
        double[][] resultMatrixTranspose = obj.matrixTranspose(matrixA);
        double resultMatrixDeterminant = obj.matrixDeterminant(matrixA);
        double[][] resultMatrixInverse = obj.matrixInverse(matrixA);
        double[] resultMatrixEigenvalues = obj.matrixEigenvalues(matrixA);
        double[][] resultMatrixEigenvectors = obj.matrixEigenvectors(matrixA);


        // printing functions
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);
        System.out.println(result_7);
        System.out.println(result_8);
        System.out.println(result_9);
        System.out.println(result_10);
        System.out.println(result_11);
        System.out.println(result_12);
        System.out.println(result_13);
        System.out.println(result_14);
        System.out.println(result_15);
        System.out.println(result_16);
        System.out.println(result_17);
        System.out.println(result_18);
        System.out.println(result_19);
        System.out.println(result_20);
        // Printing results
        System.out.println("Matrix Addition:");
        obj.printMatrix(resultMatrixAddition);
        System.out.println("\nMatrix Subtraction:");
        obj.printMatrix(resultMatrixSubtraction);
        System.out.println("\nMatrix Multiplication:");
        obj.printMatrix(resultMatrixMultiplication);
        System.out.println("\nMatrix Transpose:");
        obj.printMatrix(resultMatrixTranspose);
        System.out.println("\nMatrix Determinant:");
        System.out.println(resultMatrixDeterminant);
        System.out.println("\nMatrix Inverse:");
        obj.printMatrix(resultMatrixInverse);
        System.out.println("\nMatrix Eigenvalues:");
        obj.printArray(resultMatrixEigenvalues);
        System.out.println("\nMatrix Eigenvectors:");
        obj.printMatrix(resultMatrixEigenvectors);
    }

    public String toString() {
        return "MATHS ERROR";
    }

    // function 1 - mixed fraction to number

    public double mixedFracToNum(double a, double b, double c) {

        // check whether a or b = 0, if so, return b
        if (a == 0 || c == 0) {
            return b;
        }

        // check whether b = 0, if so, return c*a
        else if (b == 0) {
            return c * a;
        }

        // check if a,b and c != 0, then return c*a+b, which is our desired output too
        else {
            return c * a + b;
        }
    }

    // function 2 - division

    public double division(double a, double b) {

        // check if b = 0
        if (b == 0) {
            return 0;
        }

        // if not so, then do operation
        else {
            return a / b;
        }
    }

    // function 3 - like division(a/b) to mixed fraction

    public String divToMixedFrac(double a, double b) {
        int gcd = 1;
        int i = 2;
        int least = (int) (Math.min(a, b));
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }

        // calculate the simplified numerator and denominator
        double simpNumerator = (a / gcd);
        double simpDenominator = (b / gcd);

        // do div to mixed fraction
        double quotient = (int) (simpNumerator / simpDenominator);
        double numerator = simpNumerator % simpDenominator;
        double denominator = simpDenominator;

        // check if b = 0
        if (b == 0) {
            return "0";
        }

        // check if a >= b
        else if (a >= b) {
            return quotient + " ¬ " + numerator + " ¬ " + denominator;
        }

        // check if a < b
        else {
            return numerator + " ¬ " + denominator;
        }
    }


    // function 4 - cube of a number

    public String cubeOfNumber(double a) {

        // check if a = 0, return error
        if (a == 0) {
            return toString();
        }

        // otherwise return cubeRoot
        else {
            double result = (a * a * a);
            return Double.toString(result);
        }
    }

    // function 5 - square of a number

    public String squareOfNumber(double a) {

        // check if a = 0, return error
        if (a == 0) {
            return toString();
        }

        // otherwise return squareRoot
        else {
            double result = a * a;
            return Double.toString(result);
        }
    }

    // function 6 - logarithm of base 10

    public String logBase10(double a) {

        // check if a = 0, return error
        if (a == 0) {
            return "Maths ERROR";
        }

        // otherwise return log base 10
        else {
            double result = Math.log10(a);
            return Double.toString(result);
        }
    }

    // function 7 - exponential function e^x

    public String expFunction(double a) {
        double result = Math.exp(a);
        return Double.toString(result);
    }

    // function 8 - squareRoot

    public String squareRoot(double a) {
        double result = Math.sqrt(a);
        return Double.toString(result);
    }

    // function 9 - cubeRoot

    public String cubeRoot(double a) {
        double result = Math.cbrt(a);
        return Double.toString(result);
    }

    // function 10 - factorial of a number

    public double factorialOfNum(double a) {

        int fact = 1;
        for (int num = 1; num <= a; num++) {
            fact = fact * num;
        }
        System.out.println(fact);
        return fact;
    }

    // function 11 - addition of two numbers

    public double add(double a, double b) {
        return a + b;
    }

    // function 12 - subtraction of two numbers

    public double sub(double a, double b) {
        return a - b;
    }

    // function 13 - multiplication of two numbers

    public double mul(double a, double b) {
        return a * b;
    }

    // function 14 - permutation

    public long permutation(long a, long b) {
        return (long) (factorialOfNum(a) / factorialOfNum(a - b));
    }

    // function 15 - combination

    public long combination(long a, long b) {
        return (long) (factorialOfNum(a) / (factorialOfNum(b) * factorialOfNum(a - b)));
    }

    //new
    public double dmsToDecimalDegrees(int degrees, int minutes, int seconds) {
        return degrees + minutes / 60.0 + seconds / 3600.0;
    }

    public double[] decimalDegreesToDMS(double decimalDegrees) {
        int degrees = (int) decimalDegrees;
        decimalDegrees = (decimalDegrees - degrees) * 60;
        int minutes = (int) decimalDegrees;
        decimalDegrees = (decimalDegrees - minutes) * 60;
        int seconds = (int) decimalDegrees;
        return new double[]{degrees, minutes, seconds};
    }

    public String complexAddition(double real1, double imaginary1, double real2, double imaginary2) {
        double realResult = real1 + real2;
        double imaginaryResult = imaginary1 + imaginary2;
        return realResult + " + " + imaginaryResult + "i";
    }

    public String complexSubtraction(double real1, double imaginary1, double real2, double imaginary2) {
        double realResult = real1 - real2;
        double imaginaryResult = imaginary1 - imaginary2;
        return realResult + " + " + imaginaryResult + "i";
    }

    public String complexMultiplication(double real1, double imaginary1, double real2, double imaginary2) {
        double realResult = real1 * real2 - imaginary1 * imaginary2;
        double imaginaryResult = real1 * imaginary2 + real2 * imaginary1;
        return realResult + " + " + imaginaryResult + "i";
    }

    public String complexDivision(double real1, double imaginary1, double real2, double imaginary2) {
        double denominator = real2 * real2 + imaginary2 * imaginary2;
        double realResult = (real1 * real2 + imaginary1 * imaginary2) / denominator;
        double imaginaryResult = (real2 * imaginary1 - real1 * imaginary2) / denominator;
        return realResult + " + " + imaginaryResult + "i";
    }

    // Function for matrix addition
      public double[][] matrixAddition(double[][] matrixA, double[][] matrixB) {
        double[][] result = new double[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }
    

    // Function for matrix subtraction
    public double[][] matrixSubtraction(double[][] matrixA, double[][] matrixB) {
        double[][] result = new double[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Function for matrix multiplication
    public double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int p = matrixB[0].length;
        double[][] result = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Function for matrix transpose
    public double[][] matrixTranspose(double[][] matrixA) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        double[][] result = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrixA[i][j];
            }
        }
        return result;
    }

    // Function for matrix determinant
    public double matrixDeterminant(double[][] matrixA) {
        if (matrixA.length != matrixA[0].length) {
            throw new IllegalArgumentException("Matrix must be square for determinant calculation.");
        }
        int n = matrixA.length;
        if (n == 1) {
            return matrixA[0][0];
        }
        double determinant = 0;
        for (int j = 0; j < n; j++) {
            determinant += Math.pow(-1, j) * matrixA[0][j] * matrixDeterminant(minor(matrixA, 0, j));
        }
        return determinant;
    }

    // Function to get minor of a matrix
    private double[][] minor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0, l = 0; j < n; j++) {
                if (j == col) {
                    continue;
                }
                minor[k][l] = matrix[i][j];
                l++;
            }
            k++;
        }
        return minor;
    }

    // Function for matrix inverse
    public double[][] matrixInverse(double[][] matrixA) {
        if (matrixA.length != matrixA[0].length) {
            throw new IllegalArgumentException("Matrix must be square for inverse calculation.");
        }
        int n = matrixA.length;
        double determinant = matrixDeterminant(matrixA);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, cannot invert.");
        }
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = Math.pow(-1, i + j) * matrixDeterminant(minor(matrixA, i, j)) / determinant;
            }
        }
        return matrixTranspose(inverse);
    }

    // Utility function to print matrix
    public void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

   
}

