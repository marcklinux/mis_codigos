DROP TABLE IF EXISTS cliente;

create table cliente (
id int auto_increment,
nombre varchar(250),
apellido varchar(250),
direccion varchar(100),
dni integer,
fecha date
);

insert into cliente(nombre,apellido,direccion,dni,fecha) values('carlos','mango','calle murua',1245,'2001-10-12'),
('pedro','dominguez','calle murua',12485,'2001-10-12'),
('juan','perez','calle murua',12457,'2001-10-12'),
('marcos','ramon','calle murua',12945,'2001-10-12'),
('alberto','sanchez','calle murua',16245,'2001-10-12'),
('chucho','ramon','calle murua',12545,'2001-10-12'),
('alberto','sanchez','calle murua',16445,'2001-10-12');