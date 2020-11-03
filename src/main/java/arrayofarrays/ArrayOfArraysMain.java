package arrayofarrays;

public class ArrayOfArraysMain {
    public static void main(String[] args) {
        ArrayOfArraysMain aoa = new ArrayOfArraysMain();
        aoa.multiplicationTable(4);
        System.out.println();
        aoa.printArrayOfArrays(aoa.multiplicationTable(4));
    }

        int[][] multiplicationTable(int size) {
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
                    System.out.print(j + " ");
                }
            }
        }
    }
