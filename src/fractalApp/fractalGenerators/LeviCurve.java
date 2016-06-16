package fractalApp.fractalGenerators;

import javafx.scene.canvas.GraphicsContext;


public class LeviCurve {
    public static  void draw(GraphicsContext gc){
    gc.clearRect(0, 0, 1000, 1000);
    point x1  =new point (100,240);
    point x2 = new point (240,240);
        render(gc, 20, x1, x2);
    
    }
    public static void render(GraphicsContext gc,int iter,point x1,point x2 ){
        if (iter ==1){
            gc.strokeLine(x1.x, x1.y, x2.x, x2.y);


        }else{
             double  x3 = (x1.x + x2.x) / 2 + (x2.y - x1.y) / 2;
             double  y3 = (x1.y + x2.y) / 2 - (x2.x - x1.x) / 2;
             point buf = new point(x3, y3);
            render(gc, iter-1, x1,buf);
            render(gc, iter-1, buf,x2);
        }
    }

}
