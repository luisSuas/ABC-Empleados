package empleado.repository;

import empleado.model.UEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UEmpleadoRepository extends JpaRepository<UEmpleado, String> {
}
