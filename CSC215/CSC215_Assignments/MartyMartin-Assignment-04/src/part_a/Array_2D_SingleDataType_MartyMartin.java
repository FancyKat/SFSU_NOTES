package part_a;

public class Array_2D_SingleDataType_MartyMartin {
    public void display(String[] args) {
        // Initializing the jagged array
        char[][] jaggedArray = {
                new char[7],
                new char[4],
                new char[5],
                new char[3],
                new char[3],
                new char[2],
                new char[2]
        };

        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int alphabetIndex = 0;

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = alphabet[alphabetIndex % alphabet.length];
                alphabetIndex++;
            }
        }

        for (char[] chars : jaggedArray) {
            for (int j = 0; j < 7 - chars.length; j++) {
                System.out.print("    ");
            }
            for (char aChar : chars) {
                System.out.print(aChar + "   ");
            }
            System.out.println();
        }
    }
}