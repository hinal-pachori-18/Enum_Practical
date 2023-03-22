//Create an ENUM class Fruits
enum Fruit {
    //Few Constant and with values
    APPLE("RED"),
    GRAPES("GREEN"),
    MANGO("YELLOW");

    String color;

    //create a constructor of Fruit.
    private Fruit(String color) {
        this.color = color;
    }

    //Create a getter method to return a Color of fruits
    public String getColor() {
        return this.color;
    }
}

//create a Class Main and print name of each enum constant and their color
class Main {
    public static void main(String[] args) {

        for (Fruit f1 : Fruit.values())
            //use getter method to get the value
            //use ordinal method to get the index of each enum constant
            System.out.println("Name of Fruit : " + f1 + " Color of Fruit : " + f1.getColor() + " at Index : " + f1.ordinal());
    }
}

