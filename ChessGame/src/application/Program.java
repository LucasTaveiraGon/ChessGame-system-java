/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import boardgame.Board;
import boardgame.Position;

/**
 *
 * @author lucas
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Position position = new Position(3,5);
        Board board = new Board(8,8);
        System.out.println(position);
    }
    
}
