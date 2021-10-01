
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel
 */
public class ArrayEntero implements Cloneable {

    private int tam, tope = 0;
    private int A[];
    private boolean orden;

    protected ArrayEntero clone() throws CloneNotSupportedException {
        return new ArrayEntero(this);
    }

    public ArrayEntero(ArrayEntero A) {
        tam = A.tam;
        tope = A.tope;
        this.A = A.A.clone();
    }

    public ArrayEntero(int tam) {
        this.tam = tam;
        A = new int[tam];
    }

    public int busquedaBinaria(int numeroBuscado) {
        ordenarAsc();
        // 6 log^2 n/2
        for (int i = 0, f = tope - 1, medio = (i + f) / 2; i <= f; medio = (i + f) / 2) {
            if (numeroBuscado == A[medio]) {
                return medio;// 2
            } else if (numeroBuscado > A[medio]) {
                i = medio + 1;// 3
            } else {
                f = medio - 1;// 3
            }
        }
        return -1;
    }

    public int busquedaBinariaR(int numeroBuscado) {
        ordenarAsc();
        return busquedaBinariaR(numeroBuscado, 0, tope);
    }

    public int busquedaBinariaR(int numeroBuscado, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        } else {
            int medio = (inicio + fin) / 2;
            if (numeroBuscado == A[medio]) {
                return medio;
            } else if (numeroBuscado < A[medio]) {
                return busquedaBinariaR(numeroBuscado, inicio, medio - 1);
            } else {
                return busquedaBinariaR(numeroBuscado, medio + 1, fin);
            }
        }
    }

    public int busquedaSecuencial(int numeroBuscado) {
        for (int i = 0; i < tope; i++)// 2(n) = 2n+2n+2= (O)4n+3
        {
            if (A[i] == numeroBuscado)// 1
            {
                return i;// 1
            }
        }
        return -1;
    }

    public void inicializar() {
        for (int i = 0; i < tam; i++) {
            A[i] = (int) (Math.random() * 100);
        }
        tope = tam;
    }

    public void mostrar() {
        for (int i = 0; i <= tope; i++) {
            System.out.print("[" + A[i] + "]\n");
        }
    }

    public static void main(String[] args) {
        ArrayEntero a = new ArrayEntero(8);
        a.inicializar();
        a.mostrar();
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }

    public boolean lleno() {
        return tope == tam;
    }

    public boolean vacio() {
        return tope == 0;
    }

    public void insertar(int v) throws Exception {
        try {
            A[tope++] = v;
        } catch (IndexOutOfBoundsException e) {
            tope--;
            throw new Exception("El arreglo está lleno");
        }
    }

    public void sacar() throws Exception {
        try {
            if (vacio()) {
                throw new Exception();
            } else {
                tope--;
            }
        } catch (Exception e) {
            throw new Exception("");
        }
    }

    public void ordenarDsc() {
        int x = tope - 1;
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < tope; j++) {
                if (A[i] < A[j]) {
                    int xd = A[i];
                    A[i] = A[j];
                    A[j] = xd;
                }
            }
        }
    }
//************************************************************

    public static int particionQuickS(int arr[], int low, int high) {
        int pivote = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j <= high - 1; j++) {//se ve si el elemento es igual o menor al pivote
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void qSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = particionQuickS(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    public void qSort() {
        qSort(A, 0, tope - 1);
    }

    //***********************************************************
    public static void quickSortR(int vec[], int inicio, int fin) { //O(x) = n*log(n)
        if (inicio >= fin) {
            return;
        }
        int pivote = vec[inicio];
        int elemIzq = inicio + 1;
        int elemDer = fin;
        while (elemIzq <= elemDer) {
            while (elemIzq <= fin && vec[elemIzq] < pivote) {
                elemIzq++;
            }
            while (elemDer > inicio && vec[elemDer] >= pivote) {
                elemDer--;
            }
            if (elemIzq < elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
        }
        if (elemDer > inicio) {
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }
        quickSortR(vec, inicio, elemDer - 1);
        quickSortR(vec, elemDer + 1, fin);
    }

    public void quickSortR() {
        quickSortR(A, 0, tope - 1);
    }

    public void ordenarAsc() {
        int x = tope - 1;
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < tope; j++) {
                if (A[i] > A[j]) {
                    int xd = A[i];
                    A[i] = A[j];
                    A[j] = xd;
                }
            }
        }
    }

    public long ordenar() {// (6n^2-9n+7)
        long startTime = System.nanoTime(); // 1
        if (orden = !orden) // 1
        // 1 n (n-1)
        {
            ordenarDsc();
            // for (int i = 0; i < x; i++) {
            // // 2 n (n-1)
            // for (int j = i + 1; j < tope; j++) { //m =
            // if (A[i] < A[j]) //1
            // {
            // int xd = A[i];//1
            // A[i] = A[j];//1
            // A[j] = xd;//1
            // }//4(n-1)=4n-4=>4n-4+2n+1= 6n-3 => (n-1)(6n-3) + 2n = (6n^2-9n+3)+(4) => =
            // 6n^2-9n+7
            // }
            // }
        } else {
            ordenarAsc();
        }
        return System.nanoTime() - startTime; // 1
    }
}
