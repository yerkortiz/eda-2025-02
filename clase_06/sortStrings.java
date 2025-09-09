import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;

public class sortStrings {

    public static void main(String[] args) {
        // String[] frutas = {
        //     "Manzana",
        //     "Plátano",
        //     "Sandía",
        //     "Uva",
        //     "Naranja",
        //     "Fresa",
        //     "Melón",
        //     "Durazno",
        //     "Cereza",
        //     "Pera",
        // };

        // Arrays.sort(frutas);
        // System.out.println("Orden ascendente: " + Arrays.toString(frutas));

        // Arrays.sort(frutas, Collections.reverseOrder());
        // System.out.println("Orden descendente: " + Arrays.toString(frutas));

        String[] apellidos = { "Marta", "Martin", "Martín", "Marto" };

        // Arrays.sort(apellidos);
        // System.out.println(
        //     "Orden ascendente sin Collator: " + Arrays.toString(apellidos)
        // );

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
        Arrays.sort(apellidos, collator);
        System.out.println(
            "Orden ascendente con Collator: " + Arrays.toString(apellidos)
        );
    }
}
