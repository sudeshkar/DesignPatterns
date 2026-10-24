public class BurgerFactory implements FoodFactory {

    @Override   
    public Food createFood() {
       return new Burger();
    }

}
