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
public class Dino {
    private boolean alive;
    private Image img;
    private ImageIcon ii;
    private Rectangle bounds;
    private int height, width, x, y, vx, vy;
    
    
    public Dino(int cWidth, int cHeight) {
        this.alive = true;
        this.x = 100;
        this.y = 275;
        this.vx = 0;
        this.vy = 0;
        this.height = 60;
        this.width = 60;
        this.ii = new ImageIcon(getClass().getResource("running right foot down.gif"));
                            this.img = ii.getImage();
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, this.x, this.y,
                this.width, this.height, null);
    }
    public void update(){
    this.x += vx;
    this.y += vy;
    this.bounds = new Rectangle(this.x, this.y, this.width, this.height);                                    
    }
   
    public void Jump() {
        
    }
    public void Duck() {
        
    }
    public void Stand() {
        
    }
    public void Fall() {
        
    }
    }

