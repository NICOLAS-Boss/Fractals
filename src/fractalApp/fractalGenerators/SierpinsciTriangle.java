/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

import javafx.scene.canvas.GraphicsContext;

public class SierpinsciTriangle {
    public static void draw(GraphicsContext gc){
        gc.clearRect(0, 0, 1000, 1000);
        point p1 = new point(20, 300);
        point p2 = new point (300,300);
        point p3 = new point (150,50);
        render(gc, 7, p1, p2, p3);

      
       
    }
    public static void render(GraphicsContext gc,int iter,point p1,point p2,point p3){
        gc.strokeLine(p1.x, p1.y, p2.x, p2.y);
        gc.strokeLine(p2.x, p2.y, p3.x, p3.y);
        gc.strokeLine(p3.x, p3.y, p1.x, p1.y);
        if (iter>=1){
            point bp1 = new point((p1.x+p2.x)/2, (p1.y+p2.y)/2);
            point bp2 = new point((p2.x+p3.x)/2, (p2.y+p3.y)/2);
            point bp3 = new point((p3.x+p1.x)/2, (p3.y+p1.y)/2);            
            
            render(gc, iter-1, p1, bp1, bp3);
            render(gc, iter-1, p2, bp1, bp2);
            render(gc, iter-1, p3, bp2, bp3);

        }
    }
}
