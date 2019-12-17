/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinogame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author 802811
 */
public class Cactus {
    private Rectangle bounds;
    private int height, width, x, y, vx, vy, random;
    private Image img;
    private ImageIcon ii;
    
    
    public Cactus(int cWidth, int cHeight){
        this.x = cWidth/2;
        this.vx = -7;
        this.vy = 0;
        this.random = (int) (Math.random() * 10);
        if (random < 6) {
        this.ii = new ImageIcon(getClass().getResource("cactus 2  (1).png"));
                this.img = ii.getImage();
                   this.width = 35;
        this.height = 45;
        this.y = 285;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
        else {
            this.ii = new ImageIcon(getClass().getResource("Cactus 1  (1).png"));
                this.img = ii.getImage();
                   this.width = 25;
        this.height = 50;
        this.y = 280;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
        }
    }
    public void draw(Graphics g) {
        g.drawImage(img, this.x, this.y, this.width, this.height, null);
    }
    public void update(){
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle (this.x, this.y, this.width, this.height);
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
}
