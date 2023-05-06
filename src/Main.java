import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operaciones();
    }

    //Método para seleccionar la operación que se quiera hacer con las matrices
    public static void Operaciones() {
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        System.out.println("Bienvenido a la calculadora básica de Matrices ");
        System.out.println("Practiquemos con las matrices");
        System.out.println("Seleccione una opción: " +
                "\n 1:Sumar matrices " +
                "\n 2:Restar matrices" +
                "\n 3:Multiplicar matrices");
        eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            default:
                System.out.println("Elección incorrecta \n vuelva a intentar");

        }
    }

    public static void suma() {

        System.out.println("*****SUMA DE MATRICES*****");
        //Crear arreglo de 2 x 2
        int [][] arregloA = new int [2][2];
        int [][] arregloB = new int [2][2];
        int [][] arregloSuma = new int [2][2];

        //LLenar arregloA con números aleatorios
        for (int fila = 0; fila < arregloA.length; fila++) {
            for (int columna = 0; columna < arregloA[fila].length; columna++) {
                arregloA[fila][columna] = (int)Math.floor(Math.random()*5);
            }
        }
        //LLenar arregloB con números aleatorios
        for (int fila = 0; fila < arregloB.length; fila++) {
            for (int columna = 0; columna < arregloB[fila].length; columna++) {
                arregloB[fila][columna] = (int)Math.floor(Math.random()*5);
            }
        }
        //Sumar arreglos A y B, almacenar los valores en arregloSuma
        for (int fila = 0; fila < arregloSuma.length; fila++) {
            for (int columna = 0; columna < arregloSuma[fila].length; columna++) {
                //Almacena la suma de cada posición en arreglo suma
                arregloSuma[fila][columna] = arregloA[fila][columna] + arregloB[fila][columna];
            }
        }
        System.out.println("*****Primera Matriz*****");
        //Imprimir arregloA
        for (int fila = 0; fila < arregloA.length; fila++) {
            for (int columna = 0; columna < arregloA[fila].length; columna++) {
                System.out.print("[" + arregloA[fila][columna]+ "]" +" ");
            }
            System.out.println();
        }
        System.out.println("*****Segunda Matriz*****");
        //Imprimir arregloB
        for (int fila = 0; fila < arregloB.length; fila++) {
            for (int columna = 0; columna < arregloB[fila].length; columna++) {
                System.out.print("[" + arregloB[fila][columna]+ "]"+" ");
            }
            System.out.println();
        }
        System.out.println("*****Resultado*****");
        //Imprimir ArregloSuma
        for (int fila = 0; fila < arregloSuma.length; fila++) {
            for (int columna = 0; columna < arregloSuma[fila].length; columna++) {
                System.out.print("[" + arregloSuma[fila][columna]+ "]" + " ");
            }
            System.out.println();
        }
    }
    public static void resta() {
        int m1[][] = new int[2][2];  //Matriz uno
        int m2[][] = new int[2][2];  //Matriz dos
        int resta[][] = new int[2][2]; //Matriz que almacena la resta

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) Math.floor(Math.random() * 5); //Genera un número al azar no mayores a 5
            }
        }
        //llenado matriz dos
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = (int) Math.floor(Math.random() * 5); //Genera un número al azar no mayores a 5
            }
        }

        for (int i = 0; i < resta.length; i++){
            for (int j = 0; j < resta.length; j++){
                resta[i][j] = m1[i][j] - m2[i][j];
            }
        }

        System.out.println("*****Primera Matriz*****");
        //Imprimir arregloA
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("[" + m1[i][j]+ "]" +" ");
            }
            System.out.println();
        }
        System.out.println("*****Segunda Matriz*****");
        //Imprimir arregloB
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("[" + m2[i][j]+ "]"+" ");
            }
            System.out.println();
        }
        System.out.println("*****Resultado*****");
        //Imprimir ArregloSuma
        for (int i = 0; i < resta.length; i++) {
            for (int j = 0; j < resta[i].length; j++) {
                System.out.print("[" + resta[i][j]+ "]" + " ");
            }
            System.out.println();
        }
    }

    public static void multiplicacion() {

        //creación de matrices
        int m1[][] = new int[2][2];  //matriz uno
        int m2[][] = new int[2][2];  //matriz dos
        int mR[][] = new int[2][2];  //matriz resultante

        //llenado matriz uno
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 5); // genera número al azar no mayores a 5
            }
        }
        //llenado matriz dos
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = (int) (Math.random() * 5); // genera número al azar no mayores a 5
            }
        }
        //multiplicación de matrices
        for (int i = 0; i < 4; i++) {

//se va a llenar el primer espacio de la matriz resultante al multiplicar filas por columnas en su respectivo orden
            if (mR[0][0] == 0) {
                int temporal = (m1[0][0] * m2[0][0]) +
                        (m1[0][1] * m2[1][0]);

                mR[0][0] = temporal;
//llenado del segundo resultado
            } else if (mR[1][0] == 0) {
                int temporal = (m1[1][0] * m2[0][0]) +
                        (m1[1][1] * m2[1][0]);

                mR[1][0] = temporal;
//llenado del tercer resultado
            } else if (mR[0][1] == 0) {
                int temporal = (m1[0][0] * m2[0][1]) +
                        (m1[0][1] * m2[1][1]);

                mR[0][1] = temporal;
//llenado del cuarto resultado
            } else if (mR[1][1] == 0) {
                int temporal = (m1[1][0] * m2[0][1]) +
                        (m1[1][1] * m2[1][1]);

                mR[1][1] = temporal;
            }

        }
        //Impresión de resultados

        //matriz uno                               //matriz dos
        System.out.println("["+m1[0][0]+"]"+"["+m1[0][1]+"]"+" x "+"["+m2[0][0]+"]"+"["+m2[0][1]+"]"+" = "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]"+
                "\n["+m1[1][0]+"]"+"["+m1[1][1]+"]"+"   "+"["+m2[1][0]+"]"+"["+m2[1][1]+"]"+"   "+"["+mR[0][0]+"]"+"["+mR[0][1]+"]");
    }


}