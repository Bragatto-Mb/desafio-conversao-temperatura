public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.2;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        // 1. Declarei a variável
        int temperaturaInteira = (int) temperaturaEmFahrenheit;

        // 2. Usei EXATAMENTE o mesmo nome aqui
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaInteira);

    } // Fechei o main
} // Fechei a classe