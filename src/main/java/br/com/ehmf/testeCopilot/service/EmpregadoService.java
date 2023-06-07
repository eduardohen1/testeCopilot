package br.com.ehmf.testeCopilot.service;

import br.com.ehmf.testeCopilot.model.Empregado;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class EmpregadoService {

    List<Empregado> empregados = new ArrayList<>();

    public EmpregadoService() {
        empregados.add(new Empregado(1, "Ze", "ze@ze.com"));
    }

    //listar todos os empregados
    public List<Empregado> getEmpregados() {
        return empregados;
    }

    //listar empregado por email
    public Empregado getEmpregadoByEmail(String email) {
        return empregados.stream().filter(empregado -> empregado.getEmail().equals(email)).findFirst().orElse(null);
    }

    //listar empregado por id
    public Empregado getEmpregadoById(int id) {
        return empregados.stream().filter(empregado -> empregado.getId() == id).findFirst().orElse(null);
    }

    //adicionar empregado
    public void addEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    //remover empregado
    public void removeEmpregado(int id) {
        empregados.removeIf(empregado -> empregado.getId() == id);
    }

    //atualizar empregado
    public void updateEmpregado(Empregado empregado) {
        Empregado empregadoToUpdate = getEmpregadoById(empregado.getId());
        empregadoToUpdate.setNome(empregado.getNome());
        empregadoToUpdate.setEmail(empregado.getEmail());
    }

}
