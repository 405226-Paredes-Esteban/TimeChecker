-- Eliminar tablas si existen
DROP TABLE IF EXISTS Time_Check;

-- Crear tabla de usuarios
CREATE TABLE Time_Check (
                      time_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      employee_id INT NOT NULL,
                      operation_date DATETIME NOT NULL,
                      operation_type VARCHAR(1)
)

