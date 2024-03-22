package br.com.alicecavalcanti.certification_exam.modules.students.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyHasCertificationDTO {
    private String email;
    private String technology;
}
