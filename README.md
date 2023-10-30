# Actividad-1
DESARROLLAR UN PROGRAMA DE “INSTRUCCIÓN ASISTIDA POR COMPUTADORA” EN LENGUAJE JAVA
<br>
<br>
El uso de las computadoras en la educación se conoce como instrucción asistida por computadora (CAI). Para esta actividad usted deberá crear un repositorio privado en GitHub y añadir como desarrollador del proyecto al docente; y en este deberá subir un programa de instrucción asistida por computadora que ayude a un estudiante de escuela primaria a que aprenda las operaciones ariméticas básicas; de tal modo que le permita al usuario elegir el nivel de dificultad y el tipo de problema aritmético a estudiar. Este generará preguntas aleatorias del tipo: "¿Cuánto es 6 por 7?" y evaluará las respuestas del usuario, supervisando el rendimiento del estudiante y proporcionando comentarios, tales como:

¡Muy bien!
¡Excelente!
¡Buen trabajo!
¡Sigue así!
o

No. Por favor intenta de nuevo.
Incorrecto. Intenta una vez más.
¡No te rindas!
No. Sigue intentando.
Por otro lado, el programa seguirá funcionando hasta que el estudiante haya respondido correctamente a un total de 10 preguntas; teniendo las siguientes características:

Al inicio, se pedirá al usuario que elija el nivel de dificultad (1 significa que el programa debe usar sólo números de un dígito en los problemas; un nivel 2 significa que el programa debe utilizar números de dos dígitos máximo, y así en lo sucesivo) y el tipo de problema aritmético a estudiar (1 significa problemas de suma solamente, 2 problemas de resta, 3 problemas de multiplicación, 4 problemas de división y 5 significa una mezcla aleatoria de problemas de todos estos tipos).
El programa generará preguntas aleatorias según las especificaciones del usuario, utilizando el objeto SecureRandom para producir los números adecuados de acuerdo al nivel de dificultad seleccionado.
El programa presentará la pregunta al usuario y esperará su respuesta.
Si la respuesta es correcta, el programa seleccionará una respuesta positiva aleatoria de una lista y proporcionará al usuario un comentario de retroalimentación positiva. Luego, el programa generará otra pregunta y continuará el ciclo.
Si la respuesta es incorrecta, el programa seleccionará una respuesta negativa aleatoria de otra lista y proporcionará al usuario un comentario de retroalimentación negativa. El programa permitirá que el usuario vuelva a intentar la misma pregunta varias veces hasta que la respuesta sea correcta. Luego, el programa proporcionará un comentario positivo y generará otra pregunta.
El programa supervisará el rendimiento del estudiante, contando el número de respuestas correctas e incorrectas y calculando el porcentaje de respuestas correctas después de un número determinado de preguntas.
Si el porcentaje de respuestas correctas es menor del 75%, el programa imprimirá un mensaje que sugiere que el estudiante solicite ayuda adicional de su instructor "Por favor pide ayuda adicional a tu instructor". Si el porcentaje de respuestas correctas es del 75% o más, el programa imprimirá un mensaje de felicitación "Felicidades, estás listo para pasar al siguiente nivel!" y reiniciará el programa para permitir que otro estudiante pruebe el programa.
Por cada punto de la tarea que usted vaya completando al desarrollar la actividad (7 en total) usted deberá de realizar un commit en el repositorio de GitHub para evidenciar el avance del proyecto.
Una vez que haya subido el programa finalizado en GitHub usted deberá descargar su proyecto desde esa plataforma en formato zip y subirlo al entorno virtual.
Adicionalmente a este archivo zip, usted deberá subir un archivo pdf con sus nombres completos, su número de cédula y el link hacia el repositorio de GitHub dónde se encuentre alojado el repositorio del trabajo.