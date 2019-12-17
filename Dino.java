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
    private Image img, img2, img3;
    private ImageIcon ii, ii2, ii3;
    private Rectangle bounds;
    private int height, width, x, y, vx, vy, i;
    
    
    public Dino(int cWidth, int cHeight) {
        this.i = 61;
        this.alive = true;
        this.x = 100;
        this.y = 275;
        this.vx = 0;
        this.vy = 0;
        this.height = 60;
        this.width = 45;
        this.ii = new ImageIcon(getClass().getResource("running right foot down (1).gif"));
                            this.img = ii.getImage();
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
        this.ii2 = new ImageIcon(getClass().getResource("Dino (2).png"));
        this.img2 = ii2.getImage();
        this.ii3 = new ImageIcon(getClass().getResource("run ducking left foot down  clone.gif"));
        this.img3 = ii3.getImage();
        
    }
    
    public void draw(Graphics g) {
        g.drawImage(img, this.x, this.y,
                this.width, this.height, null);
    }
    public void update(){
    i++;
    this.x += vx;
    this.y += vy;
    this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    if (i <= 5) {
              this.vy = -16;
              this.vx = 0;
          }
    else if (i > 5 && i < 8) {
        this.vy = -8;
    }
    
        else if (i > 8 & i < 12) {
                this.vy = 0;
                this.vx = 0;
         }
        else if (i >= 12 && i < 15) {
            this.vy = 8;
        }
          else if (i >= 15 & i < 20) {
              this.vy = 16;
          }
          else if (i == 20) {
              this.img = ii.getImage();
              this.vy = 0;
              this.vx = 0;
              this.x = 100;
          
          
      }
    }
   
    public void Jump() {
        this.img = img2;
        i = 0;
       
            
          
        
            
    }
    public void Duck() {
                        this.img = img3;
                        this.height = 50;
                        this.y = 290;
    }
    public void Stand() {
                        this.img = ii.getImage();
                        this.height = 60;
                        this.y = 275;
    }
    public void Fall() {
        //for (int i = 0;i < 30; i++ ) {
         //if (i >= 31 && i < 60) {
              //this.vy = 12;
          //}
          //if (i == 60) {
              //this.img = ii.getImage();
              //this.vy = 0;
          //}
        
        //}
    } 
    public void Die() {
        
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

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Image getImg2() {
        return img2;
    }

    public void setImg2(Image img2) {
        this.img2 = img2;
    }

    public ImageIcon getIi() {
        return ii;
    }

    public void setIi(ImageIcon ii) {
        this.ii = ii;
    }
    
    }

