
package com.example.demo.Controlador;

import com.example.demo.Modelo.Machine;
import com.example.demo.Servicio.MachineServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Daniel
 */

@RestController
@RequestMapping("/api/Machine")

public class MachineControlador {
     @Autowired
    private MachineServicio machineService;
    @GetMapping("/all")
    public List<Machine> getMachines(){
        return machineService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Machine> getMachine(@PathVariable("id") int machineId) {
        return machineService.getMachine(machineId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine machine) {
        return machineService.save(machine);
    }
}
