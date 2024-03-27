package modul1202357201036;

public class rata_rata {
    
     public static void main(String[] args) {
        int data[][] = 
        {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        int total = 0;
        double rata;
       
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++) {
                    total += data[a][b];             
                }
            }
           
             System.out.println("jumlah : " + total);
                    rata = total / (data.length * data[0].length);
                System.out.println(rata);
        }
    }
