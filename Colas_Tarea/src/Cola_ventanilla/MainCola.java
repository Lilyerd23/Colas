package Cola_ventanilla;

public class MainCola {

    public static void main(String[] args) {

        Cola c = new Cola();
        c.setAllItems(new String[]{"[1]", "[2]", "[3]", "[4]", "[5]", "[6]",
            "[7]", "[8]", "[9]", "[10]", "[11]", "[12]"});

        System.out.println("La cola comienza así:");
        c.muestraCola();
        c.runProccess();
        System.out.println("La cola termina así:");
        c.muestraCola();

    }

}
