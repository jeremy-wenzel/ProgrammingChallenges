def n_queens(input):
    board = [[False] * len(input) for i in range(len(input))]
    for i in range(0, len(input)):
        board[i][(input[i] - 1)] = True

    for x in range(len(input)):
        y = input[x] - 1

        for i in range(x + 1, len(input)):
            # Check if Queens are in the same row
            if board[i][y]:
                return False

            diff = i - x
            # Check diagonal up without going out of bounds
            if y + diff < len(input) and board[i][y + diff]:
                return False
            # Check diagonal down without going out of bounds
            elif y - diff >= 0 and board[i][y - diff]:
                return False

    # No issues found
    return True

