class cpu 
  {
   int price;
   cpu(int p) 
     {
     this.price=p;
     }

 class processor {
      int cores;
      String manufacture;
      
       processor(int n,String m) {
            this.cores=n;
            this.manufacture=m;
          }
      void display() {
         System.out.println("No of cores:"+this.cores);
         System.out.println("processor manufactures:"+this.manufacture);
     }
  }
  
  static class Ram {
        int memory;
        String manufacture;
 
        Ram(int n,String m) {
            this.memory=n;
            this.manufacture=m;
         }

     void display() {
         System.out.println("memory size:"+this.memory);
         System.out.println("memory manufacture:"+this.manufacture);
            }
          }
      void display() {
         System.out.println("price of cpu:"+this.price);
          }

   public static void main(String args[]) {
   
             cpu intel=new cpu(23000);
             cpu.processor i_processor=intel.new processor(4,"intel");
              cpu.Ram i_ram=new Ram(1024,"Asus");
              intel.display();
              i_processor.display();
             i_ram.display();
    }
      }
