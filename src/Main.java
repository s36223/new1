public class Main {
    public static void main(String[] args) {


        // TODO: musimy dodac brakujace klasy!

        // OK, ja dodam ‘Adder‘, a s35338 doda ‘Subtractor‘.

        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
