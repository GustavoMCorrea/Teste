package org.example;

public class Imc {
    private double peso;
    private double altura;
    private String sexo;

    private String resultado;

    public Imc(double peso, double altura, String sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String calcularImc() {
        double quadrado = Math.pow(getAltura(), 2);
        double imc = getPeso() / quadrado;

        if (getSexo().equals("Feminino")) {
            if (imc < 19.1) {
                this.resultado = "Abaixo do peso";
            } else {
                if (imc < 25.8) {
                    this.resultado = "No peso normal";
                } else {
                    if (imc < 27.3) {
                        this.resultado = "No peso normal";
                    } else {
                        if (imc < 32.3) {
                            this.resultado = "No peso normal";
                        } else {
                            this.resultado = "Obeso";
                        }
                    }
                }

            }
        } else {
            if (imc < 20.7) {
                this.resultado = "Abaixo do peso";
            } else {
                if (imc < 26.4) {
                    this.resultado = "No peso normal";
                } else {
                    if (imc < 27.8) {
                        this.resultado = "No peso normal";
                    } else {
                        if (imc < 31.1) {
                            this.resultado = "No peso normal";
                        } else {
                            this.resultado = "Obeso";
                        }
                    }
                }

            }

        }
    return this.resultado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
