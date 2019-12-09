/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinogame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author 802811
 */
public class World extends JPanel {
    private Timer timer;
    private Dino dino;
    private Cactus cactus;
    private Bird bird;
    private Rectangle floor1;
    private Rectangle floor;
    private int x, y, width, height, x1, width2; 
    
    
    public World () {
        super();
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(),1000, 1000/30);
        dino = new Dino(300,275);
        cactus = new Cactus(840, 275);
        bird = new Bird (840, (int)(Math.random() * 100)+275);
        floor = new Rectangle(175, 275, 350, 20);
        int x = 0;
        int y = 275;
        int width = 75;
        int height = 10;
        int x1 = 155;
        int width2 = 650;
        
        
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        dino.draw(g);
        cactus.draw(g);
        bird.draw(g);
        g.setColor(Color.GRAY);
        g.fillRect(135, 325, 650, 3);
        g.fillRect(0, 325, 95, 3);
    }
    
    
    private class ScheduleTask extends TimerTask {
        @Override
        public void run(){
            repaint();
            dino.update();
            cactus.update();
            bird.update();
        }
    }
    
      public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                  dino.Duck();
                  }
          else if (e.getKeyCode() == KeyEvent.VK_UP) {
              dino.Jump();
          }
      }
      
      public void keyReleased(KeyEvent e) {
          if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              dino.Stand();
          }
          if (e.getKeyCode() == KeyEvent.VK_UP) {
              dino.Fall();
          }
      }
}
