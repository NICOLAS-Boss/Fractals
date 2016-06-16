/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractalApp.fractalGenerators;

/**
 *
 * @author dobry
 */
    class point{
        public double x;
        public double y;

        point(double x,double y){
            this.x = x;
            this.y = y;
        }
        point(){
        }
        point(point x){
        this.x = x.x;
        this.y = x.y;
        }
    }
