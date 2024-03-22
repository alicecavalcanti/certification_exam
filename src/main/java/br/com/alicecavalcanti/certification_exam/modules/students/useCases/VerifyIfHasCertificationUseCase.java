package br.com.alicecavalcanti.certification_exam.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.alicecavalcanti.certification_exam.modules.students.controllers.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals("alicecavalcanti") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
