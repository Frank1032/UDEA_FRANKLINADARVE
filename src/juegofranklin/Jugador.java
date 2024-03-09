/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegofranklin;

import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author FRANK
 */
public class Jugador {
    
    
    
    public int TOTAL_CARTAS = 10;
    private final Random r = new Random();
    private final Carta[] Carta = new Carta[TOTAL_CARTAS];
    
    //  VARIABLE GLOBLAR PARA  LAS PINTAS Y CANTIDAD DE  PNTAS
    private Carta[] CartaTrebol, CartaPica, CartaDiamante, CartaCorazon;
    private int CantTrebol, CantPica, CantDiamante, CantCorazon;
    private int[] numerosConsecutivosTrebol, numerosConsecutivosPica,
            numerosConsecutivosDiamante, numerosConsecutivosCorazon;

    public void repartir() {
        for (int i = 0; i < Carta.length; i++) {
            Carta[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        for (int i = 0; i < Carta.length; i++) {
            Carta[i].mostrar(pnl, 5 + i * 79, 5);
        }

        pnl.repaint();
    }

    public String getGrupos() {

        CantTrebol = contarCartasPorPinta(Carta, Pinta.TREBOL);
        CantPica = contarCartasPorPinta(Carta, Pinta.PICA);
        CantDiamante = contarCartasPorPinta(Carta, Pinta.DIAMANTE);
        CantCorazon = contarCartasPorPinta(Carta, Pinta.CORAZON);

        CartaTrebol = ordenarCartasPorPinta(Carta, Pinta.TREBOL, CantTrebol);
        CartaPica = ordenarCartasPorPinta(Carta, Pinta.PICA, CantPica);
        CartaDiamante = ordenarCartasPorPinta(Carta, Pinta.DIAMANTE, CantDiamante);
        CartaCorazon = ordenarCartasPorPinta(Carta, Pinta.CORAZON, CantCorazon);

        /* CONTADOR PARA ALMACENAR LAS VECES QUE APARECE CADA UNA INICIALIZADO EN 0.
            CADA POSICION ES UAN CARTA DIFERENTE
         */
        int[] contadores = new int[NombreCarta.values().length];
        for (Carta carta : Carta) {
            contadores[carta.getNombre().ordinal()]++;
        }

        int totalGrupos = 0;
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] >= 2) {
                totalGrupos++;
            }
        }

        //IDENTIFICAR LAS CARTAS QUE SE REPPITEN ALMENOS 2 VECES
    
        for (Carta carta : Carta) {
            int ordinal = carta.getNombre().ordinal();
            if (contadores[ordinal] >= 2) {
                carta.setFormaGrupo(true);
            }
        }

        String[] mensajesEscaleras = {
            mostrarNumerosConsecutivos(encontrarCartasConsecutivas(CartaTrebol), Pinta.TREBOL),
            mostrarNumerosConsecutivos(encontrarCartasConsecutivas(CartaPica), Pinta.PICA),
            mostrarNumerosConsecutivos(encontrarCartasConsecutivas(CartaDiamante), Pinta.DIAMANTE),
            mostrarNumerosConsecutivos(encontrarCartasConsecutivas(CartaCorazon), Pinta.CORAZON),};

        return mensajeCompleto(mensajesEscaleras, totalGrupos, contadores);

    }

    public String getPuntaje() {
        
        if (CartaTrebol == null || CartaPica == null || CartaDiamante == null || CartaCorazon == null) {
            return "Error: NO FUERON VERIFICADAS LAS CARTAS.";
        }

        numerosConsecutivosTrebol = obtenerNumerosConsecutivos(encontrarCartasConsecutivas(CartaTrebol));
        numerosConsecutivosPica = obtenerNumerosConsecutivos(encontrarCartasConsecutivas(CartaPica));
        numerosConsecutivosDiamante = obtenerNumerosConsecutivos(encontrarCartasConsecutivas(CartaDiamante));
        numerosConsecutivosCorazon = obtenerNumerosConsecutivos(encontrarCartasConsecutivas(CartaCorazon));

        marcarNumerosConsecutivos(numerosConsecutivosTrebol, Carta, Pinta.TREBOL);
        marcarNumerosConsecutivos(numerosConsecutivosPica, Carta, Pinta.PICA);
        marcarNumerosConsecutivos(numerosConsecutivosDiamante, Carta, Pinta.DIAMANTE);
        marcarNumerosConsecutivos(numerosConsecutivosCorazon, Carta, Pinta.CORAZON);

        return mostrarPuntaje(Carta);
    }

    public static String mensajeCompleto(String[] mensajesEscaleras, int totalGrupos, int[] contadores) {
        String mensaje = "";

        //GRUPOS ENCONTRADOS
        if (totalGrupos > 0) {
            mensaje += "LOS GRUPOS FUERON:\n";
            for (int i = 0; i < contadores.length; i++) {
                if (contadores[i] >= 2) {
                    mensaje += Grupo.values()[contadores[i]] + " de " + NombreCarta.values()[i] + "\n";
                }
            }
        }

        String mensajeCompleto = "";
        for (String mensajesEscalera : mensajesEscaleras) {
            mensajeCompleto += mensajesEscalera;
        }

        if (!mensajeCompleto.equals("")) {
            mensaje += "TIENES ESCALERAS DE:\n";
            for (String mensajeEscalera : mensajesEscaleras) {
                mensaje += mensajeEscalera + " ";
            }
        }

        // Si no se encontraron grupos ni escaleras, mostrar "No hay grupos"
        if (mensaje.equals("")) {
            mensaje = "NO HAY GRUPOS";
        }
        return mensaje;
    }

    //ORDENAMIENTO
    public void ordenarPorBurbuja() {
        for (int i = 0; i < Carta.length - 1; i++) {
            for (int j = i + 1; j < Carta.length; j++) {
                if (Carta[i].getIndice() > Carta[j].getIndice()) {
                    Carta temp = Carta[i];
                    Carta[i] = Carta[j];
                    Carta[j] = temp;
                }
            }
        }
    }

    public Carta[] ordenarPorSeleccion(Carta Carta[]) {
        int n = Carta.length;

          for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            
            for (int j = i + 1; j < n; j++) {
                if (Carta[j].getIndice() < Carta[indiceMinimo].getIndice()) {
                    indiceMinimo = j;
                }
            }

            
            Carta temp = Carta[indiceMinimo];
            Carta[indiceMinimo] = Carta[i];
            Carta[i] = temp;
        }

        return Carta;
    }

    public Carta[] ordenarCartasPorPinta(Carta Carta[], Pinta pinta, int numeroCartas) {
        int indicePinta = 0;
        Carta[] CartaPinta = new Carta[numeroCartas];

        for (Carta carta : Carta) {
            if (carta.getPinta() == pinta) {
                CartaPinta[indicePinta] = carta;
                indicePinta++;
                
                if (indicePinta >= numeroCartas) {
                    break;
                }
            }
        }

        return ordenarPorSeleccion(CartaPinta);
    }

    public int contarCartasPorPinta(Carta Carta[], Pinta pinta) {
        int contador = 0;
        for (Carta carta : Carta) {
            if (carta.getPinta() == pinta) {
                contador++;
            }
        }
        return contador;
    }

    public int[][] encontrarCartasConsecutivas(Carta Carta[]) {
        int[][] gruposConsecutivos = new int[Carta.length][2];
        int numGrupos = 0;
        if (Carta.length == 0) {
            return new int[0][2];
        }

        int inicioGrupo = Carta[0].getNombre().ordinal();
        int finGrupo = inicioGrupo;

        for (int i = 1; i < Carta.length; i++) {
            if (Carta[i].getNombre().ordinal() == finGrupo + 1) {
                finGrupo = Carta[i].getNombre().ordinal();
            } else {
                gruposConsecutivos[numGrupos][0] = inicioGrupo;
                gruposConsecutivos[numGrupos][1] = finGrupo;
                numGrupos++;

                inicioGrupo = finGrupo = Carta[i].getNombre().ordinal();
            }
        }

        gruposConsecutivos[numGrupos][0] = inicioGrupo;
        gruposConsecutivos[numGrupos][1] = finGrupo;
        numGrupos++;

        
        int[][] resultado = new int[numGrupos][2];
        for (int i = 0; i < numGrupos; i++) {
            resultado[i][0] = gruposConsecutivos[i][0];
            resultado[i][1] = gruposConsecutivos[i][1];
        }

        return resultado;
    }

    public static String mostrarNumerosConsecutivos(int[][] grupos, Pinta pinta) {
        String resultado = "";
        NombreCarta[] nombres = NombreCarta.values(); // Obtener todos los nombres de las Carta
        
        for (int[] grupo : grupos) {
            int inicio = grupo[0] + 1;
            int fin = grupo[1] + 1;
            // Verificar si inicio y fin son diferentes
            if (inicio != fin) {
                resultado += "ESCALERA DE " + pinta + ": ";

                // Mostrar todos los números en el rango
                for (int num = inicio; num <= fin; num++) {
                    resultado += nombres[num - 1];
                    if (num < fin) {
                        resultado += ", ";
                    }
                }

                resultado += "\n";
            }
        }
        return resultado;
    }

    public static int[] obtenerNumerosConsecutivos(int[][] grupos) {
        int[] numerosConsecutivos = new int[grupos.length * 10]; // Tamaño inicial
        int resultadoIndex = 0;

        for (int[] grupo : grupos) {
            int inicio = grupo[0] + 1;
            int fin = grupo[1] + 1;
            
            if (inicio != fin) {
                for (int num = inicio; num <= fin; num++) {
                    if (resultadoIndex == numerosConsecutivos.length) {
                        
                        int[] nuevoArreglo = new int[numerosConsecutivos.length * 2];
                        for (int j = 0; j < numerosConsecutivos.length; j++) {
                            nuevoArreglo[j] = numerosConsecutivos[j];
                        }
                        numerosConsecutivos = nuevoArreglo;
                    }
                    numerosConsecutivos[resultadoIndex++] = num;
                }
            }
        }

        
        int[] resultado = new int[resultadoIndex];
        for (int i = 0; i < resultadoIndex; i++) {
            resultado[i] = numerosConsecutivos[i];
        }

        return resultado;
    }

    public static void marcarNumerosConsecutivos(int[] numerosConsecutivos, Carta[] Carta, Pinta pinta) {

        for (int i = 0; i < numerosConsecutivos.length; i++) {
            int num = numerosConsecutivos[i];

            for (Carta carta : Carta) {
                if (carta.getNombre().ordinal() == (num - 1) && carta.getPinta() == pinta) {
                    carta.setFormaGrupo(true);
                    break; 
                }
            }
        }
    }

    public String mostrarPuntaje(Carta[] Carta) {
        int suma = 0;
        String CartaNoFormaGrupo = "";

        for (Carta carta : Carta) {
            if (!carta.estaEnGrupo()) {
                int ordinal = carta.getNombre().ordinal();
                
                suma += (ordinal == 0 || (ordinal >= 10 && ordinal <= 12)) ? 10 : (ordinal + 1);
                
                if (!CartaNoFormaGrupo.equals("")) {
                    CartaNoFormaGrupo += "\n";
                }
                CartaNoFormaGrupo += carta.getNombre() + " DE " + carta.getPinta();
            }
        }

        // Verifica si todas las Carta forman grupo o no.
        if (CartaNoFormaGrupo.equals("")) {
            return "TODAS LAS CARTAS FORMAN GRUPO SU PUNTAJE ES 0";
        } else {
            return "SU PUNTAJE ES: " + suma 
                    + "\nLAS CARTAS QUE NO FORMAN GURPO SON:" + CartaNoFormaGrupo;
        }
    }
}