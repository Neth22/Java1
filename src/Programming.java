public class Programming {
    String language;
    Programming(){
        this.language = "java";
    }
  Programming(String language){
        this.language= language;


    }
   public void getName(){
       System.out.println("programming Language :" + this.language);

   }

    public static void main(String[] args) {
        Programming p = new Programming();
        Programming p1 = new Programming("python");
        p.getName();
        p1.getName();

    }
}
