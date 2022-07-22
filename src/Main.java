public class Main {
    public static void main(String[] args) {


        long[] sales = {50, 128, 167, 135, 78};
        long[] sales1 = {150, 328, 67, 142};
        long[] sales2 = {500, 208, 367, 123, 207, 607};

        SalesManager manager = new SalesManager(sales);
        SalesManager manager1 = new SalesManager(sales1);
        SalesManager manager2 = new SalesManager(sales2);

        System.out.println("manager max - " + manager.max());
        System.out.println("manager1 max - " + manager1.max());
        System.out.println("manager2 max - " + manager2.max());

        System.out.println("manager average - " + manager.average());
        System.out.println("manager1 average - " + manager1.average());
        System.out.println("manager2 average - " + manager2.average());
    }
}
