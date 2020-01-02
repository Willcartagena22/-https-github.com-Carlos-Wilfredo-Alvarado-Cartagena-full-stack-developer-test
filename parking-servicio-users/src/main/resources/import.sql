INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$0dtlMXuPHLU/DlhOPxaRcOjZwPkWayL//3heFPxOqri/jnJpbcu7O',1, 'Andres', 'Guzman','hugo2@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$zv6pYh3tditAm3v.jl2rcuZ5stfpvYpIiub8AIKUGRtIgWMowlKmG',1, 'John', 'Doe','hugo@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2, 1);