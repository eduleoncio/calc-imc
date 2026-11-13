package br.com.senai;

/** Calcula o índice de massa corporal (IMC). */
public class CalcIMC {
    /**
     * Calcula peso / (altura * altura).
     *
     * @throws IllegalArgumentException se o peso ou a altura não forem positivos
     */
    public double calcularIMC(double peso, double altura) {
        if (!Double.isFinite(peso) || peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser um número positivo.");
        }
        if (!Double.isFinite(altura) || altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser um número positivo.");
        }
        return peso / (altura * altura);
    }
}
