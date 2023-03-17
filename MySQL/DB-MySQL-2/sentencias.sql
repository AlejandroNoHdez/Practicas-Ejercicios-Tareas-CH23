-- Usuarios
INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Zabdiel', 'Diaz', 'Dragomcitos'),
('Felpe', 'Maqueda', 'Chilaquiles Verdes'),
('Fernando', 'Aguilar', 'Carne Asada');

-- Pets
insert into `pets`
(first_name, fav_food, `type`, users_idusers)
values
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo' , 2),
('Pepperoni', 'Huesitos de manzana', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- Filtrar
select * from `pets`
where users_idusers = 3;

-- Consulta Bryan
INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Alejandro', 'Hernandez', 'Lasagna');

insert into `pets`
(first_name, fav_food, `type`, users_idusers)
values
('Niebla', 'Pollo', 'Pug', 4);

-- Consulta Toño
insert into users 
(First_name,Last_name,Fav_food)
values 
('Jose Antonio','Haro Gonzalez','Chimichangas');

insert into pets
(First_name,Last_name,Fav_food,`Type`,Users_idUsers)
values
('Zorrillo','Gamboa','Carne','Doggo',5);

-- Consulta Daniel
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Daniel', 'Guzman', 'Pizza');

INSERT INTO `pets`
(first_name, last_name, `Type`, users_idusers)
VALUES 
('Maya', 'Lobita', 'HUSKY', 6);

-- Consulta Cesar
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Cesar', 'Reyes', 'Carnita Asada');

INSERT INTO `pets`
(first_name, last_name, fav_food, `Type`, users_idusers)
VALUES 
('Max', 'Reyes', 'Carne','Poodle', 7);

-- Consulta Ingrid
INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES 
('Ian', 'Galeana', 'Tacos');

INSERT INTO `pets`
(first_name, `type`, users_idusers)
VALUES 
('Ezequiel', 'Gato', 8);