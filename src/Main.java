public class Main {
    public static void main(String[] args) {
        suma(30,20,10);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("El numero de puertas es: " + miCoche.puertas);
    }
    public static void suma(int a, int b, int c){
        int resultado = 0;
        resultado = a+b+c;
        System.out.println("La suma es: " + resultado);
    }
}

class Coche {

    public int puertas = 4;
    public void AgregarPuerta(){
        this.puertas++;
    }

}