# 23-2-parcial-b-Abdala-Deustch

docker run -d -p 8090:3306 -e MYSQL_ROOT_PASSWORD=clavesupersecreta -e MYSQL_USER=yms_user -e MYSQL_PASSWORD=yms_clave -e MYSQL_DATABASE=yms mysql

Con ese comando de docker lo que estamos creando es un contenedor de una base de datos MySQL donde el ROOT_PASSWORD es la contraseña predeterminada para MySQL, para luego MYSQL_USER y MYSQL_PASSWORD son las credenciales de usuario para poder acceder, tambien antes de cada MYSQL toca poner un -e para definir las variables de entorno, una vez se ejecuta el comando la tiene entrada para poder ejecutar el build para la verificacion del coverage de Jacoco.
