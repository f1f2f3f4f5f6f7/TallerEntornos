# TALLER FULLSTACK - LUNCH UIS
Este proyecto fue desarrollado originalmente para la misma materia (Entornos de Programación) (2025-2) y adaptado para cumplir con los requisitos del Taller FullStack.

# OBJETIVO DEL TALLER
Construir una solución FullStack con las siguientes especificaciones técnicas:

* Base de datos NoSQL (MongoDB): Gestión de información hospedada en la nube.
* Backend con Spring Boot: API RESTful que gestiona el CRUD de documentos y autenticación de usuarios.
* Frontend con React: Interfaz de usuario que consume el backend para:

    * Login de usuario
    * CRUD de entidades (Usuarios, Compras, Combos, etc.)

# ARQUITECTURA TECNOLÓGICA
## Backend

* Framework: Spring Boot 3.4.0
* Base de datos: MongoDB Atlas (NoSQL)
* Java: 25
* Dependencias principales:

    * Spring Data MongoDB
    * Spring Boot Web
    * Lombok
    * ZXing (generación de códigos QR)
    * Spring Boot Mail



## Frontend

* Framework: React 18
* Gestión de estado: React Hooks
* HTTP Client: Axios
* Enrutamiento: React Router
* Estilos: CSS + Bootstrap

## Infraestructura

* Contenedores: Docker + Docker Compose
* Proxy reverso: NGINX

# FUNCIONALIDADES IMPLEMENTADAS
## Módulo de Autenticación

* Login de usuarios (Estudiantes y Administradores)
* Gestión de sesiones
* Roles diferenciados

## CRUD de Usuarios

* Crear nuevo usuario
* Consultar usuarios
* Actualizar información
* Eliminar usuarios

## CRUD de Combos (Menús)

* Crear combos saludables
* Listar combos disponibles
* Actualizar información de combos
* Eliminar combos

## Módulo de Compras

* Registrar compras de combos
* Generación automática de códigos QR
* Validación de cupos disponibles
* Restricción de compra única diaria

## Módulo Administrativo

* Gestión de cupos diarios y mensuales
* Asignación de menús por servicio (almuerzo/cena)
* Creación de nuevos menús
* Reportes de ventas

## Sistema de Notificaciones

* Envío de notificaciones por correo electrónico
* Confirmaciones de compra