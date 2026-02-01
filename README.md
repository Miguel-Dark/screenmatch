ScreenMatch - Java Streams & API
¡Bienvenido a ScreenMatch! Esta es una aplicación de consola desarrollada en Java que permite explorar datos de series de televisión consumiendo una API externa (OMDb). El proyecto se enfoca en el uso avanzado de la API de Streams, manejo de fechas y limpieza de datos.

Funcionalidades
Consumo de API: Conexión con OMDb para obtener datos reales de series y temporadas.

Procesamiento de Datos: Uso de flatMap, filter, map y sorted para manipular listas complejas.

Top 10 de Episodios: Algoritmo para filtrar y mostrar los episodios mejor calificados de cualquier serie.

Búsqueda por Fecha: Filtrado dinámico de episodios a partir de un año específico usando la Java Time API.
Debugging con Peek: Implementación de inspección de flujos para entender la optimización de Java.

Tecnologías Utilizadas
Java 17+

Spring Boot 3 (Inicializador de proyecto)

Jackson: Para el mapeo de JSON a Records de Java.

OMDb API: Fuente de datos externa.

Estructura Principal
Principal.java: Clase que gestiona el menú y la lógica de los Streams.

Episodio.java: Clase de modelo con constructores personalizados y manejo de excepciones (try-catch).

ConsumoApi.java & ConvierteDatos.java: Servicios para el manejo de la red y el parseo de datos.
