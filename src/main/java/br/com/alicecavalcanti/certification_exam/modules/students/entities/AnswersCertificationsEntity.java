package br.com.alicecavalcanti.certification_exam.modules.students.entities;


import java.util.UUID;


import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answers_certifications_students" )
public class AnswersCertificationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "certification_id")
    private UUID certificationId;
    
    @ManyToAny
    @JoinColumn(name = "certification_id", insertable = false, updatable = false)
    private CertificationStudentEntity certificationStudentEntity;

    @Column(name = "student_id")
    private UUID studentId;
    
    @ManyToAny
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;

    @Column(name = "question_Id")
    private UUID questionId;

    @Column(name = "answer_id")
    private UUID answerID;

    @Column(name= "is_correct")
    private boolean isCorrect;

}
