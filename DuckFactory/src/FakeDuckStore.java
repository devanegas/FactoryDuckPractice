public class FakeDuckStore extends DuckStore {
    protected Duck createDuck(String item) {
        if(item.equals("white")){
            return new FakeMarbleDuck();
        }
        else if(item.equals("grey")){
            return new FakeMetalDuck();
        }
        else return null;
    }
}
