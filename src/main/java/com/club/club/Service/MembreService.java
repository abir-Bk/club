package com.club.club.Service;

import com.club.club.DAO.MembreRepository;
import com.club.club.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService {

    @Autowired
    private MembreRepository memberRepository;

    public List<Membre> getAllMembers() {
        return memberRepository.findAll();
    }

    public Membre getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    public Membre createMember(Membre membre) {
        return memberRepository.save(membre);
    }

    public Membre updateMember(Long id, Membre membre) {
        Membre existingMember = memberRepository.findById(id).orElse(null);
        if (existingMember != null) {
            existingMember.setNom(membre.getNom());
            existingMember.setPrenom(membre.getPrenom());
            existingMember.setCin(membre.getCin());
            existingMember.setPassword(membre.getPassword());
            return memberRepository.save(existingMember);
        }
        return null;
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
