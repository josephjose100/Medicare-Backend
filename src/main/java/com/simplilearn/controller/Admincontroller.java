package com.simplilearn.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.simplilearn.model.Medicine;
import com.simplilearn.service.Medicineservice;

@RestController
public class Admincontroller {
	@Autowired
	Medicineservice medicineservice;
	
    @PostMapping(value="/medicine",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE})
	public void addMedicine(@RequestPart("medicine") String medicine,@RequestPart("file") MultipartFile file) throws IOException
	{
    	File file1=new File("/home/joseph/myprojects/"+file.getOriginalFilename()); 
	    file1.createNewFile();
	    
	    try (FileOutputStream fout=new FileOutputStream(file1))
	    {
	      fout.write(file.getBytes());	
	    }
	    catch(Exception exe)
	    {
	    	exe.printStackTrace();
	    }
	    Medicine newMedicine=medicineservice.getJson(medicine);
	    newMedicine.setUrl("/home/joseph/myprojects/"+file.getOriginalFilename());
		medicineservice.addMedicine(newMedicine);
    }
    
    @GetMapping("/medicine")
    public List<Medicine> getAllMedicine()
    {
        return medicineservice.getMedicine();
    }
    
    @DeleteMapping("/medicine/{id}")
    public void deleteMedicine(int id)
    {
    	medicineservice.deleteMedicine(id);
    }
    
    @PostMapping("/enable/{id}/{availability}")
    public void enableDisable(int id,int availability)
    {
    	medicineservice.enableDisableMedicine(id, availability);
    }
}
