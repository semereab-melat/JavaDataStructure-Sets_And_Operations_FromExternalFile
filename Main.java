
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    
            //Create two files called NumbersA.txt and NumbersB.txt, each populated with 20 numbers.
        //I use random method to populate it 

       /* try {
            FileWriter fw = new FileWriter("NumbersA.txt");
            FileWriter fw2 = new FileWriter("NumbersB.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter pw = new PrintWriter(bw);
            PrintWriter pw2 = new PrintWriter(bw2);
            for (int i = 0; i < 20; i++){
                int random = (int)(Math.random() * 20) +1;
                pw.println(random);
            }//for
            for (int i = 0; i < 20; i++){
                int random = (int)(Math.random() * 20) +1;
                pw2.println(random);
            }//for

            pw2.close();
            pw.close();
            bw2.close();
            bw.close();
            fw2.close();
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        */
        // Write code to populate two sets with the numbers from each file respectively and then print out
        // the contents of each set.


        int [] data1 = new int[20];
        int [] data2 = new int[20];

        try {
            FileReader fr = new FileReader("NumbersA.txt");
            FileReader fr2 = new FileReader("NumbersB.txt");
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);

            String line;
            String line2;


            for (int i = 0; i < data1.length; i++){
                line = br.readLine();
                data1[i] = Integer.parseInt(line);
            }//for

            for (int i = 0; i < data2.length; i++){
                line2 = br2.readLine();
                data2[i] = Integer.parseInt(line2);
            }//for

            br2.close();
            br.close();
            fr2.close();
            fr.close();

        }//try
        catch (Exception e){
            System.out.println(e);
        }//catch

        Set<Integer> numbeSet1 = new HashSet<>();
        Set<Integer> numbeSet2 = new HashSet<>();

        for (int i = 0; i < data1.length; i++) {
            numbeSet1.add(data1[i]);
        }//for

        for (int i = 0; i < data2.length; i++) {
            numbeSet2.add(data2[i]);
        }//for
        System.out.println("Number set one\n" + numbeSet1);
       System.out.println("\nNumber set two\n" + numbeSet2);

       // Determine the Union and Intersection of the sets – print out the answer for each.

        Set<Integer> union = new HashSet<>();
        union.addAll(numbeSet1);
        union.addAll(numbeSet2);

        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(numbeSet1);
        intersection.retainAll(numbeSet2);
        System.out.println("\nThe Union of two sets\n" + union);
        System.out.println("\nThe Intersection of two sets\n" +intersection);

        // Determine if the Union contains the number 10.
        if (union.contains(10)){
            System.out.println("\nUnion set contains number 10");
        }//if
        else
            System.out.println("\nUnion doesn't contain number 10");
  
  }
}