package com.bessem.demospringapi.controller;

import com.bessem.demospringapi.model.Dragon;
import com.bessem.demospringapi.model.Encyclopedie;
import com.bessem.demospringapi.service.DragonService;
import com.bessem.demospringapi.service.EncyclopedieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class EncyclopedieController {

    private final EncyclopedieService encyclopedieService;

    @PostMapping("admin/encyclopedie")
    public Encyclopedie create(@RequestBody Encyclopedie encyclopedie) {
        return encyclopedieService.creer(encyclopedie);
    }

    @GetMapping({"public/encyclopedie", "user/encyclopedie", "admin/encyclopedie"})
    public List<Encyclopedie> read() {
        return encyclopedieService.lire();
    }

    @PutMapping("admin/encyclopedie/{id}")
    public Encyclopedie update(@PathVariable Long id, @RequestBody Encyclopedie encyclopedie) {
        return encyclopedieService.modifier(id, encyclopedie);
    }

    @DeleteMapping("admin/encyclopedie/{id}")
    public String delete(@PathVariable Long id) {
        return encyclopedieService.supprimer(id);
    }
}
