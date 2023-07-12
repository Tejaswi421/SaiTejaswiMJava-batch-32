package com.example.demo.Repository;

import com.example.demo.Model.SubmissionForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubmissionFormRepositoryImplTest {


    SubmissionFormRepositoryImpl repo;
    SubmissionForm dto;

    @BeforeEach
    public void setup(){
        repo= new SubmissionFormRepositoryImpl();
         dto = getSubmissionForm("123","teja","07/10/2023","kranthi",75,"Java","xyz","neha");
        repo.s = new HashMap<String,SubmissionForm>() ;
        repo. s.put(dto.getId(),dto);
    }

    @Test
    public void testGetSubmission() {

       SubmissionForm result = repo.getSubmission("123");
       Assertions.assertNotNull(result);
    }

    @Test
    public void testGetAllSubmission(){

        List< SubmissionForm > result= repo.getAll();

        Assertions.assertNotNull(result);

    }
    @Test
    public void testAddSubmission(){


       SubmissionForm data = getSubmissionForm("1234","teja","07/10/2023","Kranthi",75,"Java","xyz","neha");
        SubmissionForm result=repo.addSubmission(data);
        Assertions.assertNotNull(result);
        Assertions.assertNotEquals(dto.getId(),result.getId());
        Assertions.assertEquals(2,repo.s.size());


    }

    @Test
    public void testUpdateSubmission(){
        SubmissionForm subform = new SubmissionForm("123","Swathi","07/11/2023","kranthi",75,"din","Java","neha");
        SubmissionForm sForm=repo.updateSubmission(subform);
        Assertions.assertNotNull(sForm);
        Assertions.assertNotEquals(dto.getConsultantName(),sForm.getConsultantName());
    }


    @Test
    public void testDeleteSubmission(){


        boolean res=repo.deleteSubmission("123");
        Assertions.assertTrue(res);

    }
    public static SubmissionForm getSubmissionForm(String id, String consultantName,String submissionDate,String leadName,int rate,String technology,String vendorName,String salesPersonName ) {
        SubmissionForm sform = new SubmissionForm();
        sform.setId(id);
        sform.setConsultantName(consultantName);
        sform.setSubmissionDate(submissionDate);
        sform.setLeadName(leadName);
        sform.setRate(rate);
        sform.setTechnology(technology);
        sform.setVendorName(vendorName);
        sform.setSalesPersonName(salesPersonName);

        return sform;
    }

}
