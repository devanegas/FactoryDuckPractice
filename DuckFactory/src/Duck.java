public abstract class Duck {
    String name;
    String color;
    String action;


    void catching(){
        System.out.println("> Now getting a "+ color + " "+ name);
        System.out.println("> Haha! We got 'em, and it..." + action);
    }

    void wash(){
        System.out.println("> The duck was kind of dirty, washing it now!");
    }

    public String getName(){
        return name ;
    }
}
