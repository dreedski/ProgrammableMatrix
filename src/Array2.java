import java.util.*;

public class Array2 {
    MainProg main1 = new MainProg();
    Scanner in = new Scanner(System.in);
    //private ArrayList[][];
    private int row;
    private int column;
    String [][] newArray;



    public Array2(int row, int column, String[][] newArray) {
        this.row = row;
        this.column = column;
        this.newArray = newArray;
    }

    public void getElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("What row is the element you would like to get in? (Must be under " + row + ")");
        int userRow = in.nextInt();
        System.out.println("What column is the element you like to get in? (Must be under " + column + ")");
        int userCol = in.nextInt();
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol);
        String getElement = newArray[userRow-1][userCol-1];
        System.out.println(getElement);
    }

    public void setElement() {
        System.out.println("What row would you like your element in? (Must be under " + row + ")");
        int userRow = in.nextInt();
        System.out.println("What column would you like your element in? (Must be under " + column + ")");
        int userCol = in.nextInt();
        System.out.println("What character would you like the element to be?");
        String userChar = in.next();
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol + "\n" +
                "Char to be entered: " + userChar);
        newArray[userRow][userCol] = String.valueOf(userChar);
    }

    public void clearElement() {
        Scanner in = new Scanner(System.in);
        System.out.println("What row is the element you would like empty? (Must be under " + row + ")");
        int userRow = in.nextInt();
        System.out.println("What column is the element you like to empty? (Must be under " + column + ")");
        int userCol = in.nextInt();
        System.out.println("You have entered: " + "\n" +
                "Row " + userRow + "\n" +
                "Column " + userCol);

    }

    public void printMatrix() {
        Scanner in = new Scanner(System.in);
        String result = " ";
        System.out.println("The array is: \n");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j]);
            }
            for (String[] row: newArray)
                Arrays.fill(row, " ");
            System.out.println();
        }
    }

    public void quitProgram() {
        System.out.println("The system will now exit! BYE!!!");
        System.exit(0);
    }
}
