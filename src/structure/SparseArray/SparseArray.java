package structure.SparseArray;

import java.io.*;
import java.util.Arrays;

public class SparseArray {

    //稀疏数组
    public static void main(String[] args) throws IOException {
        int[][] array = new int[9][9];
        array[5][5] = 1;
        array[5][6] = 2;
        array[6][6] = 2;
        array[7][6] = 1;
        SparseArray sparseArray = new SparseArray();
        sparseArray.saveSparseArray(array,"./data/map.data");
        int[][] resArray = sparseArray.readSparseArray("./data/map.data");
        for (int[] row : resArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    private void saveSparseArray(int[][] array,String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if(anInt != 0) sum++;
            }
        }
        //首行声明矩阵长宽和有效数字。
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = sum;

        int k =1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] !=0){
                    sparseArray[k][0] = i;
                    sparseArray[k][1] = j;
                    sparseArray[k][2] = array[i][j];
                    k++;
                }
            }
        }
        for (int[] ints : sparseArray) {
            String line = ints[0]+","+ints[1]+","+ints[2];
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }

    private int[][] readSparseArray(String path) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(path),8192);
        String firstLine = bf.readLine();
        String[] sparse = firstLine.split(",");
        int x = Integer.parseInt(sparse[0]);
        int y = Integer.parseInt(sparse[1]);
        int[][] array = new int[x][y];
        String line = null;
        while ((line = bf.readLine())!= null){
            sparse = line.split(",");
            x = Integer.parseInt(sparse[0]);
            y = Integer.parseInt(sparse[1]);
            array[x][y] = Integer.parseInt(sparse[2]);
        }
        return array;
    }
}
