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
        int cantidadBocatasQueso = 0;
        int cantidadEnsaladas = 0;
        int cantidadPatatasJamon = 0;
        int cantidadMagdalenas = 0;
        int cantidadFrankfurts = 0;
        int comidaTotal = 0;
        int cantidadParacetamol = 0;
        int cantidadPorros = 0;

        //POSIBILIDAD DE COMIDA MALA
        int malaSuerte = (int) (Math.random() * 20) + 1;

        //BUCLE - PANTALLA DE MODIFICACION
        boolean modificacion = true;
        while (modificacion) {

            //PANTALLA INICIAL
            System.out.print("¡Bienvenido! ¿Como quieres que se llame tu mascota? ");
            nombre = sc.next();
            System.out.println("¿Que aspecto quieres que tenga tu mascota? (Para escoger el aspecto introduce el numero al que corresponde el emoji entre las siguientes opciones): ");
            System.out.print("1.😃 / 2.😛 / 3.🫡 / 4.😎 / 5.😺: (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
            emoji = sc.nextInt();
            if (emoji != 1 && emoji !=2 && emoji !=3 && emoji !=4 && emoji !=5 ) {
                System.out.println("Opción no disponible");
            }
            sc.nextLine();

            //MODIFICACION
            System.out.println("Quieres modificar algo antes de empezar? (Si/No) (INIDCALO ESCRIBIENDO EL NOMBRE DE LA OPCIÓN) ");
            String modificacionRespuesta = sc.next();
            sc.nextLine();
            if (modificacionRespuesta.equals("Si")) {
                continue;
            } else if (modificacionRespuesta.equals("No")) {
                modificacion = false;
            } else {
                System.out.println("Opción no valida. Por favor escoge entre si o no y escribelo correctamente.");
                continue;
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

            System.out.println("¿Que acción quieres realizar " + nombre + "? Jugar / Dormir / Ir al hospital / Ir a la tienda / Ingerir / Ver estado / Salir (INIDCALO ESCRIBIENDO EL NOMBRE DE LA OPCIÓN)");
            String accion = sc.nextLine();

            //JUGAR
            if (accion.equals("Jugar")) {
                System.out.println("¿A que quieres jugar? 1. Piedra papel o tijera / 2. Dados (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                int juego = sc.nextInt();
                sc.nextLine();

                //PIEDRA PAPEL O TIJERA
                if (juego == 1) {
                    String[] opciones = {"piedra", "papel", "tijera"};

                    System.out.print("Elige piedra, papel o tijera (Escribe de manera exacta la opcion que vas a escoger): ");
                    String opcionjugador = sc.next();
                    sc.nextLine();


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
                }

                //DADOS
                if (juego == 2) {
                    int numerorandom1 = rand.nextInt(6) + 1;
                    System.out.println("El rival ha sacado un " + numerorandom1);
                    int numerorandom2 = rand.nextInt(6) + 1;
                    System.out.println("Tu has sacado un " + numerorandom2);
                    if (numerorandom1 > numerorandom2) {
                        System.out.println("Perdiste :(");
                        felicidad -= 1;
                    } else if (numerorandom2 > numerorandom1) {
                        System.out.println("¡Ganaste!");
                        felicidad += 2;
                        dinero += 3;
                        energia -= 2;
                    } else {
                        System.out.println("Empate :/");
                    }
                } else {
                    System.out.println("Opcion no disponible");
                }


                //DORMIR
            } else if (accion.equals("Dormir")) {
                if (malaSuerte == 7) {
                    System.out.println("Has dormido mal");
                    energia -= 3;
                    felicidad -= 2;
                    salud -= 1;
                } else {
                    System.out.println("Has descansado bien");
                    energia += 4;
                    felicidad -= 1;

                }
                energia += 4;
                felicidad -= 1;

                //HOSPITAL
                } else if (accion.equals("Ir al hospital")) {
                if (dinero<5) {
                    System.out.println("No tienes suficiente dinero ❌");
                } else {
                    salud += 5;
                    dinero -= 5;
                }

            //COMPRAR
            } else if (accion.equals("Ir a la tienda")) {
                System.out.println("¿Que quieres comprar? -Comida 😋 (€?) / -Paracetamol 💊 (4€) / -Porro 🚬 (3€) (INIDCALO ESCRIBIENDO EL NOMBRE DE LA OPCIÓN) ");
                String opcionCompra = sc.next();
                sc.nextLine();

                //COMIDA
                if (opcionCompra.equals("Comida")) {
                    System.out.print("Actualmente disponemos de: 1. Bocadillos de queso (2€) / 2. Ensaladas (2€) / 3. Patatas de jamón (1€) / 4. Magdalenas (1€) / 5. Frankfurts (3€) - ¿Que deseas comprar? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                    int compraComida = sc.nextInt();

                    if (compraComida == 1) {
                        System.out.print("¿Cuantos bocadillos de queso deseas comprar? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                        cantidadBocatasQueso = sc.nextInt();
                        sc.nextLine();
                        dineroPagado = 2 * cantidadBocatasQueso;

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
                        sc.nextLine();
                        dineroPagado = 2 * cantidadEnsaladas;

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
                        sc.nextLine();
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
                        sc.nextLine();
                        dineroPagado = cantidadMagdalenas;

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
                        sc.nextLine();
                        dineroPagado = 3 * cantidadFrankfurts;

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

                    comidaTotal += cantidadBocatasQueso + cantidadEnsaladas + cantidadFrankfurts + cantidadMagdalenas + cantidadPatatasJamon;

                } else if (opcionCompra.equals("Paracetamol")) {
                    System.out.println("¿Cuantos paracetamoles quieres comprar? ");
                    cantidadParacetamol = sc.nextInt();
                    sc.nextLine();
                    dineroPagado = 4 * cantidadParacetamol;

                    if (dinero < dineroPagado) {
                        System.out.println("No tienes suficiente dinero ❌");
                    } else {
                        if (cantidadParacetamol == 1) {
                            System.out.println("Has comprado 1 paracetamol ✅");
                        } else {
                            System.out.println("Has comprado " + cantidadParacetamol + " paracetamoles ✅");
                        }
                        dinero -= 4 * cantidadParacetamol;
                    }

                } else if (opcionCompra.equals("Porro")) {
                    System.out.println("¿Cuantos porros quieres comprar? ");
                    cantidadPorros = sc.nextInt();
                    sc.nextLine();
                    dineroPagado = 3 * cantidadPorros;

                    if (dinero < dineroPagado) {
                        System.out.println("No tienes suficiente dinero ❌");
                    } else {
                        if (cantidadPorros == 1) {
                            System.out.println("Has comprado 1 porro ✅");
                        } else {
                            System.out.println("Has comprado " + cantidadPorros + " porros ✅");
                        }
                        dinero -= 3 * cantidadPorros;
                    }
                } else {
                    System.out.println("No tenemos " + opcionCompra + ". Escoga entre las opciones que proporcionamos.");
                }

            //INGERIR
            } else if (accion.equals("Ingerir")) {
                comidaTotal = cantidadBocatasQueso + cantidadEnsaladas + cantidadFrankfurts + cantidadMagdalenas + cantidadPatatasJamon;
                System.out.println("1. Comida (" + comidaTotal + ") / 2. Paracetamol (" + cantidadParacetamol + ") / 3. Porro (" + cantidadPorros + ") - ¿Que quieres ingerir? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                int opcionIngerir = sc.nextInt();
                sc.nextLine();

                if (opcionIngerir == 1) {
                    System.out.println("Esto es lo que tienes disponible: 1. Bocadillos de queso (" + cantidadBocatasQueso + ") / 2. Ensaladas (" + cantidadEnsaladas + ") / " +
                            "3. Patatas de jamón (" + cantidadPatatasJamon + ") / 4. Magdalenas (" + cantidadMagdalenas + ") / 5. Frankfurts (" + cantidadFrankfurts + ") ");

                    System.out.print("¿Que deseas comer? (INDICALO CON EL NUMERO AL QUE PERTENECE LA OPCIÓN) ");
                    int comidaIngerida = sc.nextInt();
                    sc.nextLine();

                    if (comidaIngerida == 1) {
                        if (cantidadBocatasQueso == 0) {
                            System.out.println("No te quedan bocadillos de queso. Compra en la tienda");
                        } else if (cantidadBocatasQueso > 0 && malaSuerte == 16) {
                            System.out.println("Te has comido un bocadillo de queso pero te ha sentado mal🤮");
                            energia -= 2;
                            salud -= 3;
                            felicidad -= 2;
                        } else if (cantidadBocatasQueso > 0) {
                            System.out.println("Te has comido un bocadillo de queso 🥖");
                            hambre += 3;
                            energia -= 1;
                        }
                        cantidadBocatasQueso -= 1;
                        comidaTotal -= 1;

                    } else if (comidaIngerida == 2) {
                        if (cantidadEnsaladas == 0) {
                            System.out.println("No te quedan ensaladas. Compra en la tienda");
                        } else if (cantidadEnsaladas > 0) {
                            System.out.println("Te has comido una ensalada 🥗");
                            hambre += 3;
                            energia -= 1;
                        }
                        cantidadEnsaladas -= 1;
                        comidaTotal -= 1;

                    } else if (comidaIngerida == 3) {
                        if (cantidadPatatasJamon == 0) {
                            System.out.println("No te quedan bolsas de patatas de jamon. Compra en la tienda");
                        } else if (cantidadPatatasJamon > 0 && malaSuerte == 12) {
                            System.out.println("Te has comido una bolsa de patatas de jamon pero te ha sentado mal 🤮");
                            energia -= 2;
                            salud -= 3;
                            felicidad -= 2;
                        } else if (cantidadPatatasJamon > 0) {
                            System.out.println("Te has comido una bolsa de patatas de jamon 🍟");
                            hambre += 3;
                            energia -= 1;
                        }
                        cantidadPatatasJamon -= 1;
                        comidaTotal -= 1;

                    } else if (comidaIngerida == 4) {
                        if (cantidadMagdalenas == 0) {
                            System.out.println("No te quedan magdalenas. Compra en la tienda");
                        } else if (cantidadMagdalenas > 0) {
                            System.out.println("Te has comido una magdalena 🧁");
                            hambre += 3;
                            energia -= 1;
                        }
                        cantidadMagdalenas -= 1;
                        comidaTotal -= 1;

                    } else if (comidaIngerida == 5) {
                        if (cantidadFrankfurts == 0) {
                            System.out.println("No te quedan frankfurts. Compra en la tienda");
                        } else if (cantidadFrankfurts > 0 && malaSuerte == 2) {
                            System.out.println("Te has comido un frankfurt pero te ha sentado mal 🤮");
                            energia -= 2;
                            salud -= 3;
                            felicidad -= 2;
                        } else if (cantidadFrankfurts > 0) {
                            System.out.println("Te has comido un frankfurt 🥖");
                            hambre += 3;
                            energia -= 1;
                        }
                        cantidadFrankfurts -= 1;
                        comidaTotal -= 1;
                    }

                } else if (opcionIngerir == 2) {
                    if (cantidadParacetamol == 0) {
                        System.out.println("No te quedan paracetamoles. Compra en la tienda");
                    } else {
                        System.out.println("Has ingerido un paracetamol 💊");
                        salud += 3;
                        energia += 2;
                    }

                } else if (opcionIngerir == 3) {
                    if (cantidadPorros == 0) {
                        System.out.println("No te quedan porros. Compra en la tienda");
                    } else {
                        System.out.println("Te has fumado un porrillo 🚬");
                        salud -= 2;
                        felicidad += 5;
                    }

                } else {
                    System.out.println("Esa no es una opción valida. ");
                }

            //ESTADO
            } else if (accion.equals("Ver estado")) {

            //SALIR
            } else if (accion.equals("Salir")) {
                System.out.println("Saliendo del juego...");
                seguirJugando = false;

            //SI LA OPCION NO COINCIDE CON NADA
            } else if (!accion.equals("Salir") && !accion.equals("Ver estado") && !accion.equals("Ingerir") && !accion.equals("Ir a la tienda")
                    && !accion.equals("Ir al hospital") && !accion.equals("Dormir") && !accion.equals("Jugar")) {
                System.out.println("La opcion que has elegido no esta entre las posibles. Recuerda escribir de manera exacta el nombre de la opcion que " +
                        "deseas realizar.");
            }

            //DERROTA
            if (energia<=0 || hambre<=0 || felicidad<=0 || salud<=0 || dinero<=0) {
                System.out.println("Estadisticas: Energia🪫 = " + energia + " / Hambre😋 = " + hambre + " / Felicidad😁 = " + felicidad + " / Salud❤️‍🩹 = " + salud + " / Dinero💲 = " + dinero);
                System.out.println("Uno de tus valores se ha quedado a 0 o es menor a 0. La partida ha acabado ❌");
                seguirJugando = false;
            }

            //MAXIMO
            if (hambre > 10) {
                hambre = 10;
            } else if (energia > 10) {
                energia = 10;
            } else if (salud > 10) {
                salud = 10;
            } else if (felicidad > 10) {
                felicidad = 10;
            }
        }
    }
}
