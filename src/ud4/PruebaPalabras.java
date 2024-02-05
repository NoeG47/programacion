package ud4;
public class PruebaPalabras {

    public static void main(String[] args) {
        String[] palabras = { "hola", "adios", "hola", "mundo", "mundo" };
        boolean[] esRepetida = new boolean[palabras.length];
        String[] palabrasUnicas = new String[palabras.length];
        int contadorPalabrasUnicas = 0;

        for (int i = 0; i < palabras.length; i++) {
            boolean palabraRepetida = false;

            // Verificar si la palabra ya ha sido marcada como repetida
            if (!esRepetida[i]) {
            
                for (int j = i + 1; j < palabras.length; j++) {

                    if (palabras[i].equals(palabras[j])) {
                        palabraRepetida = true;
                        esRepetida[i] = true;  // Marcar la palabra como repetida en el array de booleanos
                    }
                }
            }

            if (!palabraRepetida) {
                palabrasUnicas[contadorPalabrasUnicas] = palabras[i];
                contadorPalabrasUnicas++;
            }
        }

        // Imprimir el resultado
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("La palabra '" + palabras[i] + "' es repetida: " + esRepetida[i]);
        }

        // Imprimir palabras únicas
        System.out.print("Palabras únicas: ");
        for (int i = 0; i < contadorPalabrasUnicas; i++) {
            System.out.print(palabrasUnicas[i] + " ");
        }
    }
}
