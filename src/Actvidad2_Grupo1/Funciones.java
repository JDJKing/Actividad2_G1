package Actvidad2_Grupo1;

import TdaLista.Lista;

public class Funciones {

    static Lista<Integer> datosClima;

    public Funciones(){
        this.datosClima = new Lista<>();
    }



    public void agregarDatos(int i, int mes){
        if(i > 44 )
        {

        }
        else
        {
            for(int semana = 1; semana <= 4; semana ++){
                for(int dia = 1; dia <= 7; dia ++){
                    datosClima.append(mes);
                    datosClima.append(semana);
                    datosClima.append(dia);
                    int temperatura = (int) Math.floor(Math.random()*(30 - 1 + 1) + (0));
                    datosClima.append(temperatura);
                }
            }
            agregarDatos(i + 4, mes + 1 );
        }
    }

    public Lista filtrarDatos(int mes, int i){
        Lista<Integer> listaFiltrada = new Lista<>();

        if(i * mes > 112 * mes)
        {

        }
        else
        {
           listaFiltrada.append((Integer) datosClima.buscarPorIndice(i));
        }
        return listaFiltrada;
    }


    public void mostrarLista(){
        System.out.println(datosClima.toString());
    }

}
