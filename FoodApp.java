class FoodApp {
    public static void main(String[] args) {
        FoodFactory factory = new PizzaFactory();
        Food food = factory.createFood();
        System.out.println(food.prepare());

        FoodFactory burgerFactory = new BurgerFactory();
        Food burger = burgerFactory.createFood();
        System.out.println(burger.prepare());
    }

}


