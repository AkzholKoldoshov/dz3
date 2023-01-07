public class Main {
    public static void main(String[] args) {
        double number [] = {1.2, 3.5, - 2.2, 1.7, 23.67, -43.5,34.5, 56.7, 56.3, -4.67, 46.5, 87.4, 57.5,76.54, 48.58,};
                        double summa = 0;
                   int col = 0;
                   boolean proverka = false;
                   for (double forEach : number) {
                       if (forEach < 0){
                       proverka=true;}
                   else if (forEach>0 && proverka){
                           summa+=forEach;
                           col++;
                           System.out.println(forEach);}


                       }
        System.out.println("Арифметическая число " + summa/col);
                   }

      }




