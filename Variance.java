@@ -0,0 +1,86 @@
// create a table of 2 two years prices and find the variance and variance percentage

/********************************************************************************
 * Product          Sales_2021          Sales_2022              Variance            Variance_Percentage
 * Tea              100                 120                                                                    
 * Coffee           250                 230             
 * Green_Tee        50                  60
 * Orange_Soda      180                 210 
 * Lemon_Soda       220                 205
 */



 /********************************************
  *     Initialize 2 lists
  sales2022=new ArrayList(){
    new Data("Tea",120);
    new Data("Cofee",220);
  ...
  }
  
  Sales2021=new ArrayList(){
    ..
  }
  */
  import java.util.*;
  public class VarianceEx{
     public static void main(String[] args){

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
         List<Data> variances =new ArrayList<>();
         List<Data> variancePcts = new ArrayList<>();

         for(int i=0;i<sales22.size();i++){
           double variance = sales22.get(i).getvalue() - sales21.get(i).getvalue();
           variances.add(new Data(sales22.get(i).getproduct(),variance));

           double variancePct =((double)variance/sales22.get(i).getvalue())*100;
           variancePcts.add(new Data(sales22.get(i).getproduct(),variancePct));


         }

         //for(int i=0;i<sales22.size();i++){
           System.out.println("Variance : "+variances+"\nVariance_Percentage : "+variancePcts);
         //}

         //System.out.println();

         //Calculate the grand total of 2022 & 2021

         double sales22Total =sales22.stream().mapToDouble(s->s.getvalue()).sum();
         System.out.println(sales22Total);
         double sales21Total =sales21.stream().mapToDouble(s->s.getvalue()).sum();
         System.out.println(sales21Total);

         //calculate the total for "Tea" -This should filter Tea and Green Tea data

         double sales22Total10fTeaProducts = sales22.stream().filter(s->s.getproduct().contains("Tea")).mapToDouble(s->s.getvalue()).sum();
         System.out.println(sales22Total10fTeaProducts);



     }


  }

