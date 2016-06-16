/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author dobry
 */
public class TSquare {
    public static  void draw(GraphicsContext gc){
            gc.clearRect(0, 0, 1000, 1000);
        point start  = new point(110, 140);
        double width = 130;
        render(gc, 7, start, width);
    }
    
    private static void render(GraphicsContext gc,int iter,point p,double width){
        gc.fillRect(p.x, p.y, width, width);        
        if (iter>=1){
            point p1  = new point(p.x-width/4, p.y-width/4);
            point p2  =new point(p.x+width*0.75,p.y+width*0.75);
            point p3  =new point(p.x+width*0.75,p.y-width/4);
            point p4  =new point(p.x-width/4,p.y+width*0.75);
            
            render(gc, iter-1, p1, width/2);
            render(gc, iter-1, p2, width/2);
            render(gc, iter-1, p3, width/2);
            render(gc, iter-1, p4, width/2);
        }

    }
}
