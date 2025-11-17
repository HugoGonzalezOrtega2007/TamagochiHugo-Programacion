import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //VARIABLES DESIGNADAS
        int emoji = 0;
        String nombre = "";
        int energia = 5;
        int hambre = 5;
        int felicidad = 5;
        int salud = 5;
        int dinero = 5;
        int dineroPagado;
        int cantidadBocatasQueso = 1;
        int cantidadEnsaladas = 0;
        int cantidadPatatasJamon = 0;
        int cantidadMagdalenas = 0;
        int cantidadFrankfurts = 0;

        //POSIBILIDAD DE COMIDA MALA
        int comidaMala = (int) (Math.random() * 20) + 1;

        //BUCLE - PAMTALLA DE MODIFICACION
        boolean modificacion = true;
        while (modificacion) {

            //PANTALLA INICIAL
            System.out.print("¡Bienvenido! ¿Como quieres que se llame tu mascota? ");
            nombre = sc.next();
            System.out.println("¿Que aspecto quieres que tenga tu mascota? (Para escoger el aspecto introduce el numero al que corresponde el emoji entre las siguientes opciones): ");
            System.out.print("1.😃 / 2.😛 / 3.🫡 / 4.😎 / 5.😺: (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
            emoji = sc.nextInt();

            //MODIFICACION
            System.out.println("Quieres modificar algo antes de empezar? (Si/No) ");
            String modificacionRespuesta = sc.next();
            if (modificacionRespuesta.equals("Si")) {
                continue;
            } else {
                modificacion = false;
            }
        }

        System.out.println("------------------------------------------------------------");

        if (emoji == 1) {
            System.out.println(nombre + " 😃");
        } else if (emoji == 2) {
            System.out.println(nombre + " 😛");
        } else if (emoji == 3) {
            System.out.println(nombre + " 🫡");
        } else if (emoji == 4) {
            System.out.println(nombre + " 😎");
        } else if (emoji == 5) {
            System.out.println(nombre + " 😺");
        } else {
            System.out.println("Esa opción no esta disponible");
        }

        //BUCLE - JUEGO
        boolean seguirJugando = true;
        while (seguirJugando) {
            System.out.println("Estadisticas: Energia🪫 = " + energia + " / Hambre😋 = " + hambre + " / Felicidad😁 = " + felicidad + " / Salud❤️‍🩹 = " + salud + " / Dinero💲 = " + dinero);

            sc.nextLine();
            System.out.println("¿Que acción quieres realizar " + nombre + "? Jugar / Dormir / Ir al hospital / Ir a la tienda / Dar de comer / Ver estado / Salir (INIDCALO ESCRIBIENDO EL NOMBRE DE LA OPCIÓN)");
            String accion = sc.nextLine();

            //JUGAR
            if (accion.equals("Jugar")) {
                System.out.println("¿A que quieres jugar? 1. Piedra papel o tijera / 2. Dados (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                int juego = sc.nextInt();

                //PIEDRA PAPEL O TIJERA
                String[] opciones = {"piedra", "papel", "tijera"};

                System.out.print("Elige piedra, papel o tijera: ");
                String opcionjugador = sc.next();


                if (!opcionjugador.equals("piedra") && !opcionjugador.equals("papel") && !opcionjugador.equals("tijera")) {
                    System.out.println("Opción no válida.");
                    continue;
                }

                String opcionrival = opciones[rand.nextInt(3)];

                System.out.println("Has elegido sacar " + opcionjugador);
                System.out.println("Tu rival ha elegido sacar " + opcionrival);

                if (opcionjugador.equals(opcionrival)) {
                    System.out.println("¡Empate!");
                } else if ((opcionjugador.equals("piedra") && opcionrival.equals("tijera")) ||
                        (opcionjugador.equals("papel") && opcionrival.equals("piedra")) ||
                        (opcionjugador.equals("tijera") && opcionrival.equals("papel"))) {
                    System.out.println("¡Ganaste!");
                    felicidad += 2;
                    dinero += 3;
                    energia -= 2;
                } else {
                    System.out.println("Perdiste :(");
                    felicidad -= 1;
                }

                //DADOS
                if (juego == 2) {
                    int numerorandom1 = rand.nextInt(6) + 1;
                    System.out.println("El opcionrival ha sacado un " + numerorandom1);
                    int numerorandom2 = rand.nextInt(6) + 1;
                    System.out.println("Tu has sacado un " + numerorandom2);
                    if (numerorandom1>numerorandom2) {
                        System.out.println("Perdiste :(");
                        felicidad -= 1;
                    } else if (numerorandom2>numerorandom1) {
                        System.out.println("¡Ganaste!");
                        felicidad += 2;
                        dinero += 3;
                        energia -= 2;
                    } else {
                        System.out.println("Empate :/");
                    }
                }

            //DORMIR
            } else if (accion.equals("Dormir")) {
                energia += 4;
                felicidad -=1;

            //HOSPITAL
            } else if (accion.equals("Ir al hospital")) {
                salud += 5;
                dinero -= 5;

            //COMPRAR
            } else if (accion.equals("Ir a la tienda")) {
                System.out.println("¿Que quieres comprar? 1. Comida / 2. Juego de mesa / 3. Paracetamol / 4.Porro (INIDCALO ESCRIBIENDO EL NOMBRE DE LA OPCIÓN) ");
                String opcionCompra = sc.next();

                //COMIDA
                if (opcionCompra.equals("Comida")) {
                    System.out.print("Actualmente disponemos de: 1. Bocadillos de queso (2€) / 2. Ensaladas (2€) / 3. Patatas de jamón (1€) / 4. Magdalenas (1€) / 5. Frankfurts (3€) - ¿Que deseas comprar? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                    int compraComida = sc.nextInt();

                    if (compraComida == 1) {
                        System.out.print("¿Cuantos bocadillos de queso deseas comprar? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                        cantidadBocatasQueso = sc.nextInt();
                        dineroPagado = 2*cantidadBocatasQueso;

                        if (dinero < cantidadBocatasQueso * 2) {
                            System.out.println("No tienes suficiente dinero ❌");
                        } else {
                            if (cantidadBocatasQueso == 1) {
                                System.out.println("Has comprado 1 bocadillo de queso ✅");
                            } else {
                                System.out.println("Has comprado " + cantidadBocatasQueso + " bocadillos de queso ✅");
                            }
                            dinero -= cantidadBocatasQueso * 2;
                        }

                    } else if (compraComida == 2) {
                        System.out.print("¿Cuantas ensaladas deseas comprar? (ESCRIBELO CON NUMEROS) ");
                        cantidadEnsaladas = sc.nextInt();
                        dineroPagado = 2*cantidadEnsaladas;

                        if (dinero < cantidadEnsaladas * 2) {
                            System.out.println("No tienes suficiente dinero ❌");
                        } else {
                            if (cantidadEnsaladas == 1) {
                                System.out.println("Has comprado 1 ensalada ✅");
                            } else {
                                System.out.println("Has comprado " + cantidadEnsaladas + " ensaladas ✅");
                            }
                            dinero -= cantidadEnsaladas * 2;
                        }

                    } else if (compraComida == 3) {
                        System.out.print("¿Cuantas bolsas de patatas de jamon deseas comprar? (ESCRIBELO CON NUMEROS) ");
                        cantidadPatatasJamon = sc.nextInt();
                        dineroPagado = cantidadPatatasJamon;

                        if (dinero < cantidadPatatasJamon) {
                            System.out.println("No tienes suficiente dinero ❌");
                        } else {
                            if (cantidadPatatasJamon == 1) {
                                System.out.println("Has comprado 1 bolsa de jamon ✅");
                            } else {
                                System.out.println("Has comprado " + cantidadPatatasJamon + " bolsas de jamon ✅");
                            }
                            dinero -= cantidadPatatasJamon;
                        }

                    } else if (compraComida == 4) {
                        System.out.print("¿Cuantas magdalenas deseas comprar? (ESCRIBELO CON NUMEROS) ");
                        cantidadMagdalenas = sc.nextInt();
                        dineroPagado=cantidadMagdalenas;

                        if (dinero < cantidadMagdalenas) {
                            System.out.println("No tienes suficiente dinero ❌");
                        } else {
                            if (cantidadMagdalenas == 1) {
                                System.out.println("Has comprado 1 magdalena ✅");
                            } else {
                                System.out.println("Has comprado " + cantidadMagdalenas + " magdalenas ✅");
                            }
                            dinero -= cantidadMagdalenas;
                        }

                    } else {
                        System.out.print("¿Cuantos frankfurts deseas comprar? (ESCRIBELO CON NUMEROS) ");
                        cantidadFrankfurts = sc.nextInt();
                        dineroPagado = 3*cantidadFrankfurts;

                        if (dinero < dineroPagado) {
                            System.out.println("No tienes suficiente dinero ❌");
                        } else {
                            if (cantidadFrankfurts == 1) {
                                System.out.println("Has comprado 1 frankfurt ✅");
                            } else {
                                System.out.println("Has comprado " + cantidadFrankfurts + " frankfurts ✅");
                            }
                            dinero -= 3 * cantidadFrankfurts;
                        }
                    }
                }

            //COMER
            } else if (accion.equals("Dar de comer")) {
                System.out.println("Esto es lo que tienes disponible: 1. Bocadillos de queso (" + cantidadBocatasQueso + ") / 2. Ensaladas (" + cantidadEnsaladas + ") / " +
                        "3. Patatas de jamón (" + cantidadPatatasJamon + ") / 4. Magdalenas (" + cantidadMagdalenas + ") / 5. Frankfurts (" + cantidadFrankfurts + ") ");

                System.out.print("¿Que deseas comer? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                int comidaIngerida = sc.nextInt();

                if (comidaIngerida == 1) {
                    if (cantidadBocatasQueso == 0) {
                        System.out.println("No te quedan bocadillos de queso. Compra en la tienda");
                    } else if (cantidadBocatasQueso > 0 && comidaMala > 1) {
                        System.out.println("Te has comido un bocadillo de queso pero te ha sentado mal🤮");
                        energia -= 4;
                        salud -= 3;
                        felicidad -= 1;
                    } else if (cantidadBocatasQueso > 0) {
                        System.out.println("Te has comido un bocadillo de queso 🥖");
                        hambre += 3;
                        energia -= 1;
                    }
                } else if (comidaIngerida == 2) {
                    if (cantidadEnsaladas == 0) {
                        System.out.println("No te quedan ensaladas. Compra en la tienda");
                    } else if (cantidadEnsaladas > 0) {
                        System.out.println("Te has comido una ensalada 🥗");
                        hambre += 3;
                        energia -= 1;
                    }
                } else if (comidaIngerida == 3) {
                    if (cantidadPatatasJamon == 0) {
                        System.out.println("No te quedan bolsas de patatas de jamon. Compra en la tienda");
                    } else if (cantidadPatatasJamon > 0 && comidaMala == 12) {
                        System.out.println("Te has comido una bolsa de patatas de jamon pero te ha sentado mal 🤮");
                        energia -= 3;
                        salud -= 2;
                        felicidad -= 1;
                    } else if (cantidadPatatasJamon > 0) {
                        System.out.println("Te has comido una bolsa de patatas de jamon 🍟");
                        hambre += 3;
                        energia -= 1;
                    }
                } else if (comidaIngerida == 4) {
                    if (cantidadMagdalenas == 0) {
                        System.out.println("No te quedan magdalenas. Compra en la tienda");
                    } else if (cantidadMagdalenas > 0) {
                        System.out.println("Te has comido una magdalena 🧁");
                        hambre += 3;
                        energia -= 1;
                    }
                } else if (comidaIngerida == 5) {
                    if (cantidadFrankfurts == 0) {
                        System.out.println("No te quedan frankfurts. Compra en la tienda");
                    } else if (cantidadFrankfurts > 0 && comidaMala == 2) {
                        System.out.println("Te has comido un frankfurt pero te ha sentado mal 🤮");
                        energia -= 3;
                        salud -= 2;
                        felicidad -= 1;
                    } else if (cantidadFrankfurts > 0) {
                        System.out.println("Te has comido un frankfurt 🥖");
                        hambre += 3;
                        energia -= 1;
                    }
                } else {
                    System.out.println("Esa no es una opción valida. ");
                }

            //ESTADO
            } else if (accion.equals("Ver estado")) {
                System.out.println("Estadisticas: Energia🪫 = " + energia + " / Hambre😋 = " + hambre + " / Felicidad😁 = " + felicidad + " / Salud❤️‍🩹 = " + salud + " / Dinero💲 = " + dinero);

            //SALIR
            } else if (accion.equals("Salir")) {
                seguirJugando = false;
            }
        }
    }
}
