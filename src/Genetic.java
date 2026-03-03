import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Genetic {

    private int precission;

    public static double f(double x) {

        return (x*Math.sin(Math.PI*10+x)+1.0);
    }
    public static double floorPrecissionDecimal(double x, int precission) {
        double p=Math.pow(10.0,precission);
        return Math.floor(x*p)/p;
    }
    //ajouté exception+faire classe intervalle
    public static double corresponding_number(ArrayList<Integer> binary,Intervalle<Integer> intervalle,int precision) {


        double sum=0.0;
        for(int i=0;i<binary.size();i++) {
            sum+=Math.pow(2.0,i)*binary.get(i);
        }
        double precission=Math.pow(10.0,(double) precision);
        return floorPrecissionDecimal(((-intervalle.getInf()+
                sum*intervalle.getSup()/(Math.pow(2.0,binary.size())-1))),precision);
    }

    /**
     * @author Léo Planque
     * @param
     * @return retourne le nombre d'éléments dans un intervalle
     * */


    //TODO faire les test avec Junit pour nbVariable
    //modif pour que ça soit n'importe quelle double en inf et sup+ que ça retourne bien le nb de variable même si c'est des double
    //modif le nom des variables
    //rajouter size en attribut
    private static int nbVariable(Intervalle<Integer> intervalle) {

        int a=intervalle.getInf();
        int b=intervalle.getSup();

        if(a>b)
            throw new IllegalArgumentException("");

        if(a*b>=0) {
            return Math.abs(b-a);
        } else {
            return Math.abs(a)+b;
        }


    }
    private ArrayList<ArrayList<Integer>> generate_solution(Intervalle<Integer> intervalle,int precision) {

        int size=precision*nbVariable(intervalle);


        int nbBit=(int) Math.ceil(Math.log((double) size)/Math.log(2.0));

        ArrayList<ArrayList<Integer>> tab=new ArrayList<ArrayList<Integer>>(size);

        for(int i=0;i<size;i++) {
            ArrayList<Integer> tab_tempo=new ArrayList<Integer>(nbBit);

            for(int j=0;j<nbBit;j++) {
                int rand = (int) (Math.random() * 2);

                tab_tempo.add(rand);

            }
            tab.add(tab_tempo);
        }


        return tab;
    }

    public static void one_crossover(List<Integer> parent1,List<Integer> parent2) {
        int indexCross=(int) (Math.random()*(parent1.size())-1);

        faire fusion de list voir avec les itératurs si on peut pas faire en O(1) avec des pointeurs peut-être
    }
}
