/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenExtra;

/**
 *
 * @author DANIC
 */
public class Cajero extends Cuenta{
    int v;
    public Cajero(int v, int SaldoDeCuenta, int NumCuenta, int NipCuenta){
        super(SaldoDeCuenta, NumCuenta, NipCuenta);
        this.v=v;
    }
}
