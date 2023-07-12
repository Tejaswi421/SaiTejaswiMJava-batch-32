package com.example.demo.Service;

import com.example.demo.Model.SubmissionForm;
import com.example.demo.Repository.SubmissionFormRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.exceptions.base.MockitoException;

import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class SubmissionServiceImplTest {


    @InjectMocks
    SubmissionServiceImpl submissionService;


    SubmissionForm dto;


    @Mock
    SubmissionFormRepositoryImpl repo;


    public static SubmissionForm getSubmissionForm(String id, String consultantName, String submissionDate, String leadName, int rate, String technology, String vendorName, String salesPersonName ) {
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

    @Test
    public void testGetSubmission(){


        SubmissionForm mockSubmission =getSubmissionForm("123","tejaswi","07/10/2023","kranthi",75,"Java","xyz","neha");

        when(repo.getSubmission("123")).thenReturn(mockSubmission);

        SubmissionForm result = submissionService.getSubmission("123");

        Assertions.assertNotNull(result);
        Assertions.assertEquals("neha",result.getSalesPersonName());
    }

    @Test
    public void testAddSubmission(){
        SubmissionForm mockSubmission = getSubmissionForm("123","tejaswi","07/10/2023","kranthi",75,"Java","xyz","neha");

        when(repo.addSubmission(mockSubmission)).thenReturn(mockSubmission);

        SubmissionForm result = submissionService.addSubmission(mockSubmission);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("neha",result.getSalesPersonName());
    }

    @Test
    public void testDelSubmission(){
        SubmissionForm mockSubmission = getSubmissionForm("123","tejaswi","07/10/2023","kranthi",75,"Java","xyz","neha");

        when(repo.deleteSubmission("tejaswi")).thenReturn(true);

        boolean result = submissionService.deleteSubmission("tejaswi");

        Assertions.assertTrue(result);
    }

    @Test
    public void testUpdateSubmission(){
        SubmissionForm mockSubmission = getSubmissionForm("123","tejaswi","07/10/2023","kranthi",75,"Java","xyz","neha");

        when(repo.updateSubmission(mockSubmission)).thenReturn(mockSubmission);

        SubmissionForm result = submissionService.updateSubmission(mockSubmission);

        Assertions.assertNotNull(result);
    }



}
