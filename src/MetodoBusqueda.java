public class MetodoBusqueda {

    // Búsqueda binaria con impresión de números del 1 al 1,000,000
    public void busquedaBinariaa(int[] bin) {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i + " ");
        }
    }

    // Búsqueda secuencial
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda binaria
    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value) {
                return medio; // Elemento encontrado
            }
            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; // Elemento no encontrado
    }
}

