<h1 align="center">ScreenMatch - Java Streams & API</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java 17">
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.2-green?style=for-the-badge&logo=spring" alt="Spring Boot 3">
  <img src="https://img.shields.io/badge/Status-Finalizado-blue?style=for-the-badge" alt="Status">
</p>

<hr>

<p>¡Bienvenido a <strong>ScreenMatch</strong>! Esta es una aplicación de consola desarrollada en Java que permite explorar datos de series de televisión consumiendo una API externa (OMDb). El proyecto se enfoca en el uso avanzado de la API de Streams, manejo de fechas y limpieza de datos.</p>

<h3><strong>◆ Funcionalidades</strong></h3>
<ul>
  <li><strong>Consumo de API:</strong> Conexión con OMDb para obtener datos reales de series y temporadas.</li>
  <li><strong>Procesamiento de Datos:</strong> Uso de <code>flatMap</code>, <code>filter</code>, <code>map</code> y <code>sorted</code> para manipular listas complejas.</li>
  <li><strong>Top 10 de Episodios:</strong> Algoritmo para filtrar y mostrar los episodios mejor calificados de cualquier serie.</li>
  <li><strong>Búsqueda por Fecha:</strong> Filtrado dinámico de episodios a partir de un año específico usando la Java Time API.</li>
  <li><strong>Debugging con Peek:</strong> Implementación de inspección de flujos para entender la optimización de Java.</li>
</ul>

<h3><strong>◆ Tecnologías Utilizadas</strong></h3>
<ul>
  <li><strong>Java 17+</strong></li>
  <li><strong>Spring Boot 4.0.2</strong> (Inicializador de proyecto)</li>
  <li><strong>Jackson:</strong> Mapeo de JSON a Records de Java.</li>
  <li><strong>OMDb API:</strong> Fuente de datos externa.</li>
</ul>

<h3><strong>◆ Estructura Principal</strong></h3>
<ul>
  <li><strong>Principal.java:</strong> Gestión de interfaz de usuario y lógica de Streams.</li>
  <li><strong>Episodio.java:</strong> Modelo de datos con manejo de excepciones <code>try-catch</code>.</li>
  <li><strong>ConsumoApi.java & ConvierteDatos.java:</strong> Servicios de infraestructura y parsing.</li>
</ul>

<hr>

<p align="center"><i>Este proyecto es parte de la formación en Java de Alura Latam.</i></p>
