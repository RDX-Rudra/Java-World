public class P3_4_79 {
    public static boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m]; // creates a boolean matrix to track visited cells
        char[] wordChar = word.toCharArray(); // converts the word to a char array
        if (wordChar.length > n * m)
            return false;
        int counts[] = new int[256]; // creates an array to store the count of each character
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                counts[board[i][j]]++; // counts the occurrences of each character in the board
            }
        }
        int len = wordChar.length;
        // Reverses the wordChar array if the count of the first character is greater than the count of the last character
        for(int i=0; i<len/2; i++)
        {
            if(counts[wordChar[i]]>counts[wordChar[len-1-i]]){
                for(int j=0; j<len/2; j++)
                {
                    char temp = wordChar[j];
                    wordChar[j]=wordChar[len-1-j];
                    wordChar[len-1-j]=temp;
                }
                break;
            }
        }
        // Decrements the count of characters in counts array according to the characters in the word
        for (char c : wordChar) {
            if (--counts[c] < 0)
                return false;
        }
        // Iterates through each cell in the board to check if the word exists starting from that cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit(board, wordChar, 0, i, j, n, m, visited))
                    return true;
            }
        }
        return false;
    }

    private static boolean visit(char[][] board, char[] word, int start, int x, int y,
            int n, int m, boolean[][] visited) {
        if (start == word.length)
            return true; // If the entire word has been found, return true
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y])
            return false; // If the current cell is out of bounds or already visited, return false
        if (word[start] != board[x][y])
            return false; // If the character at the current cell does not match the character in the word, return false
        visited[x][y] = true; // Mark the current cell as visited
        // Recursively visit neighboring cells to find the next character in the word
        boolean found = visit(board, word, start + 1, x + 1, y, n, m, visited)
                || visit(board, word, start + 1, x - 1, y, n, m, visited)
                || visit(board, word, start + 1, x, y + 1, n, m, visited)
                || visit(board, word, start + 1, x, y - 1, n, m, visited);
        visited[x][y] = false; // Backtrack: mark the current cell as not visited
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    
}
