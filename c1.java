 class Calculator {

    public static void main(String[] args) {
        // Perform calculations and store the results
        double additionResult = addition(5, 3);
        double subtractionResult = subtraction(8, 2);
        double multiplicationResult = multiplication(4, 6);
        double divisionResult = division(10, 2);
        double squareResult = square(5);
        double cubeResult = cube(3);
        double squareRootResult = squareRoot(25);
        double absoluteValueResult = absoluteValue(-10);
        double modulusResult = modulus(10, 3);
        double powerResult = power(2, 3);
        double maxResult = max(10, 20);
        double minResult = min(10, 20);
        double sineResult = sine(Math.PI / 2);
        double cosineResult = cosine(Math.PI);
        double tangentResult = tangent(Math.PI / 4);
        double logarithmResult = logarithm(100, 10);
        double exponentiationResult = exponentiation(2, 4);

        // Perform complex number operations
        ComplexNumber complex1 = new ComplexNumber(3, 4);
        ComplexNumber complex2 = new ComplexNumber(1, -2);

        ComplexNumber complexAdditionResult = addComplex(complex1, complex2);
        ComplexNumber complexSubtractionResult = subtractComplex(complex1, complex2);
        ComplexNumber complexMultiplicationResult = multiplyComplex(complex1, complex2);

        // Results can be used further or stored in variables for future use
    }

    // Addition function
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction function
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication function
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // Division function
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }

    // Square function
    public static double square(double num) {
        return num * num;
    }

    // Cube function
    public static double cube(double num) {
        return num * num * num;
    }

    // Square root function
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Absolute value function
    public static double absoluteValue(double num) {
        return Math.abs(num);
    }

    // Modulus function
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Maximum function
    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    // Minimum function
    public static double min(double num1, double num2) {
        return Math.min(num1, num2);
    }

    // Sine function
    public static double sine(double angle) {
        return Math.sin(angle);
    }

    // Cosine function
    public static double cosine(double angle) {
        return Math.cos(angle);
    }

    // Tangent function
    public static double tangent(double angle) {
        return Math.tan(angle);
    }

    // Logarithm function
    public static double logarithm(double num, double base) {
        return Math.log(num) / Math.log(base);
    }

    // Exponentiation function
    public static double exponentiation(double base, double exponent) {
        return Math.exp(exponent * Math.log(base));
    }

    // Complex number addition
    public static ComplexNumber addComplex(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imagPart = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realPart, imagPart);
    }

    // Complex number subtraction
    public static ComplexNumber subtractComplex(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() - num2.getReal();
        double imagPart = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(realPart, imagPart);
    }

    // Complex number multiplication
    public static ComplexNumber multiplyComplex(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imagPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imagPart);
    }
}

class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.real, real) == 0 && Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}
