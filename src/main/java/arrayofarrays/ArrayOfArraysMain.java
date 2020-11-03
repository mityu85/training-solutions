package arrayofarrays;

public class ArrayOfArraysMain {
    public static void main(String[] args) {
        ArrayOfArraysMain aoa = new ArrayOfArraysMain();
        /*aoa.multiplicationTable(4);
        System.out.println();*/
        aoa.printArrayOfArrays(aoa.multiplicationTable(10));
        System.out.println();
        aoa.printArrayOfArrays(aoa.triangularMatrix(10));
    }

        public int[][] multiplicationTable(int size) {
            int[][] array = new int[size][size];
            for (int i = 0; i < array.length; i++){
                //System.out.println();
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (i + 1) * (j + 1);
                    //System.out.print(array[i][j] + " ");
                }
            }
            return array;
        }

        public void printArrayOfArrays(int[][] a) {
            for (int[] i : a) {
                System.out.println();
                for (int j : i) {
                    if (j < 10) {
                        System.out.print(j + "   ");
                    } else {
                        if (j < 100) {
                            System.out.print(j + "  ");
                        } else {
                            System.out.print(j + " ");
                        }
                    }
                }
            }
        }

        public int[][] triangularMatrix(int size) {
            int[][] array = new int[size][];
            for (int i = 0; i < array.length; i++){
                array[i] = new int[i+1];
                for (int j = 0; j < i+1; j++) {
                    array[i][j] = i+1;
                }
            }
            return array;
        }
    }
