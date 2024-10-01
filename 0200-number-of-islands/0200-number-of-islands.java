class Solution {

	public void tracking(int i, int j, char[][] grid) {
if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;

        
       grid[i][j] = '0';

		tracking(i + 1, j, grid);
		tracking(i, j + 1, grid);
		tracking(i - 1, j, grid);
		tracking(i , j - 1, grid);

	}
	public int numIslands(char[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					tracking(i, j, grid);
					result++;
				}
			}
		}
		return result;
	}
}