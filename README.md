# Ejercicios4y5
Ejercicios 4 y 5 implementados juntos.
Se ha desarrollado una clase java llamada "identidad" (lo que sería la clase usuario), pero al final no hemos hecho uso de la misma,
y la solución del ejercicio 5 seha realizado con un HashMap.

En la carpeta de la parte web se han implementado dos ficheros .jsp y un .html (debido a algún tipo de error, la request no funcionaba 
con html y sí con archivos .jsp, por lo que decidí continuar con los últimos).

en la pagina de acceso, tenemos un login con .jsp y css, que utiliza la función "validar" implementada en HashMap para buscar los pares de clave valor (nombre y contraseña)
con los parameters pasados por los input. Si el usuario se identifica como cualquiera de los tres válidos, se hará un forward a una página de bienvenida .html, que dispondrá 
de dos enlaces a los ejercicios 2 y 3.
Si en cambio, cualquiera de los campos a introducir es null o no corresponde con las credenciales válidas, se llevará al usuario a una página de error de donde aparecerá un 
mensaje y un enlace para cargar la página de acceso otra vez y seguir intentándolo.
