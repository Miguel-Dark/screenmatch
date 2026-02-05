<h1 align="center">ScreenMatch - Java Streams & API</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java 17">
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.2-green?style=for-the-badge&logo=spring" alt="Spring Boot 4.0.2">
  <img src="https://img.shields.io/badge/Status-Finalizado-blue?style=for-the-badge" alt="Status">
</p>

<hr>

<p>¡Bienvenido a <strong>ScreenMatch</strong>! 🚀 Esta es oficialmente <strong>mi primera aplicación desarrollada con Spring Boot</strong>. Es un proyecto de consola que me permitió dar el salto al framework más utilizado en el mercado, explorando el consumo de datos reales de series de televisión a través de la API de OMDb.</p>

<p>En este desafío, no solo aprendí a conectar mi código con el mundo exterior, sino que también logré dominar el procesamiento avanzado de datos y la lógica de programación moderna en Java.</p>

<h3><strong>◆ Funcionalidades</strong></h3>
<ul>
  <li><strong>Consumo de API:</strong> Conexión con OMDb para obtener datos reales de series y temporadas.</li>
  <li><strong>Procesamiento de Datos:</strong> Uso de <code>flatMap</code>, <code>filter</code>, <code>map</code> y <code>sorted</code> para manipular listas complejas.</li>
  <li><strong>Top 10 de Episodios:</strong> Algoritmo para filtrar y mostrar los episodios mejor calificados de cualquier serie.</li>
  <li><strong>Búsqueda por Fecha:</strong> Filtrado dinámico de episodios a partir de un año específico usando la Java Time API.</li>
  <li><strong>Estadísticas por Temporada:</strong> Generación de métricas (promedios y evaluaciones) que agregan valor a los datos originales de la API.</li>
  <li><strong>Debugging con Peek:</strong> Implementación de inspección de flujos para entender la optimización de Java.</li>
</ul>

<h3><strong>◆ Tecnologías Utilizadas</strong></h3>
<ul>
  <li><strong>Java 17+</strong></li>
  <li><strong>Spring Boot 4.0.2:</strong> Mi primer gran acercamiento a este potente framework.</li>
  <li><strong>Maven:</strong> Mi gestor de dependencias para automatizar la construcción y librerías del proyecto.</li>
  <li><strong>Jackson:</strong> Mapeo de JSON a Records de Java para una conversión de datos eficiente.</li>
  <li><strong>OMDb API:</strong> Fuente de datos externa utilizada para las consultas.</li>
</ul>

<h3><strong>◆ Estructura Principal</strong></h3>
<ul>
  <li><strong>Principal.java:</strong> Gestión de interfaz de usuario y lógica de Streams.</li>
  <li><strong>Modelado de Datos:</strong> Creación de modelos específicos para Series, Temporadas y Episodios.</li>
  <li><strong>Episodio.java:</strong> Modelo de datos con manejo de excepciones <code>try-catch</code>.</li>
  <li><strong>ConsumoApi.java & ConvierteDatos.java:</strong> Servicios de infraestructura y parsing genérico.</li>
</ul>

<hr>

<p align="center">
<strong>Este proyecto es parte de la formación en Java de Alura Latam.</strong><br>
<i>"Transformando líneas de código en soluciones reales."</i>
</p>
