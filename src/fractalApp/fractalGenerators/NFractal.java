/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

import javafx.scene.canvas.GraphicsContext;


public class NFractal {
    public static void draw(GraphicsContext gc){
            gc.clearRect(0, 0, 1000, 1000);
        double semiwidth  = 70;
        point p1 = new point(170,200);
        renderF(gc, 5, semiwidth, p1);
    }
    private static void renderF(GraphicsContext gc,int iter, double semiwidth,point p){
            gc.strokeLine(p.x-semiwidth,p.y,p.x+semiwidth,p.y);
            point p1 = new point(p.x-semiwidth,p.y-semiwidth);
            point p2 = new point (p.x+semiwidth,p.y-semiwidth);
            point p3 = new point (p.x-semiwidth,p.y+semiwidth); 
            point p4 = new point (p.x+semiwidth,p.y+semiwidth);
            gc.strokeLine(p1.x, p1.y, p3.x, p3.y);
            gc.strokeLine(p2.x, p2.y, p4.x, p4.y);
            if (iter>=1){
                renderF(gc, iter-1, semiwidth/2, p1);
                renderF(gc, iter-1, semiwidth/2, p2);
                renderF(gc, iter-1, semiwidth/2, p3);
                renderF(gc, iter-1, semiwidth/2, p4);
            }
    }
    
}
