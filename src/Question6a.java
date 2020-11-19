public class Question6a {
    public static void main(String[] args) {
        String[][] animalArray = {
                {"Ant", "Bat", "Cat", "Dog"},
                {"Emu", "Fox", "Gar"},
                {"Hare", "Ibis"},
                {"Jackal"}
        };

        System.out.println(animalArray.length);

        for (String[] x : animalArray) {
            for (String animal : x) {
                System.out.printf("%s ", animal);
            }
            System.out.println();
        }

        int col = 0;
        for (String[] x : animalArray) {
            col = Math.max(x.length, col);
        }
        System.out.println(col);
    }
}
