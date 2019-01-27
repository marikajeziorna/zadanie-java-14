public class NamesTable {

    public void printWelcome(String[] namesTable) {
        int length = namesTable.length;
        int i = 0;
        while (i < length) {
            System.out.println("Cześć " + namesTable[(length - 1) - i]);
            i++;
        }
    }
}
