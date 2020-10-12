package leetcodejava.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidSudokuTest {

	@Test
	void testIsValidSudoku() {
		ValidSudoku obj = new ValidSudoku();

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '.', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '4', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean result = obj.isValidSudoku(board);
		assertEquals(result, true);
	}

	@Test
	void testIsValidSudokuDupRow() {
		ValidSudoku obj = new ValidSudoku();

		char[][] board = { { '5', '3', '5', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '.', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '4', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean result = obj.isValidSudoku(board);
		assertEquals(result, false);
	}

	@Test
	void testIsValidSudokuDupCol() {
		ValidSudoku obj = new ValidSudoku();

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '5', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '.', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '4', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean result = obj.isValidSudoku(board);
		assertEquals(result, false);
	}
}
