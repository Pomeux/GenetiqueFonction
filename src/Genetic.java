import java.util.ArrayList;

public class Genetic {

    private double f(double x) {
        return x*Math.sin(Math.PI*10+x)+1.0;
    }

    /**
     * @author Léo Planque
     * @param
     * @return retourne le nombre d'éléments dans un intervalle
     * */


    //TODO faire les test avec Junit pour nbVariable
    private int nbVariable(int[] intervalle) {
        if( intervalle.length!=2)
            throw new IllegalArgumentException("");

        int a=intervalle[0];
        int b=intervalle[1];

        if(a>b)
            throw new IllegalArgumentException("");

        if(a*b>=0) {
            return Math.abs(b-a);
        } else {
            return Math.abs(a)+b;
        }


    }
    private ArrayList<Integer> represent_solution(int[] intervalle,int precision) {

        int size=precision*nbVariable(intervalle);


        int nbBit=(int) Math.floor(Math.log((double) size));

        for(int i=0;i<size;i++) {
            

        }

        return null;
    }
}
