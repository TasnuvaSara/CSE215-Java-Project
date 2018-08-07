package project215;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Edit_Info {
        
     Scanner x;

    public void editRecord(String name,String date,double bags, String path) {
        // String filepath = "C:\\Users\\MD Khairul Hasan\\Donors_Details.txt";
        String tempFile = "C:\\Users\\MD Khairul Hasan\\Desktop\\temp.txt";
        File oldFile = new File(path);
        File newFile = new File(tempFile);
        String n = "";
        String b = "";
        String g = "";
        String a = "";
        String d = "";
        String m = "";
        String blgr = "";
        String bgs = "";
        double bag = 0;
        PrintWriter pw = null;
        try {

            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            x = new Scanner(new File(path));
          //  x.useDelimiter("[,\n]");
            while (x.hasNext()) {

                n = x.next();
                b = x.next();
                g = x.next();
                a = x.next();
                d = x.next();
                m = x.next();
                blgr = x.next();
                bgs = x.next();
            
                bag = Double.parseDouble(bgs);
                if (n.equalsIgnoreCase(name)) {
                    //pw.println();
                    pw.print(name + " " + b + " " + g + " " + a + " " + date + " " + m + " " + blgr + " " + (bag+bags) );
                    pw.println();
                }else{
                     pw.println(n + " " + b + " " + g + " " + a + " " + d + " " + m + " " + blgr + " " + bgs );
                     
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {

            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(path);
            newFile.renameTo(dump);

        }

    }
   
    
}
