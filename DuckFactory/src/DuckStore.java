public abstract class DuckStore {
    public Duck getDuck(String type){
        Duck duck = createDuck(type);

        duck.catching();
        duck.wash();

        return duck;

    }

    protected abstract Duck createDuck(String type);
}
