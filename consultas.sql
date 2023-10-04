/*  29-09-23  
    Creamos base de datos para el curso de Programacion */


CREATE DATABASE rodados; /*CREATE TABLE (nombre de la base de datos(sin el parentesis))*/
USE rodados; /*cmd para usar la base de datos que creamos*/
CREATE TABLE vehiculos /*cmd que crea la tabla (en minusculas el nombre de la tabla)*/
    (marca varchar(10), /*campo de la tabla*/
    modelo varchar(10), /*campo de la tabla*/
    patente varchar(6), /*campo de la tabla*/
    kilometraje int, /*campo de la tabla*/
    encendido bit); /*campo de la tabla*/

SHOW TABLES; /* Muestra las tablas que hay en nuestra BdD*/
DESCRIBE vehiculos; /* Muestra los campos que existen en nuestra tabla */

CREATE TABLE motos 
    (cilindrada int,
    patente varchar(6));

CREATE TABLE autos
    (cantidad_de_puertas int,
    patente varchar(6));

ALTER TABLE vehiculos ADD PRIMARY KEY (patente); /* cmd para añadirle la llave primaria al campo patente */
ALTER TABLE autos ADD FOREIGN KEY (patente) REFERENCES vehiculos (patente); /* cmd para añadir una llave foranea a la tabla autos */
ALTER TABLE motos ADD FOREIGN KEY (patente) REFERENCES vehiculos (patente); /* cmd para añadir una llave foranea a la tabla motos */


INSERT INTO vehiculos (marca, modelo, patente, kilometraje, encendido) /* cmd para insertar registros a los campos de nuestra tabla vehiculos */
    VALUES
        ('Kawasaki', 'Ninja', 'abc123', 5000, 0),
        ('Ford', 'Falcon', 'bca834', 3299, 0),
        ('Harley', 'Bob', 'cba999', 3223, 0),
        ('Lamborgini', 'Diablo', 'acb982', 3454, 0),
        ('Zanella', 'Patagonia', 'bba311', 4222, 0),
        ('VW', 'Gol', 'aac543', 423, 0);

INSERT INTO autos (cantidad_de_puertas, patente) /* cmd para insertar registros a los campos de nuestra tabla autos */
    VALUES
        (2, 'bca834'),
        (2, 'acb982'),
        (3, 'aac543');

INSERT INTO motos (cilindrada, patente) /* cmd para insertar registros a los campos de nuestra tabla motos */
    VALUES
        (600, 'abc123'),
        (150, 'cba999'),
        (200, 'bba311');


SELECT * FROM vehiculos; /*Muestra todos los registros insertados en nuestra tabla vehiculos*/ 


/* 04-10-23 */

CREATE DATABASE plantel;
USE plantel;

CREATE TABLE jugadores 
    (nombre varchar(30),
    posicion varchar(15),
    altura int,
    velocidad float,
    fuerza int,
    sueldo int);


INSERT INTO jugadores (sueldo, nombre, altura, posicion, velocidad, fuerza)
    VALUES
        (14000, 'Neuer', 192, 'arquero', 2, 8),
        (30000, 'Beckembauer', 190, 'defensor', 5, 10),
        (13000, 'Roberto Carlos', 171, 'defensor', 8, 10),
        (6000, 'Modric', 172, 'mediocampista', 5, 6),
        (2000, 'Pirlo', 175, 'mediocampista', 4, 7),
        (10000, 'Pele', 170, 'delantero', 5, 7),
        (50000, 'Maradona', 180, 'delantero', 7, 7);
        
INSERT INTO jugadores (nombre)
    VALUES
        UPDATE jugadores SET nombre = 'Beckenbauer'WHERE altura = 190 ;

        
        