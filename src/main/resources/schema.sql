-- Eliminar tablas si existen
DROP TABLE IF EXISTS Time_Check;

-- Crear tabla de usuarios
CREATE TABLE Time_Check (
                      time_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      employee_id int NOT NULL,
                      operation_date Date NOT NULL,
                      operation_type varchar(1)
)

