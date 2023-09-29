/*  29-09-23  
    Creamos base de datos para el curso de Programacion */


CREATE DATABASE rodados; /*CREATE TABLE (nombre de la base de datos(sin el parentesis));*/
USE rodados; /*cmd para usar la base de datos que creamos*/
CREATE TABLE vehiculos /*cmd que crea la tabla en minusculas el nombre de la tabla*/
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