package aab1.proyecto;
import java.util.Scanner;
public class AAB1PROYECTO {
    public static void main(String[] args) {
        String Dia = "casa";
        String equipo = "A";
        int numJugador=1;
        int numEqui=0;
        int golequipoA=0;
        int golequipoB=0;
        int posicion;
        int edad, goles;
        System.out.println("LISTA DE JUGADORES POR EQUIPO:");
        System.out.println("------------------------------");
        while (numEqui<2){
            System.out.println("EQUIPO "+equipo);
            System.out.println("|     NOMBRE     |"+"     POSICION     "+"|   EDAD   |"+"   GOLES   |");
            
            while (numJugador<=5){
                edad=(int)(Math.random()*(40-19+1)+19);
                goles=(int)(Math.random()*(9-0+1)+0);
                posicion=(int)(Math.random()*(2-1+1)+1);
                System.out.println("|   Jugador "+equipo+numJugador+"   |    Posicion "+posicion+"    |    "+edad+"    |     "+goles+"     |");
                numJugador++;
                if (equipo.equals("A"))
                    golequipoA=golequipoA+goles;
                else     
                    golequipoB=golequipoB+goles;
            }
            numJugador=1;
            numEqui++;
            equipo="B";
        }
        numEqui=0;
        System.out.println("ESTADISTICAS DEL PARTIDO:");
        System.out.println("-------------------------");
        System.out.println("Goles Equipo A: "+golequipoA);
        System.out.println("Goles Equipo B: "+golequipoB);
        if (golequipoB<golequipoA)
            System.out.println("Equipo ganador: Equipo A");
        else
            if (golequipoB>golequipoA)
                System.out.println("Equipo ganador: Equipo B");
            else{
                System.out.println("Ha terminado como un empate, se recurrira a una ronda de penales");
                System.out.println("Penales:");
                equipo="A";
                while (numEqui<2){
                    System.out.println("Equipo "+equipo);
                    while (numJugador<=5){
                    goles=(int)(Math.random()*(1-0+1)+0);
                    System.out.println("|   Jugador "+equipo+numJugador+"  |     "+goles+"     |");
                    numJugador++;
                    if (equipo.equals("A"))
                    golequipoA=golequipoA+goles;
                    else     
                    golequipoB=golequipoB+goles;
                    }
                numJugador=1;
                numEqui++;
                equipo="B";
                }
        System.out.println("ESTADISTICAS DEL PARTIDO:");
        System.out.println("-------------------------");
        System.out.println("Goles Equipo A: "+golequipoA);
        System.out.println("Goles Equipo B: "+golequipoB);
        if (golequipoB<golequipoA)
            System.out.println("Equipo ganador: Equipo A");
        else
            if (golequipoB>golequipoA)
                System.out.println("Equipo ganador: Equipo B");
            else{
                System.out.println("Se ha entrado a ronda muerte subita");
                goles=0;
                equipo="A";
                while (goles==0){
                    int num=0;
                    goles=(int)(Math.random()*(1-0+1)+0);
                    if (goles<=0){
                        System.out.println("Jugador "+equipo+numJugador+" fallo");
                        if (equipo.equals("A")){
                            equipo="B";
                            if (numJugador>5)
                                numJugador=0;
                                numJugador=numJugador-num;
                        }else{
                            equipo="A";
                            if (numJugador==5)
                                numJugador=0;
                                numJugador++;
                        }
                    }else{
                        System.out.println("Jugador "+equipo+numJugador+" Anoto");
                        System.out.println("El ganador es el equipo A");
                    }
                }
            }
        }    
    }   
}


