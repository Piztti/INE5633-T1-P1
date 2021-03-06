package br.ufsc.inf.sin.game;


/**
 *
 * Destinada a identificar a peça no tabuleiro. É a "casa" no tabueiro
 *
 */
public class Position {
    private Integer x;
    private Integer y;

    public Position() {
    }

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object position){
        return getX() == ((Position)position).getX() && getY() == ((Position)position).getY();
    }
}
