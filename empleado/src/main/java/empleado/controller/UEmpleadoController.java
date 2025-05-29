package empleado.controller;

import empleado.model.UEmpleado;
import empleado.repository.UEmpleadoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class UEmpleadoController {
    private final UEmpleadoRepository repository;

    public UEmpleadoController(UEmpleadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UEmpleado> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public UEmpleado getById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public UEmpleado create(@RequestBody UEmpleado empleado) {
        return repository.save(empleado);
    }

    @PutMapping("/{id}")
    public UEmpleado update(@PathVariable String id, @RequestBody UEmpleado empleado) {
        empleado.setIdempleado(id);
        return repository.save(empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
