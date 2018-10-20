/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_programada_1;

/**
 *
 * @author Kelchan
 */
public class Cell {
    private boolean life;

    public Cell(boolean life) {
        this.life = life;
    }

    public Cell (){
    this( false );
    }
    
    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Cell{" + "life=" + life + '}';
    }
    
    
}
