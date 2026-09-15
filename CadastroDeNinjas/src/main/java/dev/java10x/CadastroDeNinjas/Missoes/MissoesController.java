package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // Get -- Mandar uma requisisao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissoes() {
        return "missoes listadas com sucesso!";
    }

    // Post -- Mandar uma requisisao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criad com sucesso!";
    }
    // Put -- Mandar uma requisisao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso!";
    }

    // Delete -- Mandar uma requisisao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "missao deletada com sucesso!";
    }
}

