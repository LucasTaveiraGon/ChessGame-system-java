/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author lucas
 */
public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1)
        {
            throw new BoardException("Error creating Board: there must be at lest 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces  = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
    
    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }
    
    public Piece piece(int row, int column){
        if (!positionExists(row, column))
        {
            throw new BoardException("Position not on the Board");
        }
        return pieces[row][column];
    }
    
    public Piece piece(Position position){
        if (!positionExists(position))
        {
        throw new BoardException("position not on the Board");
        }
        return pieces[position.getRow() ][position.getColumn() ];
    }
    
    public void placePiece(Piece piece, Position position){
       if (thereIsAPiece( position))
        {
        throw new BoardException("position not on the Board");
        }
        pieces[position.getRow() ][position.getColumn() ] = piece;
         piece.position = position;
    }
    
    private boolean positionExists(int row, int column){
     return row >= 0 && row < rows && column >=0 && column < columns;
    }
    
    public boolean positionExists(Position position){
        return positionExists(position.getRow(),position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        return piece(position) != null;
    }
}
