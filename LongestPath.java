import java.lang.*;

public class LongestPath {
    private final int[][] TRAVEL_PATHS = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };

    private int[][] rooms, tracker;


    public int findLongestPath(int row, int col) {
        if (tracker[row][col] > -1) {
            return rooms[row][col];
        }
        int longestPath = 0;
        for (int[] direction : TRAVEL_PATHS) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (newRow < 0 || newRow >= rooms.length || newCol < 0 || newCol >= rooms.length) {
                continue;
            }
            if (tracker[newRow][newCol] > -1) {

            }
            int pathLength = 1 + findLongestPath(rooms, tracker)

            if (row + direction[0] < 0 || row + direction[0])
            try {
                trackerValue = tracker[row + direction[0]][col + direction[1]];
            } catch (IndexOutOfBoundsException e) {
                
            }
            if (tr)
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while (in.hasNext()) {
            int roomSize = in.nextInt();
            rooms = new int[roomSize][roomSize];
            tracker = new int[roomSize][roomSize];
            for (int i = 0; i < rooms.length; i++) {
                rooms[i / roomSize][i % roomSize] = in.nextInt();
                tracker[i / roomSize][i % roomSize] = -1;
            }
            int longestPath = findLongestPath(rooms, tracker, 0, 0);
            System.out.println(longestPath);
        }

        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
        }
    }
}
