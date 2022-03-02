/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Position;

/**
 *
 * @author lucas
 */
public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'A' || column > 'H' || row < 1 || row > 8)
        {
            throw new ChessException("Invalid Value. Valid values are from A1 to H8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /*    matrix_row = 8 - chess_row
    matrix_column = chess_column - 'a';      */
    protected Position toPosition() {
        return new Position(8 - row, column - 'A');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('A' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

}
