import java.io.*;
class createread {
  public static void main(String args[]) throws IOException {
       File new1=new File("/home/mca/Desktop/vismaya/vismaya.txt");
            
         boolean vl=new1.createNewFile();
         if(vl) { 
               System.out.println("file is  created ");
        }
      else {
                      System.out.println("file is already exist");
    }
   
    String data="hello welcome have a nice day";
     FileWriter new2=new FileWriter("/home/mca/Desktop/vismaya/vismaya.txt");
    new2.write(data);
                     System.out.println("file is updated");
    new2.close();
      char[] ar=new char[100];
         FileReader new3=new FileReader("/home/mca/Desktop/vismaya/vismaya.txt");
          new3.read(ar);
                               System.out.println("the content is");
                                                    System.out.println(ar);

    new3.close();
      
          
}
}
