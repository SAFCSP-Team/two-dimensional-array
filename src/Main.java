public class Main {
    public static void main(String[] args) {
      int[][] array = new int[2][3];
      int rows = array.length;
      int cols = array[0].length;
      System.out.println("rows = " + rows + "\n" + "columns = " + cols);
      for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
          System.out.print(array[i][j] + " ");
        }}
        System.out.println();
        array[0][0] = 9;
        for (int x = 0; x < rows; x++){
      for (int y = 0; y < cols; y++){
          System.out.print(array[x][y] + " ");}}
        }

      }

