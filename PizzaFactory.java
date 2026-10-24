public class PizzaFactory implements FoodFactory {
   
    @Override
    public Food createFood() {
        return new Pizza();
    }
}
