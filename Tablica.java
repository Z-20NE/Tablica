class Tablica{
    public static void main(String[] args){
     double m;
        int d, c=0;
          for(d=1;d<=144;d++){
          m=d*0.0254;
          c++;
          System.out.println(d +" Дюйм "+ m+ " Метров ");
          if(c==12){
          System.out.println(" ");
           c=0;
          }
    }
}
}