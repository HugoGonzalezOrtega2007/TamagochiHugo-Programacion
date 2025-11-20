# TamagochiHugo Programacion

¿Como jugar?
1. El programa dará la bienvenida al usuario y le pedirá que introduzca un nombre a la mascota junto a un aspecto en forma de emoji.
2. Una vez introducida la introducción, el programa preguntará al usuario si quiere modificar algo. En caso de que si, simplemente hay que escribir "Si" y el programa volverá a preguntar tanto el nombre como el aspecto. En caso contrario, escribiendo "No" el programa iniciará.
3. Una vez inicia el programa, se mostrarán las estadisticas iniciales del Tamagochi (empiezan todas en cinco): Energía, hambre, felicidad, salud y dinero. Luego dejará escoger al usuario si quiere jugar, dormir, ir al hospital, ir a la tienda, ingerir, ver estado o salir del juego. Para escoger la opción que quiera, el usuario deberá escribir el nombre de la opción tal y como se muestra en el programa.

JUGAR:
En este apartado el usuario tiene la posibilidad de jugar tanto a piedra, papel o tijera como a los dados. En caso de ganar en ambos juegos el Tamagochi ganará dos puntos en felicidad y tres en dinero, en caso de perder se le quitarán dos en energía. Si empata no habrá modificaciones.

DORMIR:
Si el usuario escoge esta opción el Tamagochi ganará cuatro puntos de energía pero perderá uno en felicidad. El programa tiene un añadido de que en caso de dormir y pasar una mala noche el tamagochi perderá tres puntos de energia, dos de felicidad y uno de salud.

IR AL HOSPITAL:
Para ejecutar esta opción el usuario necesitará tener como mínimo cinco puntos de dinero. En caso de no tenerlos el programa mostrará un mensaje conforme a que no has podido ir al hospital por falta de dinero. Si el usuario tiene dinero para ir al hospital el tamagochi perderá cinco puntos de dinero pero ganará cinco de salud.

IR A LA TIENDA:
En la tienda el usuario podrá adquirir cosas para ingerir posteriormente. Al escoger esta opción se le preguntará al usuario lo que quiera comprar (comida, paracetamol o porro) y el usuario deberá responder escribiendo el nombre de la opción tal y como pone el programa. Si el usuario escribe una opción inexistente se mostrará este mensaje: "No tenemos ese elemento. Escoga entre las opciones que proporcionamos."

- Comida: Si el usuario ha escogido comprar comida, se le dará a escoger entre bocadillos de queso, ensaladas, patatas de jamón, magdalenas o frankfurts con el respectivo precio de cada elemento. Después de escoger el alimento deseado el programa preguntará cuanta cantidad de ese alimento quiere comprar el usuario. En caso de comprar el alimento se le restará al usuario la cantidad del alimento que haya comprado multiplicado por su precio. En cambio, si el usuario no dispone del suficiente dinero para comprar el elemento el programa mostrará un mensaje conforme a que no se ha podido comprar por falta de dinero.

- Paracetamol o porro: Si el usuario escoge alguna de estas dos opciones, será preguntado por la cantidad que quiere comprar. Si compra el elemento se le restará al usuario la cantidad de lo que quiera comprar multiplicado por su precio. En caso de no tener suficiente dinero el programa mostrará un mensaje conforme a que no has podido comprar por falta de dinero.

INGERIR
En esta sección se le preguntará al usuario lo que quiere ingerir junto a la cantidad que dispone de cada elemento. El usuario empezará con todo en cero y a medida que compre en la tienda se le irán sumando para poder ingerir.

- Comida: Si el usuario decide ingerir comida será preguntado por que comida quiere ingerir junto a la cantidad que dispone de cada alimento. Si escoge algo que no tiene se mostrará el siguiente mensaje: "No te quedan -----. Compra en la tienda. ". Si el usuario si dispone del alimento escogido puede o bien comerlo de manera correcta y a sus estadisticas se le sumará tres puntos en hambre y se le restará uno en energía, pero si le sienta mal la comida (puede ocurrir en los bocadillos de queso, en las patatas de jamón y en los frankfurts) se le restará dos puntos en energía y felicidad y se le restará tres en salud.

- Paracetamol: Si el usuario decide ingerir paracetamol, en caso de disponer de ellos se le sumarán tres puntos en salud y energía. En caso de no disponer de ellos se mostrará un mensaje diciendo que no tiene paracetamol y que compre en la tienda.

- Porro: Si el usuario decide ingerir porro, en caso de disponer de ellos se le sumarán cinco puntos en felicidad y se le restará dos en salud. En caso de no disponer de ellos se mostrará un mensaje diciendo que no tiene porros y que compre en la tienda.

- VER ESTADO:
En este caso, se mostrarán las estadisticas del Tamagochi.

- SALIR:
Si el usuario escoge esta opción el programa mostrará un mensaje diciendo que se está saliendo del juego y el programa acabará.


A S P E C T O S  I M P O R T A N T E S
- En todas las estadísticas menos en dinero el Tamagochi no podrá superar los diez puntos.
- Si una de las estadísticas queda en cero o negativo se mostrará un mensaje diciendo que el usuario ha perdido y se acabará el programa.
