public class RealDuckStore extends DuckStore {

    protected Duck createDuck(String item) {
        if(item.equals("white")){
            return new RealWhiteDuck();
        }
        else if (item.equals("grey")){
            return new RealMallardDuck();
        } else return null;
    }
}
