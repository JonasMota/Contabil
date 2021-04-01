package com.digio.contabil.controller;

import com.digio.contabil.entity.Lançamentos;
import com.digio.contabil.repository.ContabilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamentos-contabeis")
public class ContabilController {
    @Autowired
    private ContabilRepository contabilRepository;

    @PutMapping ("/criar")
    public void criar (@RequestBody Lançamentos lançamentos){
        contabilRepository.save(lançamentos);
    }
    @PostMapping ("/amarzenar")
    public void armazenar (@RequestBody Lançamentos lançamentos){
        contabilRepository.save(lançamentos);

    }
    @GetMapping ("/ler")
    public List <Lançamentos> ler (){
        return contabilRepository.findAll();

    }

}
