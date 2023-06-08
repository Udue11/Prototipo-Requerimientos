# Alcance

El alcance de este prototipo es ilustrar cómo funcionará la ventana de cambio de contraseña. El prototipo se enfocará únicamente en esta ventana y no mostrará ninguna funcionalidad fuera de ella. Los campos correspondientes en la ventana serán:

- Campo de correo electrónico.
- Campo de nueva clave.
- Campo de confirmar clave.

Además, se implementarán las siguientes validaciones y mensajes correspondientes a cada campo:

1. Validaciones del campo de "correo electrónico":
   - Se verificará que lo ingresado sea el mismo correo guardado en el código, simulando una consulta a la base de datos.
   - Se comprobará que el formato del correo sea válido, siguiendo el patrón de correo electrónico será: "\*\*\*\*\*\*\*\*@****\*\".

2. Validaciones del campo de "nueva clave":
   - Se verificará que el formato de la contraseña sea correcto.
   - La contraseña debe tener al menos ocho caracteres, una mayúscula, una minúscula y un número.

3. Validaciones de los campos "confirmar clave" y "nueva clave":
   - Se comprobará que los valores ingresados en ambos campos sean iguales.

Es importante mencionar que el prototipo no incluirá aspectos como el envío de correos, la conexión a la base de datos, consultas ni modificaciones en la misma.

Estas validaciones y funcionalidades mencionadas se implementarán únicamente en el prototipo, con el objetivo de ilustrar el funcionamiento de la ventana de cambio de contraseña.
