public class Main {
    public static void main(String[] args) {
        /*
         * Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
         * декартовой системе координат). В качестве свойств этого класса возьмите
         * координаты вектора. Для этого класса реализовать методы сложения, скалярного и
         * векторного произведения векторов. Создайте несколько объектов этого класса и
         * протестируйте их.
         */
        Vector vecFirst = new Vector(1, 2, 3);
        Vector vecSecond = new Vector(4, 5, 6);

        Vector vecThird = vecFirst.vectorSumma(vecSecond);
        System.out.print("The sum of vectors: ");
        vecThird.printOut();

        double b = vecFirst.scalar(vecSecond);
        System.out.println("Scalar sum: " + b);

        Vector vecFifth = vecFirst.vecMnog(vecSecond);
        System.out.print("Vector sum: ");
        vecFifth.printOut();


    }
}
