/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

import javafx.scene.canvas.GraphicsContext;


public class Dragon {
    public static  void draw(GraphicsContext gc){
        gc.clearRect(0, 0, 1000, 1000);
        point x1  =new point (80,240);
        point x2 = new point (280,240);
        render(gc, 15, x1, x2);
    
    }
    public static void render(GraphicsContext gc,int iter,point x1,point x2 ){
        if (iter ==1){
            gc.strokeLine(x1.x, x1.y, x2.x, x2.y);


        }else{
             double  x3 = (x1.x + x2.x) / 2 + (x2.y - x1.y) / 2;
             double  y3 = (x1.y + x2.y) / 2 - (x2.x - x1.x) / 2;
             point buf = new point(x3, y3);
            render(gc, iter-1, x1,buf);
            render(gc, iter-1,x2, buf);
        }
    }
}
