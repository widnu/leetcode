package leetcodejava.array;

import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean noDup = true;

		Map colMap = new HashMap();

		for (int i = 0; i < board.length; i++) {
			Set rowSet = new HashSet();

			for (int j = 0; j < board[i].length; j++) {
				char rowItem = board[i][j];
				// System.out.println(rowItem);

				if (rowItem != '.') {
					// check dup in row
					if (noDup && !rowSet.contains(rowItem)) {
						rowSet.add(rowItem);
					} else {
						System.out.println("row dup : " + rowItem);
						noDup = false;
					}

					// check dup in col
					if (!colMap.containsKey(j)) {
						Set colSet = new HashSet();

						colSet.add(rowItem);
						colMap.put(j, colSet);

					} else {
						Set colSetTmp = (HashSet) colMap.get(j);

						System.out.println(colSetTmp + " : " + rowItem);
						if (colSetTmp.contains(rowItem)) {
							System.out.println("col dup : " + rowItem);
							noDup = false;
						} else {
							colSetTmp.add(rowItem);
						}
					}
				}

			}
		}

		return noDup;
	}
}
