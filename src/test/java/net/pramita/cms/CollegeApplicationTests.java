package net.pramita.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import net.pramita.cms.controller.Studentcontroller;
import net.pramita.cms.dto.Studentdto;
import net.pramita.cms.service.Studentservice;

@ExtendWith(MockitoExtension.class)
class CollegeApplicationTests {

	@InjectMocks
 private Studentcontroller sc;
//
 @Mock
  private Studentservice ss;
//
 @Test
 public void testcreateStudent() {
   Studentdto studentdto = new Studentdto();
   studentdto.setFirstname("Pramita");
   studentdto.setLastname("Sinha");

      when(ss.createStudent(studentdto)).thenReturn(studentdto);

      ResponseEntity<Studentdto> response = sc.createStudent(studentdto);

   
   assertEquals(HttpStatus.CREATED, response.getStatusCode());
   assertEquals(studentdto, response.getBody());
}
 
 @Test
 public void testgetstudentByid() {
   // Create a dummy doctor DTO
   Studentdto studentdto = new Studentdto();
   studentdto.setId(1);
   studentdto.setFirstname("Pramita");
   studentdto.setLastname("Sinha");

      when(ss.getstudentByid(1)).thenReturn(studentdto);

      ResponseEntity<Studentdto> response = sc.getstudentid(1);

   // Verify the response
   assertEquals(HttpStatus.OK, response.getStatusCode());
   assertEquals(studentdto, response.getBody());
}
 
 @Test
 public void testupdatestudent() {
   // Create a dummy doctor DTO
   Studentdto studentdto = new Studentdto();
   studentdto.setId(1);
   studentdto.setFirstname("Pramita");
   studentdto.setLastname("Sinha");


   when(ss.updatestudent(1, studentdto)).thenReturn(studentdto);

   // Call the createDoctor method
   ResponseEntity<Studentdto> response = sc.updatestudent(1, studentdto);

   // Verify the response
   assertEquals(HttpStatus.OK, response.getStatusCode());
   assertEquals(studentdto, response.getBody());
}
 
 @Test
 public void testdeletestudent() {
   
   Studentdto studentdto = new Studentdto();
   studentdto.setId(1);
   studentdto.setFirstname("Pramita");
   studentdto.setLastname("Sinha");

   ss.deletestudent(1);

      ResponseEntity<String> response = sc.deletestudent(1);

      assertEquals(HttpStatus.OK, response.getStatusCode());
}

	
}










 
   
 
    
 