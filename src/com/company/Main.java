package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ejercicio3uf5();

    }



    private static void ejercicio3uf5() throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Estadisticas> estadisticasList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\DANILLERA\\Desktop\\estadistiques.csv."))) {
            String line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] attributes = line.split(",");
                Estadisticas estadisticas = newEstadistica(attributes);
                estadisticasList.add(estadisticas);

            }
        }
        System.out.println(" CONSULTAS LIGA-ACB");
        System.out.println("Que opcion quieres?");
        System.out.println("1.-Equipos con menos de 10 puntos");
        System.out.println("2.-Mostrar Nombres de equipos");
        System.out.println("3.-Mostrar Equipos sin repetir");
        System.out.println("4.-Mostrar Numero MAXIMO de puntos");
        System.out.println("5.-Mostrar Numero MINIMO de puntos");
        System.out.println("6.-Mostrar Numero total de equipos");
        System.out.println("7.-Mostrar equipos ordenados ALFABETICAMENTE");


        int n = scanner.nextInt();
        switch(n) {
            case 1:
                estadisticasList.stream().filter(p -> p.getPoints() < 10).forEach(System.out::println);
                break;
            case 2:
                estadisticasList.stream().map(Estadisticas::getHome_team).forEach(System.out::println);
            break;
            case 3:
                estadisticasList.stream().map(Estadisticas::getHome_team).distinct().forEach(System.out::println);
                break;
            case 4:
                System.out.println(estadisticasList.stream().mapToInt(Estadisticas::getPoints).max());
                break;
            case 5:
                System.out.println(estadisticasList.stream().mapToInt(Estadisticas::getPoints).min());
                break;
            case 6:
                System.out.println(estadisticasList.stream().map(Estadisticas::getMatch_date).count());
                break;
            case 7:
                estadisticasList.stream().map(Estadisticas::getHome_team).sorted().forEach(System.out::println);
            break;
            default:
                // code block
        }

    }

    private static Estadisticas newEstadistica(String[] dato) {
        String home_team = dato[0];
        String match_date = dato[1];
        int player = Integer.parseInt(dato[2]);
        int minutes_played = Integer.parseInt(dato[3]);
        int points = Integer.parseInt(dato[4]);

        return new Estadisticas(home_team, match_date, player, minutes_played, points);
    }
}









