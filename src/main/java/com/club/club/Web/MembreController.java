package com.club.club.Web;

import com.club.club.Event;
import com.club.club.Membre;
import com.club.club.Service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("membreController")
@RequestMapping("/api/members")
public class MembreController {


    @Autowired
    private MembreService membreService;

    @GetMapping
    public List<Membre> getMembers() {
        return membreService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Membre getMemberById(@PathVariable Long id) {
        return membreService.getMemberById(id);
    }

    @PostMapping
    public Membre createMembre(@RequestBody Membre membre) {
        return membreService.createMember(membre);
    }

    @PutMapping("/{id}")
    public Membre updateMembre(@PathVariable Long id, @RequestBody Membre membre) {
        return membreService.updateMember(id, membre);
    }

    @DeleteMapping("/{id}")
    public void deleteMembre(@PathVariable Long id) {
        membreService.deleteMember(id);
    }
}
