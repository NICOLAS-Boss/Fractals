/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

import com.sun.prism.impl.PrismSettings;
import javafx.scene.canvas.GraphicsContext;


public class KochSnowflake {
    public static  void draw(GraphicsContext gcC){
            gcC.clearRect(0, 0, 1000, 1000);
        point O =  new point(20,100);
        point X = new point(300,100);
        int i = 10;
        kohStar(gcC,X,O,i);
        point buf = rotatePoint(O,X,60);
        kohStar(gcC,O,buf,i);
        kohStar(gcC,buf,X,i);
    }
    


    private static  point rotatePoint(point O ,point X,double angle) {
        point result = new point(); 
        result.x = O.x+((X.x-O.x)*Math.cos(angle*Math.PI/180)-(X.y-O.y)*Math.sin(angle*Math.PI/180));
        result.y = O.y+((X.x-O.x)*Math.sin(angle*Math.PI/180)+(X.y-O.y)*Math.cos(angle*Math.PI/180));
        return result;
    }
  
    private static point  thirdsOfLine(point x1,point x2,boolean n){
        point result = new point();
        if (n == true){
           result.x =  2*(x1.x+x2.x/2)/3;
           result.y =  2*(x1.y+x2.y/2)/3;
        }else{
           result.x = (x1.x+x2.x*2)/3;
           result.y = (x1.y+x2.y*2)/3;
        }    
        return result;
    }
    
    private static  void kohStar(GraphicsContext gc, point x1,point x2,int i){
        if (i>1){
            point t_ofL1 = thirdsOfLine(x1,x2,true);
            point t_ofL2 = thirdsOfLine(x1,x2,false);
            kohStar(gc,x1,t_ofL1,i-1);
            point buf1 =rotatePoint(t_ofL1,t_ofL2,60);
            kohStar(gc,t_ofL1,buf1,i-1);
            kohStar(gc,buf1,t_ofL2,i-1);
            kohStar(gc,t_ofL2,x2,i-1);
        }else{
        gc.strokeLine(x1.x,x1.y,x2.x,x2.y);
        } 
    }
}
