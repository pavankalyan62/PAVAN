@@ -0,0 +1,32 @@
import java.util.*;
//import javafx.scene.chart.PieChart.Data;

 public class SalesAggregator {
    public static void main(String[] args) throws Exception{
        List<Data> sales22=new ArrayList<>();
        sales22.add(new Data("Tea",120));
        sales22.add(new Data("Cofee",230));
        sales22.add(new Data("Green Tea",60));
        sales22.add(new Data("Orange Soda",210));
        sales22.add(new Data("Lemon Soda",205));



        List<Data> sales21=new ArrayList<>();
        sales21.add(new Data("Tea",100));
        sales21.add(new Data("Cofee",250));
        sales21.add(new Data("Green Tea",50));
        sales21.add(new Data("Orange Soda",100));
        sales21.add(new Data("Lemon Soda",220));


        //Logic to calculate Variance
        for(int i=0;i<sales22.size();i++){
            System.out.println(sales22.get(i));
        }


    }


 }
