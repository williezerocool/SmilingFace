/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smilingface;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author kendrabooker
 */
public class SmilingFace extends Canvas{

    public void paint( Graphics g )
    {   
        g.setColor(Color.yellow);
        g.fillOval(320, 100, 200, 200);
        
        g.setColor(Color.blue);
        g.fillOval(445, 125, 40, 50);
        
        g.setColor(Color.blue);
        g.fillOval(360, 125, 40, 50);
        
        g.setColor(Color.red);
        g.drawArc(350,180,80,100,150,198);
        
        g.setColor(Color.black);
g.setFont(new Font(null));
for ( int X=0; X<800; X += 50 )
    g.drawString( String.valueOf(X), X, 50 );
for ( int Y=100; Y<600; Y += 50 )
    g.drawString( String.valueOf(Y), 28, Y );
// lines
g.setColor(Color.lightGray);
for ( int X=0; X<800; X += 50 )
    g.drawLine(X,0,X,599);    // horizontal
for ( int Y=0; Y<600; Y += 50 )
    g.drawLine(0,Y,799,Y);    // vertical
    }
    
    public static void main(String[] args) {
        JFrame win = new JFrame("SmilingFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
