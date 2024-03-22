package br.com.alicecavalcanti.certification_exam.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alicecavalcanti.certification_exam.modules.students.controllers.dto.VerifyHasCertificationDTO;
import br.com.alicecavalcanti.certification_exam.modules.students.useCases.VerifyIfHasCertificationUseCase;


@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO ){
        //email
        //technology
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result){
            return "user já fez a prova";
        }
        return "user pode fazer a prova";
       
    }
}
