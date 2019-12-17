/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinogame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
/**
 *
 * @author 802811
 */
public class Bird {
    private Image img;
    private ImageIcon ii;
    private Rectangle bounds;
    private int height, width, x, y, vx, vy;
    
    public Bird(int cWidth, int cHeight) {
        this.bounds =  new Rectangle(this.x, this.y, this.width, this.height);
        this.ii = new   ImageIcon(getClass().getResource("bird flap 2 clone.gif"));
        this.img = ii.getImage();
        this.x = 1040;
        this.y = (int) (Math.random() * 60) + 210;
        this.width = 50;
        this.height =  50;
        this.vx = -7;
        this.vy = 0;
    }
     public void draw(Graphics g) {
        g.drawImage(img, this.x, this.y,
                this.width, this.height, null);
    }
      public void update(){
    this.x += vx;
    this.y += vy;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
      
}
