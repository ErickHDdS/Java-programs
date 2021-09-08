/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalErick;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class ControlePagamento {
    ArrayList<Pagavel> gastos = new ArrayList<>();
    public double SALARIO = 954.00;
    public double HORA = 8.00;
    public double horasAdicionais;
    private double somatorioSalarios = 0.0;
    private double somatorioConta = 0.0;
   
    
    public void somandoSalario(Empregado empregado)
    {
        somatorioSalarios+=empregado.salario;
    }
    
    public void somandoContas(Conta conta)
    {
        somatorioConta+= conta.valor;
    }

    public ArrayList<Pagavel> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Pagavel> gastos) {
        this.gastos = gastos;
    }

    public double getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(double SALARIO) {
        this.SALARIO = SALARIO;
    }

    public double getHORA() {
        return HORA;
    }

    public void setHORA(double HORA) {
        this.HORA = HORA;
    }

    public double getHorasAdicionais() {
        return horasAdicionais;
    }

    public void setHorasAdicionais(double horasAdicionais) {
        this.horasAdicionais = horasAdicionais;
    }

    public double getSomatorioSalarios() {
        return somatorioSalarios;
    }

    public void setSomatorioSalarios(double somatorioSalarios) {
        this.somatorioSalarios = somatorioSalarios;
    }

    public double getSomatorioConta() {
        return somatorioConta;
    }

    public void setSomatorioConta(double somatorioConta) {
        this.somatorioConta = somatorioConta;
    }
}
