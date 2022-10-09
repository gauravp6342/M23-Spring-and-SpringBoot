package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService 
{
	@Autowired
	private CertificateRepository repo;
	
	//to retrieve all the data of Certificate class
	public List<Certificate>listAll()
	{
		return repo.findAll();
	}
	//insert/create a data
	public void create(Certificate c)
	{
		 repo.save(c);
	}
    //to retrieve a single record
	public Certificate retrieve(Integer cert_id)
	{
		return repo.findById(cert_id).get();
	}
	//to delete a data
	public void delete(Integer cert_id)
	{
		repo.deleteById(cert_id);
	}
}
