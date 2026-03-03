import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int size=2*10;


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
        for(int i=0;i<size;i++) {

            for(int j=0;j<nbBit;j++) {
                System.out.print(tab.get(i).get(j));

            }
            double x=Genetic.corresponding_number(tab.get(i),new Intervalle<Integer>(0,2),2);
            System.out.println(" x: "+x+" f(x): "+Genetic.floorPrecissionDecimal(Genetic.f(x),2));
        }

        ArrayList<Integer> b=new ArrayList<Integer>(10);


        ArrayList<Integer> a=new ArrayList<Integer>(10);
        for(int i=1;i<=10;i++) {
            b.add(i);
        }


        for(int i=1;i<=10;i++) {
            a.add(-1*i);
        }
        Genetic.crossover(a,b);

    }

}