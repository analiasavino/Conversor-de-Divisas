Bienvenido a mi Conversor de Divisas.

Este proyecto fue realizado por mi dentro del marco de la capitación que estoy realizando dentro del Programa One 6ta edición, 
dictado por el excelente equipo de Alura Latam y patrocinado por Oracle. El mismo se esta hecho completamente con java.

DESCRIPCION

El mismo permite realizar la conversión entre 161 monedas circulantes, las operaciones pueden realizarse gracias a la conexión
con ExchangeRate-API: https://www.exchangerate-api.com/. En una primera pantalla presente 6 combinaciones de monedas a convertir, respetando el modelo presentado en el desafio, no obstante se agrego una séptima opción que permite establecer cualquier composicion. En el punto 8 podemos acceder a un historial de las ultimas conversiones realizadas, la novena opcion permite salir del programa.

TEMAS TRABAJADOS.

Temas que se trabajaron en este proyecto fueron. 
Programación orientada o objetos.
Conexion con Apis, procesamiento de archivos Json y su conversion a Gson.
Manejo de excepciones.
Manejo de Listas y Arrays.
Uso de la clase Java.time.

PROXIMOS DESAFIOS Y MEJORAS. 
Primer desafio quiero mejorar la parte del historial permitiendole al usuario poder ordenar la lista de conversiones realizadas, 
en fucion a la fecha y a la monedas utilizadas en las mismas. Por supuesto esta utilidad tendra una limitacion y es que al no estar la aplicacion conectada a una base de datos no hay persistencia de los mismos en el tiempo, sino que son aquellos que se obtienen durante una cesion.

Segundo desafio importante, crear una función que cuando el usuario ingrese mal el código de la moneda a convertir, el programa le avise inmediatamnete suspendiendo el proceso hasta que el usuario lo ingrese correctamente. (Actualmente el programa sigue corriendo pide la segunda moneda de la combinación incluso el monto a converitr y recien luego imprime el mensaje de alerta) Si bien el resultado de la conversion que se obtiene es null, para una mejor experiencia de usuario, lo ideal seria que se imprima solo el alerta de que esta ingresando mal el codigo.

Tercer y ultimo desafio, investigar si existe una API que devuelva la cotización en dolares de las Criptomonedas, y asi poder convertirlas a la moneda de uso legal que el usuario quiera. (esta idea se motiva en la gran cantidad de trabajadores argentinos que hoy trabajan para el exterior y cobran sus salarios por esta via)


DEMOSTRACION

https://www.canva.com/design/DAGG2aHDzdE/Q8-yNiaQBihw2NUeibBbQQ/watch?utm_content=DAGG2aHDzdE&utm_campaign=designshare&utm_medium=link&utm_source=editor

