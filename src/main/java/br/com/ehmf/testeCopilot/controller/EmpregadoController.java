package br.com.ehmf.testeCopilot.controller;

import br.com.ehmf.testeCopilot.model.Empregado;
import br.com.ehmf.testeCopilot.service.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empregado")
public class EmpregadoController {
    private final EmpregadoService empregadoService;

    public EmpregadoController(EmpregadoService empregadoService) {
        this.empregadoService = empregadoService;
    }

    @RequestMapping("/listar")
    public List<Empregado> listar() {
        return empregadoService.getEmpregados();
    }

    @GetMapping("/{id}")
    public Empregado getEmpregadoById(@PathVariable int id) {
        return empregadoService.getEmpregadoById(id);
    }

    @PostMapping("/adicionar")
    public void adicionar(@RequestBody Empregado empregado) {
        empregadoService.addEmpregado(empregado);
    }

}
