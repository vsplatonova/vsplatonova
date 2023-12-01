

 import java.util.Scanner;
 

 public class Main {

        public static void main(String[] args) {

        checknumbers();
        checknames();
        checkArray();
        }

              
     public static    void checknumbers(){
             Scanner scanner = new Scanner(System.in);
             System.out.println("Введите число");
                 int number = scanner.nextInt();
                   if (number > 7){
                          System.out.println("Привет");
                                                 
          }
                                                            
                                                          }
    public static void checknames()   {

        Scanner scanner=new Scanner(System.in);
         System.out.print("Введите имя пользователя: ");
         String name= scanner.nextLine();
            if (name.equals("Вячеслав")) {
         System.out.println("Привет, Вячеслав");
          } else {
         System.out.println("Нет такого имени");
    }


    }                   
public static void checkArray()              {
    int[] num={1,2,3,4,5,6,7,8,9,10};
    System.out.println("Вывести элементы масива кратные числу 3");
    for (int i=0;i<num.length;i++){
        if(num[i] %3==0) {
            System.out.println(num[i]+" ");
        }

    }

}          
            }
        
        
                                            
    